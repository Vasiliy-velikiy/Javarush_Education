package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.*/
public class DoubleWords {
    public static void main(String[] args) throws Exception {
//считываем строки с консоли и добавляем в список
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = bf.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        for (String s : result) {
            System.out.println(s);

        }//вывести на экран result

    }
        public static ArrayList<String> doubleValues (ArrayList < String > list) {
//в задании просят не ставить ограничение в лист.сайз- он будет расширяться до тех пор пока у нас есть вводные значения(list.get(i))
 //т е в 2 раза 10значений+10значений
            for (int i = 1; i <=list.size() ; i=i+2) {
                list.add(i,list.get(i-1));

            }

return list;
        }
    }
