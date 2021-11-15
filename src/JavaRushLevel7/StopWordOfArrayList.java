package JavaRushLevel7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.*/
public class StopWordOfArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>list=new ArrayList<String>();


        for ( ;true; ){
            String s=reader.readLine();
            if(s.equals("end")) break;//если мы поставим эту строчку после  list.add(s), то у нас end будт добавляться в список
            list.add(s);


        }


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
        //напишите тут ваш код
    }
}
