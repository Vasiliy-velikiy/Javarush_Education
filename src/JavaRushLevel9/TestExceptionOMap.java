package JavaRush;

import java.util.HashMap;
/*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);*/
public class TestExceptionOMap {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
        HashMap<String, String> map = new HashMap<String, String>(null);

            map.put(null, null);
           map.remove(null);
        }
        catch (NullPointerException e){
           System.out.println(e.fillInStackTrace());
        }
        //напишите тут ваш код
    }
}
