package JavaRushLevel20;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Сделай так, чтобы сериализация класса Human была возможной.*/
public class SerializeTest {
    public static class Human implements Serializable {
        public String name;
        public List<String> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, String... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));// формирует список на основе массива String... assets
            }
        }
    }

    public static void main(String[] args) {

    }
}
