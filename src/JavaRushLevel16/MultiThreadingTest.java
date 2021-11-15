package JavaRushLevel16;
/*Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread"*/
public class MultiThreadingTest {

        public static void main(String[] args) {
            TestThread task = new TestThread();
            new Thread(task).start();
        }
}

class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println("My first thread");

    }
}
