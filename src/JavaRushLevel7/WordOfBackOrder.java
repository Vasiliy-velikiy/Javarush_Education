package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Введи с клавиатуры 5 слов в список строк.
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.*/
public class WordOfBackOrder {
    public static void main(String[] args) throws IOException {


        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        list.remove(2);
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));

        }
    }
}
