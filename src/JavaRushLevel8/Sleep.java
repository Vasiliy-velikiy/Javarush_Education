package JavaRushLevel8;

import java.util.Date;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {

long i=System.currentTimeMillis();
        Date currentTime1 = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime1.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");
        System.out.println("time currentTime : "+(i-currentTime1.getTime()));
        System.out.println("time new object: "+(i-newTime.getTime()));


        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        //высчитываем сколько осталось милисекунд в разнице между началом эпохи и началом текущего года

        //далее мы хотим найти количество суток, а так как currentTime хранит значение в  милисекундах, нам нужно поделить
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
    }
}