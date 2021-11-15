package JavaRush;

/*В классе Solution реализуй интерфейс UncaughtExceptionHandler, который должен:
1. прервать нить, которая бросила исключение.
2. вывести в консоль стек исключений, начиная с самого вложенного.

Пример исключения:
new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")))

Пример вывода:
java.lang.IllegalAccessException: GHI
java.lang.RuntimeException: DEF
java.lang.Exception: ABC*/
public class InterruptThreadTest3 implements Thread.UncaughtExceptionHandler {

    //можно сделать таким вариантом
    /*while(null != (cause = result.getCause())  && (result != cause) )
Но при выводе на экран, очередность шла прямая, а нужно обратную. Поэтому создал
 ArrayList<Throwable> list , в который добавлял list.add(cause);
на каждом шаге цикла. Потом воспользовался Collections.reverse(list);
Самый верхний элемент стека выводится только через String first = ""+e.getClass()
уже отдельно, после цикла. Но в имени выходит слово class, которое нужно убрать. Обработал строку
first.substring(6). В итоге верхний элемент выводится так :
System.out.println(first.substring(6) + ": " + e.getMessage());*/
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
//если у нас 3 исключения
       /* System.out.println(e.getCause().getCause());
        System.out.println(e.getClass().getName() + ":"+e.getMessage());
        System.out.println(e.getCause());*/
//а если больше или меньше?
        recurse(e);
        //рекурсия

    };

    void recurse(Throwable e){
        if (e.getCause()!=null){//условие выхода из рекурсии

        recurse(e.getCause());
        }
        System.out.println(e);

    }

    public static void main(String[] args) {

        new InterruptThreadTest3().uncaughtException(Thread.currentThread(), new Exception("ABC",new RuntimeException("DEF",new IllegalAccessError("GHI"))));
      /*Thread thread=new Thread(){
          @Override
          public void run() {
              throw new Exception("ABC",new RuntimeException("DEF",new IllegalAccessError("GHI")));
          }

      };

        thread.setUncaughtExceptionHandler(new Solution());
        thread.start();*/
    }
}