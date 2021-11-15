package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3*/
public class ThreeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String a1 = bf.readLine();
        String b1 = bf.readLine();
        String c1 = bf.readLine();


        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        if(a==b||b==a){
            System.out.println(3);
        }
        else if(a==c||c==a){
            System.out.println(2);
        }
        else if (c==b||b==c){
            System.out.println(1);
        }

    }
}
