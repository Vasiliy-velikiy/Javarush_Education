package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное -
утраивается. Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я*/
public class ChangingFunctionality {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length()%2==0){
                resultStrings.add(i,strings.get(i)+" "+strings.get(i));

            }
            else { resultStrings.add(i,strings.get(i)+" "+strings.get(i)+" "+strings.get(i));

            }



        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
