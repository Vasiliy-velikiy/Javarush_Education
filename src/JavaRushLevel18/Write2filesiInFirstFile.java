
import java.io.*;

/*Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.*/
public class Write2filesiInFirstFile {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = bf.readLine();
        String filename2 = bf.readLine();
//поток для чтения первого фалйа(будем менять местами)
        FileInputStream fileInputStream_file1=new FileInputStream(filename1);

        //буфер для хранения содержимого 1го файла
        byte[]buff_file1=new byte[fileInputStream_file1.available()];

//считываем содержимое 1го файла
        while(fileInputStream_file1.available()>0){
            fileInputStream_file1.read(buff_file1);

        }
        //поток для записи первого файла (будем записывать содержмое второго файла перед первым)
        FileOutputStream fileOutputStream_file1=new FileOutputStream(filename1);
        //поток для чтения второго файла-ме должны записать содержимое перед первым файлом
        FileInputStream fileInputStream_file2=new FileInputStream(filename2);

//буфер для хранения содержимого 2го файла
        byte[]buff_file2=new byte[fileInputStream_file2.available()];
        //считываем второй файл
        while (fileInputStream_file2.available()>0){
            fileInputStream_file2.read(buff_file2);
            fileOutputStream_file1.write(buff_file2);
            fileOutputStream_file1.write(buff_file1);
        }




     //метод записи буфеа в файл
        //fileOutputStream_file1.write(buff_file1);
        fileInputStream_file1.close();
        fileInputStream_file2.close();
        fileOutputStream_file1.close();
        bf.close();



    }
}
