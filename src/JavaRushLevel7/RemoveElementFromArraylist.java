package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран,
каждое значение с новой строки.*/
public class RemoveElementFromArraylist {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i <5 ; i++) {
            String s=bf.readLine();
            list.add(s);
    }
        for (int i = 0; i <13 ; i++) {
            list.add(0,list.get(4));//при исользовании оператора add-все значения спускаются вниз и увеличивается размер массива
            //поэтому у нас становится их уже 6
            list.remove(list.size()-1);




        }
        for(String s1:list){
            System.out.println(s1);
        }

        }
}
