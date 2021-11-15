package JavaRushLevel18;

import java.io.*;
import java.util.*;

/*Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.*/
public class MinCountByte_Interesting {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String filename = bf.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;

        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();

            for (Integer i : map.keySet()) {
                if (map.containsKey(b)) {
                    count++;
                }
            }
            map.put(b, count);
            count = 1;
        }
        fileInputStream.close();
        //смотрю добавленный словарь с ключами и значениями(выводит toString)
        //System.out.println(map);

        List<Integer> list = new ArrayList<Integer>(map.values());
        List<Integer> listkey = new ArrayList<Integer>(map.keySet());
        Collections.sort(list);
        //смотрю ключи
       // System.out.println(listkey);
//смотрю значения
        //System.out.println(list);
        // смотрю минимальное значение
        //System.out.println(list.get(0));


        //?


        //System.out.println();

        for (Map.Entry pair:map.entrySet()) {
            if (pair.getValue()==list.get(0)){
                System.out.print(pair.getKey()+" ");}


        }
    }
}

