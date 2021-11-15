package JavaRushLevel19;

import java.io.*;
import java.util.Scanner;

/*Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод*/
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        // String filename1=bf.readLine();
        //String filename2=bf.readLine();

        Scanner scanner=new Scanner(System.in);
        String filename1=scanner.nextLine();
        String filename2=scanner.nextLine();





        //File file=new File(filename1);

        FileReader fileReader=new FileReader(filename1);
        FileWriter fileWriter=new FileWriter(filename2);

;
      //  char[]chars=new char[(int) file.length()];


        while (fileReader.ready()){
       //  fileReader.read(chars);

        }

        /*
        for (int i = 0; i <file.length() ; i=+2) {
            fileWriter.write(chars[i]);


        }

         */



    }
}
