package JavaRushLevel9;
/*Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace*/
public class ReturnaStacKTrace {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();

        StackTraceElement[]elements=Thread.currentThread().getStackTrace();
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
       // System.out.println(s);
        return s;//напишите тут ваш код
    }

    public static String method2() {
        method3();

        StackTraceElement[]elements=Thread.currentThread().getStackTrace();
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        //System.out.println(s);
        return s;//напишите тут ваш код
    }

    public static String method3() {
        method4();

        StackTraceElement[]elements=Thread.currentThread().getStackTrace();
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        //System.out.println(s);
        return s; //напишите тут ваш код
    }

    public static String method4() {
        method5();

        StackTraceElement[]elements=Thread.currentThread().getStackTrace();
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        //System.out.println(s);
        return s;//напишите тут ваш код
    }

    public static String method5() {
        StackTraceElement[]elements=Thread.currentThread().getStackTrace();
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
       // System.out.println(s);
      return s;  //напишите тут ваш код
    }

}
