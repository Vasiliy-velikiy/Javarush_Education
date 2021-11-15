package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.*/
public class MaxOfFourValue {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String a1 = bf.readLine();
        String b1 = bf.readLine();
        String c1 = bf.readLine();
        String d1 = bf.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);





        if ((a > b|a==b) && (a > c|a==c) && (a > d|a==d)) {
            System.out.println(a);
        } else if ((b > a|b==a) && (b > c|b==c) && (b > d|b==d)) {
            System.out.println(b);
        } else if ((c > a|c==a) && (c > b|c==b) && (c > d|c==d)) {
            System.out.println(c);
        } else if ((d > a|d==a) && (d > c|d==c) && (d > b|d==b)) {
            System.out.println(d);
        }

    }
}
