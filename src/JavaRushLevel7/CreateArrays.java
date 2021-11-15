package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
public class CreateArrays {
    public static void main(String[] args) throws Exception {


        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int array[]=new int[20];
        for (int i = 0; i <array.length ; i++) {
            String s=bf.readLine();
            array[i] = Integer.parseInt(s);

        }// создай и заполни массив
        return array;// в примере стояло return null- это не прапвильно т к данный метод должен возвращать число
        //или массив чисел
    }

    public static int max(int[] array) {

        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max < array[i]) {
                max=array[i];

            }

        }// найди максимальное значение
        return max;//в примере стояло return 0- это не правильно тк метод должен что то делать и результат действия
        //возвращать
    }
}

