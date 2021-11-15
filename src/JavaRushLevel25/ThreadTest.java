package JavaRush;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Родительский поток.");
        for (int i = 1; i <= 5; i++) {


          //  Thread.yield();
        }
        Tester tester=new Tester();
        Tester tester1=new Tester();
        Tester tester2=new Tester();

        tester1.interrupt();
        tester.wait();

        System.out.println(tester.getState());
    }
}


class Tester extends Thread {
    public Tester() {
        this.start();
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing.");

       if (!isInterrupted()){
            System.out.println(Thread.currentThread().getName()+" is interupted");
        }
    /*Thread ct = Thread.currentThread();
        System.out.println("Дочернийпоток - " + ct.getName());
        for(int i = 1; i <= 3; i++) {
            System.out.println("Значение цикла дочернего потока " +
                    ct.getName() +" - " + i);
        }
        System.out.println("Работа дочернего потока завершена - " +
                ct.getName());*/
    }
}