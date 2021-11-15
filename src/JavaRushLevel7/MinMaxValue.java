package JavaRushLevel7;
/*Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMaxValue {
    public static void main(String[] args) throws IOException {


        int maximum;
        int minimum;

int[] array=getInts();

Arrays.sort(array);
maximum=array[9];
minimum=array[0];



        /* 2 способ
        List<Integer> list= new ArrayList<Integer>();
        list=Arrays.asList(array);
maximum=  Collections.max(list);
minimum=  Collections.min(list);
        //напишите тут ваш код


         */
        System.out.print(maximum + " " + minimum);
    }
        public static int[] getInts () throws IOException {
            int[] array = new int[10];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < array.length; i++) {
                int a = Integer.parseInt(reader.readLine());
                array[i] = a;

            }


            return array;
        }

        //напишите тут ваш код
    }
