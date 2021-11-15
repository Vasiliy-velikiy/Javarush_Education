package JavaRushLevel9;

import java.io.*;

/*Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное
вторым именем.Новая задача: Программа вводит два имени файла. И копирует первый файл
на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует,
то программа должна вывести надпись "Файл не существует." и еще один раз прочитать
имя файла с консоли, а уже потом считывать файл для записи.*/
public class FixFileInputMethod2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();


        InputStream fileInputStream=null;
        OutputStream fileOutputStream=null;
        try {

            fileInputStream = getInputStream(sourceFileName);

            }


        catch (Exception e) {

            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();

            fileInputStream = getInputStream(sourceFileName);
        }
        //главная ошибка была в этой строчке. Ввод второго файла должен происходить как только
        //правильно введен 1 файл.

        String destinationFileName = reader.readLine();

        fileOutputStream = getOutputStream(destinationFileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();


    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}