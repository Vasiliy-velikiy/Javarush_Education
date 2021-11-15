package JavaRushLevel9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и
вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.*/
public class InputNumbersAndCatchException {
    public static void main(String[] args)  {
        readData();
    }

    public static void readData()  {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                    int a = Integer.parseInt(bf.readLine());
                    list.add(a);

            }
        }
            catch (NumberFormatException e) {
                for (Integer i : list) {
                    System.out.println(i);
                }
            }
        catch ( IOException e){

        }

        }
        //напишите тут ваш код
    }

