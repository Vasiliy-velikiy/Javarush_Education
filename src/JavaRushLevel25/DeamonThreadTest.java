package JavaRushLevel25;

public class DeamonThreadTest {
    public static void main(String[] args) {
        Thread testtread=new Thread(new Testtread());

        testtread.start();
        System.out.println("hello i am main thread");
        Thread loggerthread=new Thread(new Deamonthread());
loggerthread.setDaemon(true);
loggerthread.start();

    }
}

class Testtread implements Runnable{
    @Override
    public void run() {
        System.out.println("douther thread");
    }
}

class Deamonthread implements  Runnable{
    @Override
    public void run() {
        System.out.println("i am deamon");
    }
}