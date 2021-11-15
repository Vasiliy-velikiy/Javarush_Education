package JavaRushLevel9;
/*Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
*/
public class ReturnStackTrace {
    public static void main(String[] args) {
        method1();


    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        return stackTraceElements; //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
       StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        return stackTraceElements;  //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        return stackTraceElements; //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
     return stackTraceElements;   //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {

        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
      return stackTraceElements;   //напишите тут ваш код
    }
}
