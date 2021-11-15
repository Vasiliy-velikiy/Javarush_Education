package JavaRushLevel9;
/*Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в
нем (количество элементов в списке).
Это же число метод должен выводить на экран.*/
public class DepthStackTrace {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        int count=0;
       StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();

       //можно с циклом
        /*
       for (StackTraceElement s:stackTraceElements){
           //System.out.println(s.getLineNumber());
           count++;
       }

         */

        //или приравнять длину массива stackTraceElements к  счетчику
        count=stackTraceElements.length;
        //напишите тут ваш код
        System.out.println(count);
        return count;
    }
}
