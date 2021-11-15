package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".*/
public class MaxOfTWoValue {


    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max1 = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max1 = a > b ? max1+a : max1+b;

        System.out.println(max1);
    }
}
