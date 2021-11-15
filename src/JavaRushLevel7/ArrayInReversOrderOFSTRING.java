package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;

/*1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 Каждый элемент - с новой строки.*/
public class ArrayInReversOrderOFSTRING {

    public static void main(String[] args) throws IOException {
        String array[]=new String[10];
        for (int i = 0; i <8 ; i++) {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            String s=bf.readLine();
            array[i]=s;
        }


        //1 способ вывода  но в текущем порядке
        //System.out.println(Arrays.toString(array));
        for (int i =array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);

        }




    }

}
