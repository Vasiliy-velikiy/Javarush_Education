package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

/*1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента,
нарушающего такую упорядоченность.*/
public class OrderElements {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            list.add(s);
        }
//1 вариант
/*1 вариант тожн правильный
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).length() == list.get(i + 1).length() - 1) {

                count++;
            }

        }

        if (count != list.size() - 2) {
            System.out.println(count+1);

        }


 */
//2 вариант более правильный


        for (int i = 1; i < list.size() ; i++) {
            /*решаем проблему выхода за размер при обычном написании
            for (int i = 0; i < list.size() ; i++) {
             if(list.get(i).length()<list.get(i+1).length()){
             */

            //сравнивает текущую и предидущую длину строк и если текущая меньше( а она должна
            // быть больше)
            if(list.get(i).length()<list.get(i-1).length()){
                System.out.println(i);//выводит индекс и останавливает
                break;
            }
        }
    }
}

