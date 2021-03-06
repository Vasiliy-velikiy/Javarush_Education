package JavaRushLevel9;

import JavaRushLevel6.Cat;

import javax.imageio.ImageTranscoder;
import java.util.*;

/*есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
*/
public class ConvertMapToSetCatObject {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map=new HashMap<>();
        Cat cat1=new Cat("Barsik");
        Cat cat2=new Cat("Shiha");
        Cat cat3=new Cat("Shabash");
        Cat cat4=new Cat("Kent");
        Cat cat5=new Cat("Rys");
        Cat cat6=new Cat("Kozlovscki");
        Cat cat7=new Cat("Petrov");
        Cat cat8=new Cat("Kozlovski-Petrov");
        Cat cat9=new Cat("Petrov-Kozlovski-bandarshyk");
        Cat cat10=new Cat("Djeki-Jan");
        map.put(cat1.name,cat1 );
        map.put(cat2.name,cat2 );
        map.put(cat3.name,cat3 );
        map.put(cat4.name,cat4 );
        map.put(cat5.name,cat5 );
        map.put(cat6.name,cat6 );
        map.put(cat7.name,cat7 );
        map.put(cat8.name,cat8 );
        map.put(cat9.name,cat9 );
        map.put(cat10.name,cat10 );

       return map; //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set=new HashSet<>();

        for (Cat cat:map.values()) {
            set.add(cat);
        }

       return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
