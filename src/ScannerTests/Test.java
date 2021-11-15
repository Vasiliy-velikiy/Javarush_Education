package ScannerTests;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) throws FileNotFoundException {


        //   Scanner scanner = new Scanner(new File("C:/Users/vamoskalev/Documents/java/Новая папка/file1.txt"));//-чтение символов из файла

/*
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());//nextLine()-Перемещает сканер за текущую строку и возвращает ее
        }

 */
        /*
        while (scanner.hasNextLine()){
            System.out.println(scanner.next());//next()-считывает каждый элемент до пробела и выводит- оканчивается исключением когда данные закончились
        }

         */

        Scanner scanner=new Scanner(System.in);//ввод дынных с консоли
        scanner.nextLine();//команда на считывание с консоли


    }
}
