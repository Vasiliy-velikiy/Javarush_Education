package JavaRushLevel5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
    public static void main(String[] args) {


        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy"); //можно вместо  DateFormat поставить SimpleDateFormat
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
