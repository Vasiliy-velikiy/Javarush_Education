package JavaRushLevel18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/*Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83*/
public class SetListByte {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String filename = bf.readLine();
        FileInputStream inputStream = new FileInputStream(filename);
        Set<Integer> list=new TreeSet<>();

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            list.add(b);
        }






        inputStream.close();
        for (Integer i:list){
            System.out.print(i+" ");
        }


    }
}
