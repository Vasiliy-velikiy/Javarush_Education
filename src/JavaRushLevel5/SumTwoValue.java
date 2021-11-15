package JavaRushLevel5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.*/
public class SumTwoValue {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());

        int sum=a+b;
        System.out.println("Sum = "+sum);
    }
}
