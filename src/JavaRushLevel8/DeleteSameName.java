package JavaRushLevel8;

import java.util.*;
/*Создать словарь (Map<String, String>) занести в него десять записей по принципу
"фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.*/

public class DeleteSameName {

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
        //напишите тут ваш код

        removeTheFirstNameDuplicates(map);
        System.out.println(map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> valuelist = new ArrayList<String>(map.values());
        //System.out.println(valuelist);
        int count=0;


        for (int j = 0; j < valuelist.size() ; j++) {
            for (int i = 0; i <valuelist.size() ; i++) {
                if (valuelist.get(j).equals(valuelist.get(i))) {
                    count++;
                }
            }
                if(count>2){//двойка , потому что сравниваются каждый раз 1 и тажа запись с собой, это +1, и дубликат,=>уже +2
                    removeItemFromMapByValue(map, valuelist.get(j));
                    count=0;
                }


                }

            }




    //напишите тут ваш код


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        //можно обойтись без итератора,создав копию мапы и скопировав туда значения.
        //перебор будет по копии а удаление из оригинала

        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }


    }

    public static void main(String[] args) {

createMap();
        }
    }



