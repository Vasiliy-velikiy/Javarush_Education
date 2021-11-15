package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:  1

Пример для чисел -6 -6:  3
*/
public class VkakoiChetverti {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String a1 = bf.readLine();
        String b1 = bf.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);

        if (a > 0 && b>0){
            System.out.println(1);
        }
                  else if (a < 0 && b>0){
            System.out.println(2);
        }
                else if (a < 0 && b<0){
            System.out.println(3);
        }
                    else if (a > 0 && b<0){
            System.out.println(4);
        }
    }
}
