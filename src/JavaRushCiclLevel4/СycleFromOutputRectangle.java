package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 1 задача Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
*/

/*2 задача ввести заглавную букву вывести на экран квадрат из 10х10 из этих букв  используя
цикл while. Буквы в каждой строке не разделять.
Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS*/
public class СycleFromOutputRectangle  {
    public static void main(String[] args) throws Exception {
 //1 задача
   /*  int a=10;
        while (a>=1){
            System.out.println("SSSSSSSSSS");
            a--;

        }
        */



//2 задача
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       char a1 = (char) bf.read();
int a=10;
       while (a>0){
            for (int i = 0; i <10 ; i++) {
                System.out.print(a1);

            }
           System.out.println();
            a--;
        }




    }
}
