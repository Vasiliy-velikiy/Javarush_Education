package JavaRushLevel17;

import java.util.ArrayList;
import java.util.List;

/*1. Разберись, что и как работает.
2. Создай public static нить SortThread, которая в методе run отсортирует
 статический массив testArray используя метод sort.*/

/*
Нити то отдельные, но работают они с одним объектом, который никак от их работы не защищен. Образно говоря, работая параллельно,
 нити только мешают друг другу - нарасхват и как попало берут значения из уже отсортированных ячеек (отсюда и дубли); какие-то
 значения пропускают/затирают и т.п.
И джойн тут не спасает, потому как стартуют они в некоторой мере одновременно, а джойн начинает выполняться аж после запуска
последней нити.
В общем, где-то здесь было - то ли в обсуждении задачи, то ли в вопросах - аналогию кто-то приводил: нити набрасываются на
 результирующую строку как свора собак, и каждая пытается наперебой ухватить свою часть.
И при этом сортировка не ускоряется в десять раз как на первый взгляд могло бы показаться.


Нити то отдельные, но работают они с одним объектом, который никак от их работы не защищен. Образно говоря, работая параллельно,
 нити только мешают друг другу - нарасхват и как попало берут значения из уже отсортированных ячеек (отсюда и дубли); какие-то
  значения пропускают/затирают и т.п.
И джойн тут не спасает, потому как стартуют они в некоторой мере одновременно, а джойн начинает выполняться аж после запуска
последней нити.
В общем, где-то здесь было - то ли в обсуждении задачи, то ли в вопросах - аналогию кто-то приводил: нити набрасываются на
результирующую строку как свора собак, и каждая пытается наперебой ухватить свою часть.
И при этом сортировка не ускоряется в десять раз как на первый взгляд могло бы показаться*/
public class ThreadsTest {
    public static int threadCount = 10;
    public static int[] testArray = new int[1000];

    static {
        for (int i = 0; i < ThreadsTest.testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuffer expectedResult = new StringBuffer();
        for (int i = 1000 - 1; i >= 0; i--) {
            expectedResult.append(i).append(" ");
        }

        initThreads();

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < testArray.length; i++) {
            result.append(testArray[i]).append(" ");

        }
        System.out.println(result);
        //System.out.println(expectedResult);
        System.out.println((result.toString()).equals(expectedResult.toString()));
    }

    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>(threadCount);
        for (int i = 0; i < threadCount; i++) threads.add(new SortThread());
        for (Thread thread : threads) thread.start();

        for (Thread thread : threads) thread.join();
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }
    public static class SortThread extends Thread{
        @Override
        public void run() {
            sort(testArray);
        }
    }
}
