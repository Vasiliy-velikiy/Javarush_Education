package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.

Пример:
words содержит слова А, Б, В (количество слов в списке words может быть любым).

Строки:
В Б А Д //3 слова из words, не подходит
А Б А Д //3 слова из words, не подходит
Д А Д //1 слово из words, не подходит
Д А Б Д //2 слова - подходит, выводим
Д А А Д //2 слова - подходит, выводим*/
public class CountWords_middle {

    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String namefile=bf.readLine();
//String namefile="C:/Users/Василий/Documents/тестовые_документы/2.txt";

        bf.close();//закрываем поток считывания данных с консоли

        BufferedReader reader=new BufferedReader(new FileReader(namefile));

        int  countwords=0;//счетчик совпадения слов
        while (reader.ready()){
            String s=reader.readLine();
            String []strings=s.split(" ");//делим прочтенную строку и всставляем в массив



            //С этим вариантом валидатор принял решение
            /*
         for (String ser:strings){
             for (String l:words){
                 if (l.equals(ser)){
                     countwords++;
                 }
             }
         }





             */



//а с вот этим не принял. НО ВЫВОД ОДИН И ТОТ ЖЕ

            for (int i = 0; i <3 ; i++) {

                for (int j = 0; j < strings.length; j++) {//каждое слово из массива строк сравниваем по содержанию со списком
                    if (strings[j].equals(words.get(i))) {//если находим совпадение, то увеличиваем счетчик
                        countwords++;
                    }
                }
            }


            //эта часть не изменяема для 2хспособов

            if (countwords==2){
                System.out.println(s);
            }
            countwords=0;
        }







        reader.close();//закрываем поток FileReader
    }
}
