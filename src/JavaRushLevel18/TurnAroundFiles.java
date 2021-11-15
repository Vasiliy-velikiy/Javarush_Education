package Stream;

import java.io.*;

/*Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.*/
public class TurnAroundFiles {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = bf.readLine();
        String filename2 = bf.readLine();
//поток для чтения первого фалйа(будем менять местами)
        FileInputStream fileInputStream_file1=new FileInputStream(filename1);
//поток для записи первого файла (будем записывать содержмое второго файла перед первым)
        FileOutputStream fileOutputStream_file1=new FileOutputStream(filename2);
//поток для чтения второго файла-ме должны записать содержимое перед первым файлом
        FileInputStream fileInputStream_file2=new FileInputStream(filename2);


        byte[]buff_file1=new byte[fileInputStream_file1.available()];
        byte[]buff_file2=new byte[fileInputStream_file2.available()];

                while(fileInputStream_file1.available()>0){
                    fileInputStream_file1.read(buff_file1);

                }

        while (fileInputStream_file2.available()>0){
            fileInputStream_file2.read(buff_file2);

        }
        while (fileInputStream_file2.available()>0){
            fileOutputStream_file1.write(buff_file2);
            fileOutputStream_file1.write(buff_file1);
        }
        fileInputStream_file1.close();
        fileInputStream_file2.close();
        fileOutputStream_file1.close();



    }

}
