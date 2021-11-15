package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*В метод main первым параметром приходит путь к файлу.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, отбросив дробную часть далее 2 знаков после запятой.
4. Закрыть потоки.*/
public class CountaSpaseAndSymbol {
    public static void main(String[] args) throws IOException {
       // String s = "C:/Users//Василий/Documents/тестовые_документы/1.txt";
       FileInputStream fileInputStream=new FileInputStream(args[0]);
       // FileInputStream fileInputStream=new FileInputStream(s);


        int space=0;
        int symbol=0;
        while (fileInputStream.available()>0){

            symbol++;
            if (fileInputStream.read()==32){
                space++;
            }
        }

       // System.out.println(symbol);
        //System.out.println(space);


        double del=(double)space/(double)symbol*100;
        String se=String.format("%.2f",del);//окрушление числа double до двух знаков после запятой

        System.out.println(se);


        fileInputStream.close();

    }
}
