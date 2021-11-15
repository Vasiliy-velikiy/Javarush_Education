package JavaRushLevel8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/*Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово -
с новой строки.*/
public class SortStringValue {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }







/*
String a="а";
String b="б";
        System.out.println(isGreaterThan(a, b));


 */

    }




    public static void sort(String[] array) {




        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                boolean s=isGreaterThan(array[j] , array[j - 1]);

                if (!s) {
                    String middle = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = middle;
                }

            }
        }
    }
                //напишите тут ваш код


                //Метод для сравнения строк: 'а' больше чем 'b'
//объект а лексеграфически предшествует строке аргумента-отрицательное значение
                //возвращает false если первая буква  строки а предществует b
                public static boolean isGreaterThan (String a, String b){
                    return a.compareTo(b) > 0;
                }
            }


