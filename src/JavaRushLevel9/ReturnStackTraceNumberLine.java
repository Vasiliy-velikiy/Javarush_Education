package JavaRushLevel9;
/*Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/
public class ReturnStackTraceNumberLine {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();  /*напишите тут ваш код*/
    }

    public static int method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber(); /*напишите тут ваш код*/
    }

    public static int method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber(); /*напишите тут ваш код*/
    }

    public static int method4() {
        method5();
        //System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        for (StackTraceElement element:stackTraceElements){
            System.out.println(element.getLineNumber());
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();  /*напишите тут ваш код*/
    }

    public static int method5() {

       /*почему[2]?- потому что метод,вызвавший текущий,в стеке будет всегда под номером 2
       структура стека функций(stackTrace)
       [0]-сам метод getStackTrace
       [1]-текущий метод
       ![2]!-метод его вызвавший(который нам и нужен по условию задачи)
       [3]-метод,вызвавший метод из п2
       и тд.
int getLineNumber()-Возвращает номер строки в файле, в которой был вызов метода
если вывести через for-each для каждого метода то мы соберем лестницу вызовов*количество методов

        */
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        for (StackTraceElement element:stackTraceElements){
            System.out.println(element.getLineNumber());
        }
       // System.out.println("БЕЗ for-each ");
       // System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();  /*напишите тут ваш код*/
        }
    }

