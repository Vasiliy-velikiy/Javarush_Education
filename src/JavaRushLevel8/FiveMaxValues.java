package JavaRushLevel8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/*Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки*/
public class FiveMaxValues {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
    public static void sort(int[] array) {

        //1способ
       /* Arrays.sort(array);
        int[]array2=array;

        int as=array.length-1;
        for (int i = 0; i <array.length ; i++) {
            array[i]=array2[as];
            as--;

        }

        */

        //2споcоб- массив преобразовать в Integer, и все решается в 1 строчку Arrays.sort(array,Collections.reverseOrder());
//3 способ
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if(array[j]>array[j-1]){
                    int middle=array[j-1];
                    array[j-1]=array[j];
                    array[j]=middle;
                }

                }

        }




        //напишите тут ваш код
    }
}
