package JavaRushLevel25;

import jdk.swing.interop.SwingInterOpUtils;

/*
Cоздай класс нити LoggingStateThread, которая будет выводить в консоль все состояния (State) переданной в конструктор нити.
Нить LoggingStateThread должна сама завершаться после остановки переданной в конструктор нити.
Метод main не участвует в тестировании.
*/
public class ThreadStateTest {

    public static void main(String[] args) throws InterruptedException {
       /* Thread target = new Thread();           //наблюдаемая нить
        LoggingStateThread loggingStateThread = new LoggingStateThread(target);  //нить наблюдатель

        loggingStateThread.start(); //NEW
        Thread.sleep(100);              //даем нити наблюдателю поспать
        target.start();  //RUNNABLE
        Thread.sleep(100);
        //TERMINATED   нить переходит в TERMINATED когда она отработала метод run
    }*/
        //есть нить наблюдатель  LoggingStateThread, а есть наблюдаемая нить -target
        Thread target = new Thread();
        LoggingStateThread loggingStateThread = new LoggingStateThread(target);


        System.out.println("Наблюдатемая: " + target.getState());  //мы еще не запустили нить -и она находиться в состоянии  new
        System.out.println("Наблюдатель: " + loggingStateThread.getState());

        System.out.println("");
        System.out.println("loggingStateThread.start()");
        loggingStateThread.start(); //NEW                       //как только  запустили -она переходит в состояние RUNNABLE


        System.out.println("Наблюдатемая: " + target.getState());
        System.out.println("Наблюдатель: " + loggingStateThread.getState());

        System.out.println("");
        System.out.println("Thread.sleep(100);");
        Thread.sleep(100);

        System.out.println("Наблюдатемая: " + target.getState());
        System.out.println("Наблюдатель: " + loggingStateThread.getState());

        System.out.println("");
        System.out.println("target.start();  //RUNNABLE");

        target.start();  //RUNNABLE
        System.out.println("Наблюдатемая 1 : " + target.getState());//быстро из состояния RUNNABLE перейдет в TERMINATED
        Thread.sleep(100);
        System.out.println("Наблюдатемая 2: " + target.getState());

        System.out.println("Наблюдатель: " + loggingStateThread.getState());

        System.out.println("");
        System.out.println("Thread.sleep(100);");
        Thread.sleep(100);

        System.out.println("Наблюдатемая: " + target.getState());
        System.out.println("Наблюдатель: " + loggingStateThread.getState());
    }
}


class LoggingStateThread extends Thread{
Thread thread;

    public LoggingStateThread(Thread target) {
        this.thread=target;

    }

    @Override
    public void run() {
//т.к состояние нити может измениться очень быстро, можно что нибудь упустить
        State state=thread.getState();
        System.out.println(state);
        State state1;
        while (!thread.isInterrupted()){   //пока нить не остановлена(isInterrupted()-возврашает false статус потока, но не прерывает)

            state1=thread.getState();
            if (state!=state1)
                System.out.println(state1);
            state=state1;            // присваиваем первому состоянию -значение другого, чтобы в след сравнение не было повтора (было сравнение с обновленной переменной)
            if (state1==State.TERMINATED) break;
        }


        }
   }


