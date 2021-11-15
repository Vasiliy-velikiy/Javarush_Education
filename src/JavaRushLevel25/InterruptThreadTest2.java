package JavaRush;
/*Восстанови логику класса TaskManipulator.*/
public class InterruptThreadTest2 {
    /*
     Output:
     first
     first
     second
     second
     second
     third
     fifth
     */
    public static void main(String[] args) throws InterruptedException {
        CustomThreadManipulator manipulator = new TaskManipulator();

        manipulator.start("first");
        Thread.sleep(150);
        manipulator.stop();

        manipulator.start("second");
        Thread.sleep(250);
        manipulator.stop();

        manipulator.start("third");
        Thread.sleep(50);
        manipulator.stop();

        manipulator.start("forth");
        manipulator.stop();

        manipulator.start("fifth");
        Thread.sleep(1);
        manipulator.stop();
    }
}

 class TaskManipulator implements Runnable ,CustomThreadManipulator {
    Thread thread;
    @Override
    public void run() {
        //Thread currentThread=Thread.currentThread();
       // System.out.println(thread.getName());
   while (!thread.isInterrupted()){
       //System.out.println(thread.getName());
       // while (!currentThread.isInterrupted()){
        try {
            System.out.println(thread.getName());
           // System.out.println(currentThread.getName());
            Thread.sleep(100);

        } catch (InterruptedException e) {

            break;//ошибка была в том что здесь не поставил break;-выход из цикла. Тогда цикл работает бесконечно
        }


    }
    }


     @Override
     public void start(String threadName) {
             thread=new Thread(this,threadName);
             thread.start();



     }

     @Override
     public void stop() {
      thread.interrupt();

     }
 }


interface CustomThreadManipulator {
    public void start(String threadName);

    public void stop();
}