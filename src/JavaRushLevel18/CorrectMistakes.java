package JavaRushLevel18;
/*Исправить функциональность в соответствии с требованиями.

Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.

Подсказка:
4 ошибки.*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//исходный вариант
/*
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.read() >= 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.reset();
        outputStream.flush();
    }.*/
public class CorrectMistakes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) {//while здесь не нужен та как мы полностью записываем файл при условии наличия байтов
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];//значит что создается массив размером доступных для файла считывания
            inputStream.read(buffer);
            outputStream.write(buffer);// outputStream.write(buffer, 0, count);   не нужно указывать диапазон потому что копируем одними куском
        }

        inputStream.close();
        outputStream.close();
    }
}
