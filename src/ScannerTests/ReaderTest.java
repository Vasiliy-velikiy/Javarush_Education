package ScannerTests;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class ReaderTest {

    public ReaderTest() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        //String s = "C:/Users/vamoskalev/Documents/java/Новая папка/file1.txt";
        //FileReader fileReader = new FileReader(new File(s));
/*
        while (fileReader.ready()){//boolean ready();-пока есть что считывать в файле будет работать цикл
            Character character=(char)fileReader.read();//int read();-читает один символ и возвращает целочисленое значение закадированного символа, например символ "s"-115
            System.out.print(character);
        }


 *///чтение всего буфера
        /*
        File file=new File(s);
        char[]buff=new char[(int) file.length()];
       fileReader.read(buff);//читаем весь файл целиком

        System.out.println(buff);


        }


         */

    }


    File file=new File("C:/Users/vamoskalev/Documents/java/Новая папка/file14.txt");
   // String s="C:/Users/vamoskalev/Documents/java/Новая папка/file14.txt";
    FileReader fileReader=new FileReader("C:/Users/vamoskalev/Documents/java/Новая папка/file14.txt");
    FileWriter fileWrite=new FileWriter("C:/Users/vamoskalev/Documents/java/Новая папка/file15.txt");
}

