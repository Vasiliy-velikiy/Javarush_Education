package JavaRushLevel12;
/*Напиши метод, который определяет, объект какого класса ему передали, и
возвращает результат: одно из значений — «Корова», «Кит», «Собака», «Неизвестное животное».*/
public class Polymorphism5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow){
            return "Корова";

        }
        else  if (o instanceof Dog){
            return "Собака";

        }
        else if (o instanceof Whale){
            return "Кит";
        }
        else
        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
