package JavaRushLevel19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
/*1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно.
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла, считать содержимое файла.
3. Заменить все числа на слова используя словарь map.
4. Результат вывести на экран.
5. Закрыть потоки.

Пример данных в файле:
Это стоит 1 бакс, а вот это - 12.
Переменная имеет имя file1.
110 - это число.

Пример вывода в консоль:
Это стоит один бакс, а вот это - двенадцать.
Переменная имеет имя file1.
110 - это число.*/
public class MapTestReplaceNumbers_hard {

    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");




    }
    public static void main(String[] args) throws IOException, ParseException {
        //String namefile="C:/Users/vamoskalev/Documents/java/Новая папка/file1.txt";
        // BufferedReader reader=new BufferedReader(new FileReader(namefile));



        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String namefile=bf.readLine();
        BufferedReader reader=new BufferedReader(new FileReader(namefile));
        while (reader.ready()){
            // String sq=reader.readLine();
            //String s=sq.replace(".","");
            //System.out.println(s);
            String s=reader.readLine();
            String[]strings=s.split("\\b");


/*
            for (String se:strings){
                System.out.println(se);
            }



 */


            for (int i = 0; i < strings.length ; i++) {
                for (Integer ie:map.keySet()){
                    if (strings[i].equals(Integer.toString(ie))){
                        strings[i]=map.get(ie);

                    }

                }
                strings[i].trim();
            }





            String changestring="";
            for (String se:strings) {
                changestring +=se;

            }
            changestring=changestring.trim();
            // changestring=changestring+".";
            System.out.println(changestring);



        }

        bf.close();
        reader.close();


    }
}
