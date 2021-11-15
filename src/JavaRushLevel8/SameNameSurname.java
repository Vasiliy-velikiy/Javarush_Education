package JavaRushLevel8;

import java.util.HashMap;
import java.util.Map;

/*Создать словарь Map (<String, String>) и добавить туда 10 человек в виде
"Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.*/
public class SameNameSurname {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Москалев ", "Василий");
        map.put("Пупкин", "Василий");
        map.put("Попов", "Егор");
        map.put("Попов", "Луиза");
        map.put("Семеренко", "Тарас");
        map.put("Алексеев", "Николай");
        map.put("Алексеев", "Егор");
        map.put("Егоров", "Алексей");
        map.put("Кацуба", "Николай");
        map.put("Николаев", "Василий");  //напишите тут ваш код

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
