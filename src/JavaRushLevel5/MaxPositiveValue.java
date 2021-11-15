package JavaRushLevel5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
в задаче требуется что вводятся неотрицательные значения, и как только вводится значение которое меньше всех введенных
сразу выводится результат*/
public class MaxPositiveValue {

    public static void main(String[] args) throws IOException {
        //1 способ
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> value = new ArrayList<>();
       int maximum=value.get(0) ;





        for (; true; ) {
            String s = reader.readLine();
            if (s.equals("max")) break;
            int a = Integer.parseInt(s);
            if (a <= 0) return;
            value.add(a);

        }

        for (int i = 0; i < value.size(); i++) {
            for (int j = value.size() - 1; j > i; j--) {
                if (value.get(j - 1) < value.get(j)) {
                    int middle = value.get(j - 1);
                    value.set((j - 1), value.get(j));
                    value.set(j, middle);
                }
            }
        }



        //напишите тут ваш код

        System.out.println( maximum);
    }

         */
        //2способ

        int maximum=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int a=Integer.parseInt(s);

        if(a>0){
            for (int i = 1; i <=a ; i++) {
                int b=Integer.parseInt(reader.readLine());
                if(i==1) {maximum=b; //нужно правильно присвоить значнеие макс переменной-минимально допустимое
                    //значение, т е первое введеное значение с клавиатуры в цикле. а далее с помощью тернароного оператора уже
                    //увеличиваем макс переменную если такие числа попадаются

                }
                maximum=maximum<b?b:maximum;

            }
        }

        if (a<=0) return;

        System.out.println(maximum);
    }
}



