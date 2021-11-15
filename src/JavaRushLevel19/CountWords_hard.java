package JavaRushLevel19;

import java.io.*;
import java.util.regex.Pattern;

/*Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.*/
public class CountWords_hard {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String name=bf.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(name));



int count=0;

//1способ
        /*Посдкажите что делает данное регулярное выражение с \p{Punct}
  line = line.replaceAll("\\p{Punct}", "");

  -через \p{} обозначаются символьные классы.

Список классов для Java можно посмотреть в документации к Pattern:

В частности по \p{Punct} в документации написано:


//не доработанный вариант-его валидатор не принимает
  */
        while (reader.ready()) {
            String[] strings = reader.readLine().split(" ");
            for (String s:strings){
                if (Pattern.matches("\\p{Punct}world\\p{Punct}+",s)||Pattern.matches("world",s)||Pattern.matches("world\\p{Punct}++",s)){ // \p{Punct} Знаки пунктуации: Один из !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
                    count++;}
                System.out.println(s);
            }
        }





//2способ
        /*
        String s="";
        while ((s=reader.readLine())!=null){//прекратить цикл если считывание строки будет пустой
            count+=(" "+s+" ").split("\\bworld\\b").length-1;//управляющая последовательность /b-граница слова;length -нужно чтобы в переменную count сложить
            System.out.println(s);
        }




         */


        /*
         while (reader.ready()) {
            String[] strings = reader.readLine().split(" ");
            for (String s:strings){
                if (Pattern.matches("world.",s)||Pattern.matches("world",s)){
                    count++;}
                System.out.println(s);
            }
        }
         */
        System.out.println(count);


            bf.close();
            reader.close();



    }
}