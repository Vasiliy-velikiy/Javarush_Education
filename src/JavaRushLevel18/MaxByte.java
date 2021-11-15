package JavaRushLevel18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода*/
public class MaxByte {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String filename = bf.readLine();
        FileInputStream inputStream = new FileInputStream(filename);
        List<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            list.add(b);
        }


        Collections.sort(list);



        inputStream.close();
        System.out.println(list.get(list.size()-1));

    }
}
