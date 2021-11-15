package Stream;

import java.io.*;
import java.util.Scanner;
/*Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод*/
public class EvenSymbol {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String filename1=bf.readLine();
        String filename2=bf.readLine();

        File file=new File(filename1);

        FileReader fileReader=new FileReader(filename1);
        FileWriter fileWriter=new FileWriter(filename2);

          char[]chars=new char[(int) file.length()];

          fileReader.read(chars);

          //проверка
          for (char i:chars){
              System.out.print(i);

          }


        for (int i = 1; i <chars.length ; i=i+2) {
            fileWriter.write(chars[i]);


        }
        fileReader.close();
        fileWriter.close();
        bf.close();






    }
}
