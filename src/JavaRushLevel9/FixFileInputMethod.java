package JavaRushLevel9;

import java.io.*;

/*Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.*/
public class FixFileInputMethod {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        //InputStream fileInputStream1 = getInputStream(destinationFileName);
        //InputStream используется для многих вещей, которые вы читаете.
        InputStream fileInputStream = getInputStream(sourceFileName);
        //Класс OutputStream - это абстрактный класс, определяющий байтовый поток вывода.
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
//считываем потоком InputStream 1  файл и выводим этот же файл в путь 2го файла классомOutputStream-тем самым копируя содержимое
        int count = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            //void write(int b) записывает один байт в выходной поток. Аргумент этого
            // метода имеет тип int, что позволяет вызывать write, передавая ему
            // выражение, при этом не нужно выполнять приведение его типа к byte.
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {//cant change
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {//cant change
        return new FileOutputStream(fileName);
    }

}
