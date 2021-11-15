package HardTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
Результат выведи на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9*/
public class CountOfLettersInString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

int count=0;
     for (int a = 0; a < alphabet.size(); a++) {
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <list.get(i).length() ; j++) {
                if(alphabet.get(a).equals(list.get(i).charAt(j))){
                    count++;
                }

                }


            }

         System.out.println(alphabet.get(a)+" "+count);
        count=0;
        }



        // напишите тут ваш код
    }
}
