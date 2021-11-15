package Stream;

import java.io.*;
import java.util.regex.Pattern;

/*В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.*/
public class WordsWithNumbers {

    public static void main(String[] args) throws IOException {

      //  String name1="C:/Users/Василий/Documents/тестовые_документы/1.txt";
      //  String name2="C:/Users/Василий/Documents/тестовые_документы/2.txt";


        BufferedReader reader=new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer=new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()){
            String s=reader.readLine();
            String[]strings=s.split(" ");
            for (String chek:strings){
/*    регулярные варыжения
       .	Любой символ
       * Ноль (0) или более повторений предшествующего
       \d	Любая цифра (иначе, [0-9])
        +	Одно (1) или более повторений предшествующего

 */
              if(chek.matches(".*\\d+.*") == true)
              {
                  writer.write(chek+" ");
                    System.out.println(chek);
                }
            }
        }





        reader.close();
        writer.close();
    }
}
