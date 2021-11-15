package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/
public class FastStringOfArrayList {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        int num_short = 0;
        int num_long = 0;

        String min = list.get(0);
        String max = list.get(0);
        //String result=list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min.length()) {
                min = list.get(i);
                num_short = i;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max.length()) {
                max = list.get(i);
                num_long = i;

            }
      }

        if (num_long<num_short) System.out.println(max);
        else System.out.println(min);

    }
}


