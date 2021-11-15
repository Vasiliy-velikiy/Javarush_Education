package JavaRushLevel25;

import java.util.Arrays;

/*Обработай список нитей в зависимости от состояния:
1. Если нить еще не запущена, то запусти ее.
2. Если нить в ожидании, то прерви ее.
3. Если нить работает, то проверь маркер isInterrupted.
4. Если нить прекратила работу, то выведи в консоль ее приоритет.
Используй switch.*/
public class ThreadStateTest2 {

    public static void processThreads(Thread... threads) {
        /*for (int i = 0; i <threads.length ; i++) {
            if(threads[i].getState()== Thread.State.NEW) threads[i].start();
            if(threads[i].getState()== Thread.State.WAITING)threads[i].notify();
            if (threads[i].getState()== Thread.State.RUNNABLE) threads[i].isInterrupted();
            if(threads[i].getState()== Thread.State.TERMINATED) System.out.println(threads[i].getPriority());

        }*/

        for (int i = 0; i <threads.length ; i++) {
            switch (threads[i].getState()){
                case NEW:threads[i].start();
                            break;
                case WAITING:threads[i].interrupt();
                          break;
                case TIMED_WAITING:threads[i].interrupt();
                            break;
                case BLOCKED:threads[i].interrupt();
                             break;
                case RUNNABLE:threads[i].isInterrupted();
                            break;
                case TERMINATED:System.out.println(threads[i].getPriority());
            }


        }



        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {
    }
}
