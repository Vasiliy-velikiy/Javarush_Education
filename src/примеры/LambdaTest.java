package примеры;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bb", "c", "aaa");
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {//прописываем логику сортировки по длине слова
                if (o1.length()>o2.length())
                return 1;
                if (o1.length()<o2.length())return -1;
                return 0;

            }
        });*/

       /* Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());//более локаничная запись реализации которая была вверху

            }
        });*/
       /* Collections.sort(list, (String o1, String o2)-> {//java понимает(С помощаью лямды-> ) что мы в метод sort вторым аргументом передаем компаратор
            if (o1.length()>o2.length())            //который имеет единственный метод compare. И туда передаем аргументы (String o1, String o2)
                return 1;                           //с собственной реализацией
            if (o1.length()<o2.length())return -1;
            return 0;

        });*/
        //более лаконичная запись
        /*Collections.sort(list,(String a1,String a2)-> {
            return Integer.compare(a1.length(),a2.length());
        });*/
        //    как превратить функцию в лямдовыражение?- нужно убрать у метода все модификаторы,тип возвращаемого значения,  имя метода
//    поставить -> и между фигурных скобок прописать логику возвращаемого/или нет значения


//СИНТАКСИЧЕСКИЕ КОНСТРУКЦИИ(упрощение)
        //если в фигурных скобках возвращается одно значение -не нужно слово return и фигурные скобки
//        Collections.sort(list,(String a1,String a2)-> Integer.compare(a1.length(),a2.length())  );
//                мы передаем по сути в метод маленький кусочек кода
//        Collections.sort(list,(String a1,String a2)-> {return 0; }  );//с классическим телом метода
//         Collections.sort(list,(String a1,String a2)->      0 );//можно написать так-но не рекомендуется-потому что нарушается правило написания компаратора
//        АВТОВЫВОД типов- вызывая типизированный  днериком метод -мы знаем типы параметров и нам не нужно их прописывать
//        отсуда следует что слово String(тип)  лишнее- так как list типа String, начинаются автоматические проверки параметров а1 и а2 и их длины в compare
//         Collections.sort(list,( a1, a2)-> Integer.compare(a1.length(),a2.length()) );
//         можно записать через тернарный оператор.
        Collections.sort(list, (a1, a2) -> a1.equals(a2) ? 0 : a1.length() > a2.length() ? 1 : -1);
        System.out.println(list.toString());

/*
лямда состоит из 1/ параметров, 2/ тела,  3/ return
    ()-> "hello";
        или ()->{ return "hello"; }
         в javascript мы могли значение лямбы присвоить какойто переменной например:
  var i=()-> "hello"; Но в java язык не изменяется а расширяется или дополняется- в него невносят зарезервированных слов
чтобы хранить впеременой значение лямды-нам нужен  фунциональный класс-его прулумали , это Consumer


*/


//       var i=()->"hello";//как сохранить в переменной? так?
//       Test2 test2;//есть такой вариант!
//        Consumer<String> i=()->"hello";//среда ругается-потому что Consumer
//          -возвращает void а у нас в примере возврат идет по String. Изменяем на Supplier

//результат лямды мы можем сохранить в переменную типа-спецального класса, в которого есть 1 метод-обычно это функциональные интерфейсы
        Supplier i = () -> "hello"; // Supplier -функциональный интерфейс у которого есть 1 метод
//  лямда связана с функц интерфейсом так как происходит угадывание какой метод будет вызван. Если в интерфейсе 2 метода он уже не функциональный
//  ключ мысль-угадать какой метод может быть вызван можно в том случае если метод один
//        Supplier i=()->"hello";-под капотом создается экземпляр анонимного внутренного класса, реализ функц интерфейс supplier
//        в котором есть предопредел метод get-который возвращает нам   "hello"
//длинная запись
        Supplier<String> i2 = new Supplier<String>() {
            @Override
            public String get() {
                return "hello";
            }
        };



    //еще вариант реализации
    class S implements Supplier<String> {

        @Override
        public String get() {
            return "hello";
        }
    }
        i=new S();
    Supplier supplier=()->new S();
    Function f=(x)->new S();//а это реализауия интерфейса который в аргументах принимает какое то значение и возвоащает какое то значение
//хотим что то передать но без возвращения   Consumer-подходит больше всего(исходник метода accept)
   Consumer f2=(x)-> System.out.println(x);
   Consumer<String>consumer=(x)-> System.out.println(x);
   consumer.accept("11");//через метод accept я передаю аргумент в строчку выше


   Function<String,Integer>function=(x)-> x.length();//принимает строковое значение -возвращает числовое
        System.out.println(function.apply("kjsd"));
        System.out.println( i.get());//у самой лямды нет никакого метода чтобы вывести на экран, но мы обращаемся через функц интерфейс
//можно все хранить в массивах
      Consumer[]consumers={(x)->System.out.println(x),(x)-> System.out.println(x)};
        consumers[0].accept("wdwd");
        consumers[1].accept("aaa");



        //ПРИМЕР С НИТЯМИ
        //у класса Thread()в конструкторе есть функционал интерфейс  Runnable, значит мы можем прописать лямду
        new Thread( () -> {
            System.out.println("is thread");
        } ).start();//ничего не передаем и ничего не возвращаем. значит можем прописать логику вывода на экран

        //пример использования сразу функц интерфейса
        Runnable runnable=()-> System.out.println("start");
        runnable.run();

    }
}
