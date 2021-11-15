package JavaRushCiclLevel4;
/*Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumNubers {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //1способ с циклом while
/*
        int sum=0;

        while (true) {
            String s=bf.readLine();
            int number=Integer.parseInt(s);// можно сократить и обьявить number без переменной s:
    // int number=Integer.parseInt(bf.readLine())
           sum+=number;
            if (number == -1) {
                break;
            }


        }
        System.out.println(sum);
 */
        //2способ с циклом for
        int sum=0;
        for (;true; ) {
            int a=Integer.parseInt(bf.readLine());
            sum+=a;
            if(a==-1){break;}
        }
        System.out.println(sum);
    }
}
