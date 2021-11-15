package HardTask;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.*/
public class MinStringOfArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5 ; i++) {
            String s=bf.readLine();
            list.add(s);

        }
        //пишем цикл для нахождения одного минимального значения строки
        String s1=list.get(0);
        for(String s:list) {
            if (s.length() < s1.length()) {
                s1 = s;
            }
        }// специально не выводим результат, потому что у нас могут быть несколько строк с мин значением
//пишем цикл для нахождения нескольких мин строк и вывод результата
            for ( String s2:list) {
                if(s2.length()==s1.length()){
                   System.out.println(s2);
                }

            }


        }


    }

