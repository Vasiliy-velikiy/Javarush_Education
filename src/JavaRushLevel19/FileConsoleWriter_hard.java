package JavaRushLevel19;

import java.io.*;

/*Реализуй логику FileConsoleWriter.
Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter.
Класс FileConsoleWriter должен содержать все конструкторы, которые инициализируют fileWriter для записи.
Класс FileConsoleWriter должен содержать пять методов write и один метод close:

public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len) throws IOException
public void write(char[] cbuf) throws IOException
public void close() throws IOException
При записи данных в файл, должен дублировать эти данные на консоль.

Важно: нужно использовать 8-й уровень языка (java language level)!*/
public class FileConsoleWriter_hard { //(для того чтобы правильно прописать методы и коснтрукторы-ставим наследование от FileWriter а потом его убираем
    // наследовать FileWrite не нужно- потому что в конструторе FileConsoleWriter он будет вызывать super()-конструктор суперкласса
    private FileWriter fileWriter;

    public FileConsoleWriter_hard(String fileName) throws IOException {
        this.fileWriter=new FileWriter(fileName);
    }

    public FileConsoleWriter_hard(String fileName, boolean append) throws IOException {
        this.fileWriter=new FileWriter(fileName,append);
    }

    public FileConsoleWriter_hard(File file) throws IOException {
        this.fileWriter=new FileWriter(file);
    }

    public FileConsoleWriter_hard(File file, boolean append) throws IOException {
        this.fileWriter=new FileWriter(file,append);
    }

    public FileConsoleWriter_hard(FileDescriptor fd) {
        this.fileWriter=new FileWriter(fd);
    }

    public static void main(String[] args) {

    }


    public void write(int c) throws IOException {
        //super.write(c);
        fileWriter.write(c);
        System.out.println((char)c);
    }


    public void write(char[] cbuf) throws IOException {
        //super.write(cbuf);
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));

    }


    public void write(char[] cbuf, int off, int len) throws IOException {
      //  super.write(cbuf, off, len);
        fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off, off+len)); //len-это количество элементов, а substring-принимает конечный индекс, поэтому пишем off+len
    }


    public void write(String str) throws IOException {
        //super.write(str);
        fileWriter.write(str);
        System.out.println(str);
    }


    public void write(String str, int off, int len) throws IOException {
        //super.write(str, off, len);
        fileWriter.write(str, off, len);
        System.out.println(new String(str).substring(off, off+len));
    }


    public void close() throws IOException {
        //super.close();
        fileWriter.close();
    }
}
