package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888 */
public class RectangleFromNumbers {
    public static void main(String[] args) throws  Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bf.readLine();
        String b1 = bf.readLine();
        int m = Integer.parseInt(a1);
        int n = Integer.parseInt(b1);


        for (int j = 0; j <m ; j++) {
            for (int i = 0; i <n ; i++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
