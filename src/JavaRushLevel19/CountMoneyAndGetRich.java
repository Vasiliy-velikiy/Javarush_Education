package Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
* */
public class CountMoneyAndGetRich {
    public static void main(String[] args) throws IOException {
        //args[0]="C:/Users/Василий/Documents/тестовые_документы/1.txt";
        //String name="C:/Users/Василий/Documents/тестовые_документы/2.txt";
        BufferedReader bf=new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map=new TreeMap<>();


        String[] strings=new String[2];
        String s="";
        while (bf.ready()){
            s= bf.readLine();
            strings=s.split(" ");
            String lname=strings[0];
            Double value=Double.parseDouble(strings[1]);
                    if(map.containsKey(strings[0])){
                        value=map.get(strings[0])+value;
                    }
                    map.put(strings[0],value);


        }
       // System.out.println(map);//проверка

        TreeSet<Double> set=new TreeSet<>(map.values()); //Collection values() -Возвращает представление (вид) коллекции значений, содержащихся на этой карте.



       //System.out.println(set);//проверка

String mostrichman="";

for(String ser:map.keySet()){
    if(map.get(ser).equals(set.last())){
        System.out.println(ser);
    }

}

bf.close();
    }
}
