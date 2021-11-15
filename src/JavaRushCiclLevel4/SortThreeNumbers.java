package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.*/

public class SortThreeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String a1 = bf.readLine();
        String b1 = bf.readLine();
        String c1 = bf.readLine();


        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);


      /* 1 способ решения

       if (a >= b && a >= c && b >= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= b && a >= c && c >= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (c >= a && c >= b && a >= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c >= a && c >= b && b >= a) {
            System.out.println(c + " " + b + " " + a);
        } else if (b >= a && b >= c && a >= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b >= a && b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        }
*/



       /* int [] Array={a,b,c};
        int low = 0;
        int high=2;

        int middle=low+(high-low)/2;
        int opora= Array[middle];
        int mid_const;


        int as=low; int ab=high;

        while(as<=ab){
            while (Array[as]<opora){
                as++;
            }
            while (Array[as]>ab){
                ab--;
            }
            if (as<=ab){
                mid_const=Array[as];
                Array[as]=Array[ab];
                Array[ab]=mid_const;
                as--;
                ab++;
            }
            for (int i = 0; i < Array.length-1; i++) {
                System.out.print(Array[as] + " ");
            }
        }

*/

        /* 2 способ решения   реализация алгоритма пузырьковой сортировки
 чтобы изменить направление сортировки достаточно поменять знак с >на <

        */
        int mid_const;
        int [] Array={a,b,c};

        for (int i = 0; i < Array.length-1 ; i++) {
            for (int j = 2; j >i ; j--) { // если требуемый порядок следования не соблюдяется,
                if(Array[j-1]<Array[j]){ // то меняем местами значения массива
                    mid_const=Array[j];
                    Array[j]=Array[j-1];
                    Array[j-1]=mid_const;
                }
            }

        }
        //для вывода отсортированного массива пишем снова цикл вывода
        for (int cd = 0; cd <Array.length ; cd++) {
            System.out.print(Array[cd]+" ");

        }






        }
    }

