package JavaRushLevel8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.*/
public class InputN_numbers {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        Collections.sort(array);
        int g= array.get(0);


        // Найти минимум тут
        return g;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Integer i=Integer.parseInt(bf.readLine());

        ArrayList<Integer>arrayList=new ArrayList<Integer>();

        for (int j = 0; j <i ; j++) {
            Integer a=Integer.parseInt(bf.readLine());
            arrayList.add(a);

        }

        // Создать и заполнить список тут
        return arrayList;
    }
}
