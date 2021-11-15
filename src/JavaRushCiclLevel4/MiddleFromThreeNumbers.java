package JavaRushCiclLevel4;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MiddleFromThreeNumbers {
    public static void main(String[] args) throws Exception {


        // int middle = (y1 + y2 + y3) / 3; в задаче сказано среднне чесли а не среднее значение из суммы
   /*1 СПОСОБ Достаточно написать три условия в которых должно выводиться то или иное число
a >= b && a <= c || a >= c && a <= b
b >= a && b <= c || b >= c && b <= a
c >= a && c <= b || c >= b && c <= a
         */


//2 СПОСОБ
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bf.readLine();
        String a2 = bf.readLine();
        String a3 = bf.readLine();
        int y1 = Integer.parseInt(a1);
        int y2 = Integer.parseInt(a2);
        int y3 = Integer.parseInt(a3);

        int Array[] = {y1, y2, y3};
        for (int i = 1; i < Array.length; i++) {
            for (int j = 2; j >= i; j--) {
                if (Array[j - 1] > Array[j]) {
                    int middleconst = Array[j];
                    Array[j] = Array[j - 1];
                    Array[j - 1] = middleconst;
                }
            }
        }

        System.out.println(Array[1]);
// 3 СПОСОБ- можно отсортировать массив с помощью встроенного метода сортировки Arrays.sort
        Arrays.sort(Array);
        System.out.println(Array[1]);
/*4СПОСОБ int max = Math.max(Math.max(y1,y2),y3);
int min = Math.min(Math.min(y1,y2),y3);
System.out.println(y1+y2+y3-max-min);

 */

        int max = Math.max(Math.max(y1, y2), y3);
        int min = Math.min(Math.min(y1, y2), y3);
        System.out.println(y1 + y2 + y3 - max - min);
    }
}
        
   

        
        



