package JavaRushLevel6;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*Ввести с клавиатуры положительное число. Определить, сколько в введенном числе
четных цифр, а сколько нечетных.Если число делится без остатка на 2 (т. е. остаток
равен нулю), значит оно четное. Увеличиваем на 1 счетчик четных цифр (статическая
переменная even). Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая
переменная odd). Вывести на экран сообщение: "Even: а Odd: b", где а -
количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1*/
public class InputValueAndResaltNegativeAndPositiveNumbers {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
even=0;
odd=0;

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        for (int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(ch % 2 == 0) {
                even++;
            } else odd++;
        }

        int a=even;
        int b=odd;


        System.out.println("Even: "+a+" Odd: "+b);


    }

}
