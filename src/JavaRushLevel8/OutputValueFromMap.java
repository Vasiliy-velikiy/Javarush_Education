package JavaRushLevel8;

import java.util.HashMap;
import java.util.Map;

public class OutputValueFromMap {
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

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        for (Map.Entry<String,String>pair: map.entrySet()){
            String key=pair.getKey();
            String value=pair.getValue();
            System.out.println(key+":"+value);
        }

        //напишите тут ваш код
    }
}
