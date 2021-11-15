package JavaRushLevel5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них
на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них
на экран.*/
public class MinOfFourValue {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int array[] = {a, b, c, d, e};
        for (int i = 0; i < array.length; i++) {
            for (int j = 4; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int middle = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = middle;
                }
            }
        }
        return array[4];
    }
}