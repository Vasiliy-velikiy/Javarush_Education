package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class СycleFromOutput {
    public static void main(String[] args) throws Exception {

        /*
        boolean b=false;//цикл выполняется до тех пор пока условие true.Все значения кроме exit
        while (!b){//будут true,как только значение примет exit оно будет false и цикл прекратиться
            String a2 = bf.readLine();
            b=a2.equals("exit");
        }
        */

//вывести на экран числа от 1 до 10 включительно, используя цикл while. Каждое значение с новой строки
 /*

        int i = 10;
        int a = 1;

        while (i >= a) {
            System.out.println(a);
            a++;

         */

//Вывести на экран числа от 10 до 1 включительно,используя цикл while. Каждое значение с новой строки.
 /*
        int i1 = 10;
        int a1 = 1;

        while (i1 >= a1) {
            System.out.println(i1);
            i1--;
        }

         */

//Ввести с клавиатуры строку и число N больше 0. Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a2 = bf.readLine();
        String a1 = bf.readLine();

        int a = Integer.parseInt(a1);

while (a>=1){
    System.out.println(a2);
    a--;
}


    }
}
