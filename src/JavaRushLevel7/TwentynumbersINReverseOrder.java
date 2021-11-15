package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.*/
public class TwentynumbersINReverseOrder {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length-1; j > i; j--) {
                int midle;
                if(array[j]>array[j-1]){
                    midle=array[j-1];
                    array[j-1]=array[j];
                    array[j]=midle;

                }

            }

        }
        //напишите тут ваш код
    }

}
