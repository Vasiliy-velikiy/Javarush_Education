package JavaRush;
import java.util.ArrayList;
/*Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);*/
public class TestExceptionOfList {
    public static void main(String[] args)  {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        try {
           String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
        }
        //напишите тут ваш код
    }
}
