package JavaRushLevel20;

import java.io.Externalizable;
import java.io.Serializable;

/*Сделайте так, чтобы сериализация класса Object была возможной.
Подсказка: для сериализации объекта нужно, чтобы все его поля поддерживали сериализацию.
Для многих класов из JRE это уже сделано. Но если класс написан тобой, то нужно это свойство
 добавить вручную.*/
public class SerializeTest4  {

    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable  {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) {

    }
}
