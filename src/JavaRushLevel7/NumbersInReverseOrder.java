package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;*/
public class NumbersInReverseOrder {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer>list=new ArrayList<Integer>();

        for (int i = 0; i <10 ; i++) {
            int a=Integer.parseInt(reader.readLine());
            list.add(a);

        }
        for (int i =list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));

        }



        //напишите тут ваш код
    }
}
