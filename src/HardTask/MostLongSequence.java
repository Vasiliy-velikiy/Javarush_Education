package HardTask;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся
чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся
чисел состоит из трех четверок.*/
public class MostLongSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            Integer b = Integer.parseInt(bf.readLine());
            arrayList.add(b);

        }
        int max=1;
        int count = 1;
        for (int i = 0; i < arrayList.size() - 1; i++) {

            //сравнивать через equals ведь Integer не приметив

            if(arrayList.get(i).equals(arrayList.get(i+1))) {
                count++;
                if(count>max) {
                    max = count;
                }


            } else {
                count = 1;

            }
        }
        //System.out.println(linkedList.toString());


        System.out.println(max);

    }
}
