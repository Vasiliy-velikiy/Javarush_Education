package JavaRushLevel16;
/*Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.*/
public class MThread_interruptTest2_middle {
    public static   boolean cansel=false;
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);//дает 3 секунд на выполнение метода run
       ourInterruptMethod();
    }

    public static void ourInterruptMethod() {//метод остановки нити
        cansel=true;
    }

    public static class TestThread implements Runnable {

        public void run() {
            while (!cansel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

            }

        }
    }
}
