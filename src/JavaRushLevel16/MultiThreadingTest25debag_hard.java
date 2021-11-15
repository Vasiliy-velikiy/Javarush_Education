package JavaRushLevel16;
/*Разобраться, что делает программа.

Почитать про UncaughtExceptionHandler - это важно.

Еще раз внимательно посмотреть программу.

Разобраться - продебажить - почему наш OurUncaughtExceptionHandler не срабатывает.

Исправить ошибку, т.е. все должно работать. :)

Ожидаемый результат в произвольном порядке:

Нить 1: My exception message

Нить 2: My exception message*/
public class MultiThreadingTest25debag_hard {
    //создаю интерфейс для перехвата
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();
//Когда поток приближается к завершению из-за неперехваченного исключения, виртуальная машина Java запрашивает у
// потока свой UncaughtExceptionHandler, используя метод uncaughtExceptionThread.getUncaughtExceptionHandler() обработчика ,
// передавая поток и исключение в качестве аргументов. Если поток не имел его UncaughtExceptionHandler явно, то
// его ThreadGroup объект выступает в качестве UncaughtExceptionHandler . Если объект ThreadGroup не имеет особых требований
// для обработки исключения, он может перенаправить вызов обработчику неперехваченных исключений по умолчанию .
    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);


      //решение
        /*Для класса TestedThread создан конструктор в котором выполняется установка setUncaughtExceptionHandler(handler) и,
         может показаться, что этого достаточно. Но далее мы создаем две нити threadA и threadB, передавая им в качестве
         параметра объект класса commonThread. Который при передаче сужается до объекта Runnable(смотря аргументы конструктора
          Thread). Таким образом информация об необходимом обработчике не поступает в конструктор нитей. Для того чтобы
          всетаки установить обработчик, после создания нитей надо явно указать для них обработчики строками
          threadA.setUncaughtExceptionHandler(handler); и threadB.setUncaughtExceptionHandler(handler);*/



        /*Спасибо, ваш комментарий навел на правильные мысли.
Только в данном случае происходит не сужение, а расширение типа (Runnable стоит на вершине иерархии наследования).
Также замечу, что информация об обработчике не поступает в конструктор нитей не по причине расширения типа, а лишь по той
причине, что все три объекта никак между собой не связаны в плане конфигурирования/инициализации - это три отдельные нити.
 А значит нужно либо конфигурировать их все вместе (setDefaultExceptionHandler, причем в правильном месте в коде, а не
 вконструкторе одной отдельной нити), либо каждую нить в отдельности (setExceptionHandler).
Также обратите внимание, что передавая Runnable в конструктор Thread, вы передаете новой нити реализацию метода run()
уже существующего Runnable-объекта. Это означает, что в новую нить будет подставлена существующая реализация метода run()
из объекта-аргумента. Конструктор объекта-аргумента отрабатывает только в момент создания нити данного типа (т.е. только
один раз при создании TestedThread(handler)).
Таким образом, при создании нити на основе существующего Runnable-объекта, конструктор этого объекта не исполняется,
а исполняется конструктор в классе Thread. Передача Runnable-аргумента нужна только для неявного определения метода run()
в создаваемом объекте.
В оригинальной версии данной задачи (т.е. той, которая поставляется нам для решения) изначально сконфигурирована
только одна нить - первая (TestedThread), которая на результат никак не влияет (именно поэтому из конструктора данной
нити можно вообще удалить setUncaughtExceptionHandler(handler), он для решения вообще не нужен, т.к. нить не прерывается
и успешно завершается сама без рейза каким-либо unchecked exceptions).

Итого, в задаче три нити, нам нужно для решения сконфигурировать две последние (threadA, threadB).
Причем конфигурирование должно быть выполнено до запуска нити, а не после. Варианты как это сделать я описал.
Дерзайте)*/
        Thread threadA = new  Thread (commonThread, "Нить 1");
        Thread  threadB = new  Thread (commonThread, "Нить 2");
        //2способ
threadA.setUncaughtExceptionHandler(handler);
threadB.setUncaughtExceptionHandler(handler);
        threadA.start();
        threadB.start();


        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            //1способ
//Thread.setDefaultUncaughtExceptionHandler(handler);
        }




        public void run() {
            try {
                Thread.sleep(3000);
//InterruptedException позволяет прервать поток уже выполняющий блокирующий вызов. В случае, если метод уже выполняется,
// то существует только один способ прервать его выполнение без возврата какого-либо значения и не нарушая при этом его
// контракт, — сгенерировать исключительную ситуацию. В этом случае возвращаемое значение метода просто неопределено.
          //      По сути, InterruptedException сигнализирует о том, что поток просят завершить его работу.
                //      При этом вас не просят немедленно завершить свою работу. Вас просят корректно завершить работу.
                //      На это может понадобится некоторое время. Прерывание потока осуществляется при помощи метода
                //      Thread.interrupt().
//т е когда мы остановили поток threadA.interrupt() произошел перехват исключения блоком catch, а потом выбросилось неперехватываемое исключение с мессенджем
//далее управление переходит перехватичку   UncaughtExceptionHandler, и методу uncaughtException, но перехватичк для двух последних нитей нужно установить самим
 //через setUncaughtExceptionHandler
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");

            }
        }
    }
    //.Обработчик должен относиться к классу, реализующему интерфейс Thread.UncaughtExceptionHandler.
    // Этот интерфейс имеет единственный метод: void uncaughtException(Thread t, Throwable e)

    //Thread.UncaughtExceptionHandler-нтерфейс для обработчиков, вызываемых, когда поток внезапно завершается из-за неперехваченного исключения.
    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        //	uncaughtException(Thread t, Throwable e)
        //Метод, вызываемый, когда данный поток завершается из-за данного неперехваченного исключения.
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " +e.getMessage());
        }
    }
}

