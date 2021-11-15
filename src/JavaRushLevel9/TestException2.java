package JavaRush;
/*Перехватить исключение (и вывести его на экран), указав его тип, возникающее
при выполнении кода:
String s = null;
String m = s.toLowerCase();*/
public class TestException2 {
    public static void main(String[] args) {
        //напишите тут ваш код

        String s = null;
        try {


            String m = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println(e.fillInStackTrace());
        }
        //напишите тут ваш код
    }
}
