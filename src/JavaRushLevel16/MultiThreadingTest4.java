package JavaRushLevel16;

import java.util.ArrayList;
import java.util.List;

/*В методе main добавить в статический объект list 5 нитей.
 Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.*/
public class MultiThreadingTest4 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
SpecialThread specialThread=new SpecialThread();
SpecialThread specialThread2=new SpecialThread();
SpecialThread specialThread3=new SpecialThread();
SpecialThread specialThread4=new SpecialThread();
SpecialThread specialThread5=new SpecialThread();

Thread thread=new Thread(specialThread);
Thread thread2=new Thread(specialThread2);
Thread thread3=new Thread(specialThread3);
Thread thread4=new Thread(specialThread4);
Thread thread5=new Thread(specialThread5);

thread.start();
thread2.start();
thread3.start();
thread4.start();
thread5.start();


list.add(thread);
list.add(thread2);
list.add(thread3);
list.add(thread4);
list.add(thread5);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
