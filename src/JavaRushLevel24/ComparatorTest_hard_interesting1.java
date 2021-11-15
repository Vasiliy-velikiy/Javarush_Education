package JavaRushLevel24;
import java.text.Format;
import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/*
1. В методе sort написать компаратор для Stock:
1.1. Первичная сортировка по name в алфавитном порядке
1.2. Вторичная сортировка по дате без учета часов, минут, секунд (сверху самые новые),
 потом по прибыли от положительных к отрицательным

... open 125,64 and last 126,74 - тут прибыль = 126,74-125,64
... open 125,64 and last 123,43 - тут прибыль = 123,43-125,64

2. Разобраться с *Format-ами и исправить IllegalArgumentException.

Подсказка - это одна строчка.

Пример вывода:
Fake Apple Inc. AAPL | 17-11-2025 open 125,64 and last 123,43
Fake Applied Materials, Inc. AMAT | 15-01-1983 change 0,26
*/

public class ComparatorTest_hard_interesting1 {
    public static void main(String[] args) {
        List<Stock> stocks = getStocks();
        sort(stocks);
        Date actualDate = new Date();
        printStocks(stocks, actualDate);
    }

    public static void printStocks(List<Stock> stocks, Date actualDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");//объект для принятия патерна чтобы выводить нам удобный вывод даты

        double[] filelimits = {0d, actualDate.getTime()};//массив где 1 элемент нолевое значение (ему соотв значение  в массиве change{какое то значение}  ,второй эл.т- время от даты(больше нуля)-ему соответствует "open {какое то значение} and last {какое то значение}"
        String[] filepart = {"change {4}", "open {2} and last {3}"};//массив строк, вфигурных скобках -аргумент из шаблона MessageFormat

        ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);//варианты выбора формата
        Format[] testFormats = {null,null, dateFormat,fileform};//массив который будет форматироваться,(он тесно связан порядком следования с шаблоне MessageFormat-бкркт его паттерн
        MessageFormat pattform = new MessageFormat("{0} {1} | {5} {6}");//шаблон строки, куда в фигурные скобки будут выставлены (аргументы по счету)элементы массива testFormats
        pattform.setFormats(testFormats);//устанавливаем конвертацию формата


        for (Stock stock : stocks) {
            String name = ((String) stock.get("name"));
            String symbol = (String) stock.get("symbol");
            double open = !stock.containsKey("open") ? 0 : ((double) stock.get("open"));
            double last = !stock.containsKey("last") ? 0 : ((double) stock.get("last"));
            double change = !stock.containsKey("change") ? 0 : ((double) stock.get("change"));
            Date date = (Date) stock.get("date");
            Object[] testArgs = {name, symbol, open, last, change, date,date.getTime()}; //
/*Да, аргументов всего 7 в testArgs  - name {0}, symbol {1}, open {2}, last {3}, change {4}, date {5}, date.getTime() {6}.
pattform.format их принимает, применяя к ним testFormats {null, null, dateFormat, fileForm} по паттерну "{0}   {1} | {5} {6}",
поэтому name {0} не форматируется (null), symbol {1} не форматируется (null),
date {5} форматируется по дате (dateFormat), date.getTime() {6} форматируется по формату выборки (fileForm),
 который, в свою очередь, использует оставшиеся 3 аргумента,
  ориентируясь на filepart: пишет "change {4}", если время нулевое, или "open {2} and last {3}", если время больше нуля.*/
            System.out.println(pattform.format(testArgs));
        }
    }

    public static void sort(List<Stock> list) {
        list.sort(new Comparator<Stock>() {
            public int compare(Stock stock1, Stock stock2) {
               String name1=(String) stock1.get("name");
               String name2=(String) stock2.get("name");
                     int result=name1.compareTo(name2);//сравнение двух имен- и расстановка в алфавитном порядке
               if (result==0) {                 //если при сравнении объекты равны, сравниваем дату
                   Date date1 = (Date) stock1.get("date");
                   Date date2 = (Date) stock2.get("date");
                   date1.setHours(0);
                   date1.setMinutes(0);
                   date1.setSeconds(0);
                   date2.setHours(0);
                   date2.setMinutes(0);
                   date2.setSeconds(0);
                        result=date2.compareTo(date1);//сравнение двух дат в порядке убывания
                        if(result==0){              //если даты равны, сравниваем прибыль
                          Double debet1= stock1.containsKey("change")?(double) stock1.get("change"):((double) stock1.get("last")-(double) stock1.get("open"));
                          Double debet2=stock2.containsKey("change")?(double) stock2.get("change"):((double) stock2.get("last")-(double) stock2.get("open"));
                           result=-debet1.compareTo(debet2);//выстраиваем прибыль   от положительных к отрицательным(изначально debet1.compareTo(debet2) нам выстраивает от отрицат к положительным но мы меняем порядок с помощью знака -) и наверно с помощаью такого способа debet2.compareTo(debet1)
                        }

               }

                return result;
            }

        });

    }

    public static class Stock extends HashMap<String, Object> {//класс Stoсk становиться словарем, где для каждого объекта создается словарь с ключем имени поля и значение=значение поля
        public Stock(String name, String symbol, double open, double last) {
            put("name", name);
            put("symbol", symbol);
            put("open", open);
            put("last", last);
            put("date", getRandomDate(2020));
        }

        public Stock(String name, String symbol, double change, Date date) {
            put("name", name);
            put("symbol", symbol);
            put("date", date);
            put("change", change);
        }
    }

    public static List<Stock> getStocks() {
        List<Stock> stocks = new ArrayList<>();

        stocks.add(new Stock("Fake Apple Inc.", "AAPL", 125.64, 123.43));
        stocks.add(new Stock("Fake Cisco Systems, Inc.", "CSCO", 25.84, 26.3));
        stocks.add(new Stock("Fake Google Inc.", "GOOG", 516.2, 512.6));
        stocks.add(new Stock("Fake Intel Corporation", "INTC", 21.36, 21.53));
        stocks.add(new Stock("Fake Level 3 Communications, Inc.", "LVLT", 5.55, 5.54));
        stocks.add(new Stock("Fake Microsoft Corporation", "MSFT", 29.56, 29.72));

        stocks.add(new Stock("Fake Nokia Corporation (ADR)", "NOK", .1, getRandomDate()));
        stocks.add(new Stock("Fake Oracle Corporation", "ORCL", .15, getRandomDate()));
        stocks.add(new Stock("Fake Starbucks Corporation", "SBUX", .03, getRandomDate()));
        stocks.add(new Stock("Fake Yahoo! Inc.", "YHOO", .32, getRandomDate()));
        stocks.add(new Stock("Fake Applied Materials, Inc.", "AMAT", .26, getRandomDate()));
        stocks.add(new Stock("Fake Comcast Corporation", "CMCSA", .5, getRandomDate()));
        stocks.add(new Stock("Fake Sirius Satellite", "SIRI", -.03, getRandomDate()));

        return stocks;
    }

    public static Date getRandomDate() {
        return getRandomDate(1970);
    }

    public static Date getRandomDate(int startYear) {
        int year = startYear + (int) (Math.random() * 30);
        int month = (int) (Math.random() * 12);
        int day = (int) (Math.random() * 28);
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        return calendar.getTime();
    }
}