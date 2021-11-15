package JavaRushLevel8;

import java.util.HashMap;
import java.util.Map;

/*Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень*/
public class CreateMapValue {
    public static void main(String[] args) {


        Map<String,String> maper=new HashMap<String,String>();
        maper.put("арбуз","ягода");
        maper.put("банан","трава");
        maper.put("вишня", "ягода");
        maper.put("груша","фрукт");
        maper.put("дыня", "овощ");
        maper.put("ежевика", "куст");
        maper.put("жень-шень","корень");
        maper.put("земляника", "ягода");
        maper.put("ирис","цветок");
        maper.put("картофель","клубень");



        for (Map.Entry<String,String> pair: maper.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + "-" + value);
        }



    }

}
