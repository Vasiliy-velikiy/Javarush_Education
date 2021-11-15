package JavaRush;

import java.util.TimerTask;

/*Создай свой UncaughtExceptionHandler в виде локального класса внутри конструктора.
UncaughtExceptionHandler должен маскировать звездочками имя трэда и выводить в консоль описание возникшей ошибки.
"Thread-0" должно быть заменено на "********".
"Thread-4321" должно быть заменено на "***********".*/


public class ExceptionHandlerTest2 extends TimerTask {

        protected TimerTask original;
        protected final Thread.UncaughtExceptionHandler handler;

        public ExceptionHandlerTest2(TimerTask original) {
            if (original == null) {
                throw new NullPointerException();
            }
            this.original = original;
            this.handler = new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    StringBuilder s=new StringBuilder();
                    for (int i = 0; i <t.getName().length() ; i++) {
                        s.append("*");
                    }

                    String line=e.getMessage().replaceAll(t.getName(), s.toString());
                    //System.out.println(s.toString()+" "+line);

                    System.out.println(line);//моя ошибка была- нужно вывести только отредактирование e.getMessage()


                }
            };    //init handler here
        original.scheduledExecutionTime();
        }


        public void run() {
            try {
                original.run();
            } catch (Throwable cause) {
                Thread currentThread = Thread.currentThread();
                handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName() + " blah-blah-blah", cause));
            }
        }

        public long scheduledExecutionTime() {
            return original.scheduledExecutionTime();
        }

        public boolean cancel() {
            return original.cancel();
        }

        public static void main(String[] args) {

        /*   Thread thread=new Thread(new Solution(new TimerTask() {
               @Override
               public void run() {
                   System.out.println(Thread.currentThread().getName());
                   System.out.println(5/0);
               }
           }));
           thread.start();*/

        }
    }
