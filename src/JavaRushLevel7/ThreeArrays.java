package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
public class ThreeArrays {
    public static void main(String[] args) throws Exception {

        int[] bigArray=new int[20];
        int[] smallArray1=new int[10];
        int[] smallArray2=new int[10];

        for (int i = 0; i <bigArray.length ; i++) {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            bigArray[i]=Integer.parseInt(bf.readLine());

        }

        /* 1 способ копирования
        int[] smallArray1= Arrays.copyOfRange(bigArray,0,10);
        int[] smallArray2=Arrays.copyOfRange(bigArray,10,20);

         */

        //2способ копирования

        for (int i = 0; i <10 ; i++) {
            smallArray1[i]=bigArray[i];

        }
        for (int i = 10; i <bigArray.length ; i++) {
            smallArray2[i-10]=bigArray[i];

        }

        for (int i = 0; i <smallArray2.length ; i++) {
            System.out.println(smallArray2[i]);

        }



    }
}
