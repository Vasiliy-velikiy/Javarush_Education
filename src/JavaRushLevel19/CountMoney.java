package Stream;

import javax.swing.*;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;


/*В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0*/
public class CountMoney {
    public static void main(String[] args) throws IOException {
        //args[0]="C:/Users/Василий/Documents/тестовые_документы/1.txt";
       // String name="C:/Users/Василий/Documents/тестовые_документы/2.txt";

        BufferedReader bf=new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map=new TreeMap<>();



        String[] strings=new String[2];//создаем массив на 2 части
        String s;
        while ((s=bf.readLine())!=null) {

            strings = s.split(" ");//разбиваем строку там где пробелы и загоняем в массив из2хчастей
            String key = strings[0];//первая часть массива
            Double value = Double.parseDouble(strings[1]);
            if (map.containsKey(key)) {
                value = map.get(key) + value;
            }
            map.put(key, value);

        }

                for(Map.Entry pair: map.entrySet()){
                    System.out.println(pair.getKey()+" "+pair.getValue());
                }

                bf.close();

    }
}
