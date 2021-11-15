package JavaRushLevel10;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.
Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/
public class ValueAndKeyinMap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer>map=new HashMap<>();


        while (true){

String s=reader.readLine();
            if(s.isEmpty()){
                break;
            }
            int id = Integer.parseInt(s);

            String name = reader.readLine();


           map.put(name, id);

        }
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer>entry= (Map.Entry<String, Integer>) iterator.next();
            String s=entry.getKey();
            int as=entry.getValue();
            System.out.println(as+" "+s);
        }


    }

}
