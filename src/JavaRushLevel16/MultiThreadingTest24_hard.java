package JavaRushLevel16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить
должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль
сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()*/
public class MultiThreadingTest24_hard {
    public static List<Thread> threads = new ArrayList<>(5);


    public static void main(String[] args) {

    }
    static {
        MyThread1 thread1=new  MyThread1();
        MyThread2 thread2=new  MyThread2();
        MyThread3 thread3=new MyThread3();
        MyThread4 thread4=new MyThread4();
        MyThread5 thread5=new MyThread5();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);

    }

}


 interface Message {
    void showWarning();
}
class MyThread1 extends Thread{

    public void run() {
        while (true) {

        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        while (true) {
            try {
                throw new InterruptedException();

            } catch (Exception e) {
                System.out.println("InterruptedException");
            }
        }
    }
}

class MyThread3 extends Thread{

    public void run() {
        while (true){
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            }
        }

    }

class MyThread4 extends Thread implements Message{
    //почему не принимает с interupted????
    boolean isclose=true;
    public void run() {
while (isclose){

}

    }


    public void showWarning() {
      isclose=false;

    }
}



class MyThread5 extends Thread  {

    public void run() {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try {
            int summ=0;
           while (true) {
               String s = bufferedReader.readLine();
               if (s.equals("N")) break;
               int a=Integer.valueOf(s);
               summ+=a;

           }
            System.out.println(summ);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}