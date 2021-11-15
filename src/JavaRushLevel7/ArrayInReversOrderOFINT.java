package JavaRushLevel7;
/*1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке,
 каждое значение выводить с новой строки.*/
import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayInReversOrderOFINT {
    public static void main(String[] args) throws Exception {
        int[] array=new int[10];
        for (int i = 0; i <array.length ; i++) {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            int a=Integer.parseInt(bf.readLine());
            array[i]=a;

        }
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);

        }

    }
}
