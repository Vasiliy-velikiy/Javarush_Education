package JavaRushLevel19;

import java.io.*;
import java.util.regex.Pattern;

/*Считать с консоли 2 пути к файлам.
Вывести во второй файл все целые числа, которые есть в первом файле (54у не является числом).
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1*/
public class GetIntegerNumberForsecondFile_hard {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String name1=bf.readLine();
        String name2=bf.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(name1));
        BufferedWriter fileWriter=new BufferedWriter(new FileWriter(name2));
        int count=0;

        while (reader.ready()) {
            String[] strings = reader.readLine().split(" ");
            for (String s:strings){
                if (Pattern.matches("[0-9]+",s)){
                   fileWriter.write(s+" ");}
                System.out.println(s);
            }
        }


        bf.close();
        reader.close();
        fileWriter.close();


    }
}
