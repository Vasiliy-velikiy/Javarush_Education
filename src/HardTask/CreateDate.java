package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/
public class CreateDate {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();


Date date=new Date();
//создаем объект с форматом,который будет вводится.
        SimpleDateFormat sourse = new SimpleDateFormat("yyyy-MM-dd");
        //создаем формат который нужен на вывод
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);


        try {
//чтобы месяц был заглавными буквами нужен метод  toUpperCase() который есть только у строки
            //формат который будет выведен. метод форматирования( объект ввода. который берет свои данные из (строки s)
String s123=dateFormat.format(sourse.parse(s));
         System.out.println(s123.toUpperCase());

        } catch (Exception e) {
            System.out.println("Exception " + e);


        }
    }
}



