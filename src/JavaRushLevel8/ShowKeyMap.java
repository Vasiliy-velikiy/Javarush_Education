package JavaRushLevel8;

import java.util.HashMap;
import java.util.Map;

public class ShowKeyMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        for (Map.Entry<String,String>pair:map.entrySet())
        {
            String key=pair.getKey();
            System.out.println(key);

        }
        //напишите тут ваш код
    }
}
