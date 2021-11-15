package JavaRushLevel14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.*/
public class ExceptionTest {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        exceptions.add(new IOException());
        exceptions.add(new NullPointerException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new ArrayIndexOutOfBoundsException ());
        exceptions.add(new NumberFormatException  ());
        exceptions.add(new ClassCastException ());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IndexOutOfBoundsException ());
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }

}
