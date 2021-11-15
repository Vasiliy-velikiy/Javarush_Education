package HardTask;

import java.util.*;

/*Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией*/
public class NameSurname {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Москалев ", "Василий");
        map.put("Пупкин", "Василий");
        map.put("Попов", "Егор");
        map.put("Попова", "Луиза");
        map.put("Семеренко", "Тарас");
        map.put("Тарасов", "Николай");
        map.put("Алексеев", "Егор");
        map.put("Егоров", "Алексей");
        map.put("Кацуба", "Николай");
        map.put("Николаев", "Василий");

        //System.out.println(map);
       System.out.println(getCountTheSameFirstName(map,"Василий"));// проверка
        System.out.println(getCountTheSameLastName(map,"Попов"));//

        //напишите тут ваш код
return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count1=0;

        for (String key:map.values()){
            if (key.equals(name)){
                count1++;
            }
        }
return  count1;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count2=0;
        for (String value:map.keySet()){
            if(value.equals(lastName)){
                count2++;
            }
        }

return count2;
    }

    public static void main(String[] args) {
        createMap();


    }
}
