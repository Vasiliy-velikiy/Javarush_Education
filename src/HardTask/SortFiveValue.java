package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17*/
public class SortFiveValue {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int array2[] = sort(a, b, c, d, e);


        int[] myarray = {4, 6, 3, 21, 45, 9, 10};
        int i;

        for (i = 0; i < myarray.length; i++) {
            Arrays.sort(myarray);// автоматически отсортировывает массив по возрастанию
            System.out.print(myarray[i] + " ");
            System.out.println();
        }


       //int binarySearch(int myArray, int fromIndex, int toIndex, int key);



    }

        public static int[] sort ( int a, int b, int c, int d, int e){
            int array[] = {a, b, c, d, e};
            for (int i = 0; i < array.length; i++) {
                for (int j = 4; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int middle = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = middle;
                    }
                }

                System.out.println(array[i]);
            }


            return array;
        }


}

