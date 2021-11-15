package Stream;

import java.io.*;

/*В метод main первым параметром приходит путь к файлу1, вторым - путь к файлу2.
Файл1 содержит слова, разделенные пробелом или переводом строки (в файле может быть несколько строк).
Все, что не относится к пробелу или переводу строки, разделителем не считать.
Записать в одну строку через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура*/
public class WriteLongWords {
    public static void main(String[] args) throws IOException {

        String name1 = "C:/Users/vamoskalev/Documents/java/Новая папка/file1.txt";
        String name2 = "C:/Users/vamoskalev/Documents/java/Новая папка/file2.txt";
        BufferedReader reader = new BufferedReader(new FileReader(name1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(name2));




       // BufferedReader reader=new BufferedReader(new FileReader(args[0]));
      //  BufferedWriter writer=new BufferedWriter(new FileWriter(args[1]));
        String line="";

      while (reader.ready()) {
          String[]strings = reader.readLine().split(" ");;

          for (String chek : strings) {
              // System.out.println(chek);
              //System.out.println(chek.length());
              if (chek.length() > 6) {
                  line += chek + ",";

              }
          }
      }
      line =line.replaceAll(",$", "");//заменяем последнюю запятую на пустое значение
      writer.write(line);










//верный вариант
/*




            String line="";

        while (reader.ready()) {

            String[] strings=  reader.readLine().split(" ");
            for (String chek : strings) {
               // System.out.println(chek);
               // System.out.println(chek.length());

                if (chek.length() > 6) {
                    line+=(chek+",");
                }
                }
            }

        String result=line.replaceAll(",$","");//?замена последней запятой на пустое значение

writer.write(result);
 */

        /*
        while (reader.ready()) {
            String s = reader.readLine();
            String[] strings= s.split(" ");
            for (String chek : strings) {
                System.out.println(chek);
                System.out.println(chek.length());

                if (chek.length() > 6) {
                    writer.write(chek);





                     if ((reader.readLine())!=null) {
                    // if (!(chek == strings[strings.length - 1])) {
                    writer.write(",");
                     }
                //}
                }
            }
        }


         */

        reader.close();
        writer.close();


    }

}