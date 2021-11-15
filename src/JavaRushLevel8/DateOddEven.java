package JavaRushLevel8;

import java.text.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false*/
public class DateOddEven {

    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
       // System.out.println(isDateOdd("MAY 2 2013"));
       // System.out.println(isDateOdd("MAY 3 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date)throws ParseException {

        //1 способ
        /*
        Date date1=new Date(Date.parse(date));
        //формат даты в днях вместо мечяц день год
        SimpleDateFormat day=new SimpleDateFormat("D");
        //Создаем обьект день который вытаскивает количество дней из даты
         int days=Integer.parseInt(day.format(date1));//format-метод который форматирует значение аргумента в указанный патерн



         */


        //2 способ

        //создаем две даты, текущую  и начало года
                                                                                                                          Date dateend = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH).parse(date);


            Date datestart = new Date();
            datestart.setHours(0);
            datestart.setMinutes(0);
            datestart.setSeconds(0);
            datestart.setYear(dateend.getYear());
            datestart.setDate(0);
            datestart.setMonth(0);

            long between=dateend.getTime()-datestart.getTime();
            long days=1+between/(24* 60 * 60 * 1000);

            System.out.println(days);

            if(days%2==0) {

                return false;
            }
            else {
                return true ;
            }



        }



    }
