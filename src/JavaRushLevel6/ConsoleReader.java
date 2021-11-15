package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и
возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner)
внутри каждого метода.*/
public class ConsoleReader {
   public static String readString() throws Exception {
       BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
               String s=bf.readLine();
       return s;
   }
    public static int readInt() throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(bf.readLine());
        return i;
    }
    public static  double readDouble() throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        double d=Double.parseDouble(bf.readLine());
        return d;
    }
    public static boolean readBoolean() throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        boolean b=Boolean.parseBoolean(bf.readLine());
        return b;
    }

    public static void main(String[] args) {

    }

}
