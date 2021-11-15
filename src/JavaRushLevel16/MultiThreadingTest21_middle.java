package JavaRushLevel16;
/*Разберись, как работает программа.
По образу и подобию CountdownRunnable создай нить CountUpRunnable,
которая выводит значения в нормальном порядке - от 1 до number*/
/*MultiThreadingTest21_middle*/
public class MultiThreadingTest21_middle {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
        Thread.currentThread().sleep(2500);
    }

    public static class CountUpRunnable implements Runnable {

        private int countIndexUp=1;
        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    Thread.sleep(500);//в примере ниже задержка в самом низу, но не вижу разницы если пердвинуть на эту строчку
                    //но так проходит решение в javarush
                    countIndexUp += 1;
                    if (countIndexUp == number+1) return;

                }
            } catch (InterruptedException e) {
            }

        }
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
        //Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = MultiThreadingTest21_middle.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
