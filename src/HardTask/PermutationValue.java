package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/*Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.*/
public class PermutationValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(reader.readLine());
        int M=Integer.parseInt(reader.readLine());


        ArrayList<String>list=new ArrayList<String>(N);
        for (int i = 0; i <N ; i++) {
            String s=reader.readLine();
            list.add(s);
        }
        for (int i = 0; i <M ; i++) {
            list.add(list.get(0));//добавляет количество первых чтрок М в конец списка. а нужно чтобы он переставлял а не добавлял

list.remove(list.get(0));

        }
/* или 2 вариант //Цикл для удаления первого элемента( так как при remove у нас происходит сдвиг. и тот элемент который был [1] становиться [0]
        for (int i = 0; i <M ; i++) {
            list.remove(list.get(0));

        }



 */

        for(String s:list)
            System.out.println(s);






        //напишите тут ваш код
    }
}
