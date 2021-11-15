package HardTask;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко*/
public class SortStringAndNumbers {

    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
//нам нужно, чтобы было два цикла, т к значения могут быть в разных частях массива( для проверки попарно всех значений)
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length; j++) {
                if(i!=j){
                    if (isNumber(array[i]) && isNumber(array[j])){
                        if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                            String middle = array[i];
                            array[i] = array[j];
                            array[j] = middle;
                        }
                    }

                    if(!isNumber(array[i]) && !isNumber(array[j])) {
                        if (isGreaterThan(array[i],array[j])==false) {

                            String tmp=array[j];
                            array[j]=array[i];
                            array[i]=tmp;
                        }

                        }
                    }
                }

            }

        }



        // напишите тут ваш код


        // Метод для сравнения строк: 'а' больше чем 'b'
        public static boolean isGreaterThan (String a, String b){
            return a.compareTo(b) > 0;
        }


        // Переданная строка - это число?
        public static boolean isNumber (String text){
            if (text.length() == 0) {
                return false;
            }

            char[] chars = text.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char character = chars[i];

                // есть '-' внутри строки
                if (i != 0 && character == '-') {
                    return false;
                }

                // не цифра и не начинается с '-'
                if (!Character.isDigit(character) && character != '-') {
                    return false;
                }

                // одиночный '-'
                if (chars.length == 1 && character == '-') {
                    return false;
                }
            }

            return true;
        }

    }




