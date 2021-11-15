package JavaRushLevel5;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*водить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.*/
public class AverageIN_OUTput {
    public static void main(String[] args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        double sum=0.00; // не выводит дробное число
        double a1=420000.0;
        int b=9;
        double count=0;






        double test=10000.0/3; // выводит дробное число(все верно)
        for( ;true; ) {
            String s=bf.readLine();
            double a = Double.parseDouble(s);

            if (a==-1) {
                break;

            }
            count++;
            sum =sum+ a;

            /*
             sum = (sum+ a)/b;// если я записал бы (sum+ a)/2 то мне выдал бы ответ целое число
            //например я ввел 2 и 3 ответ=2.0 так как делитель 2 не определен как тип каой то дробный тип, т.е это целое число

             */
        }
        System.out.println(sum/count);
        System.out.println(test);
        System.out.print((a1/b));

    }
}
