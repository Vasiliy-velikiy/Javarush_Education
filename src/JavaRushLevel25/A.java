package JavaRushLevel25;

import jdk.swing.interop.SwingInterOpUtils;

public class   A   implements   Runnable{
    public   void   run(){
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Thread   A   run");

        }
    }

    public   static   void   main(String[]   args){
        System.out.println("Thread   main   started!");
        try{
            Thread   a   =   new   Thread(new   A());
            //a.setDaemon(true);//
            a.start();
            System.out.println(a.isInterrupted());
            Thread.sleep(1);
            a.interrupt();
            System.out.println(a.isInterrupted());
        }   catch(Exception   e){
        }
        System.out.println("Thread   main   ended!");
    }
};