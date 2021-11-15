package JavaRushLevel12;
/*Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Животное».*/
public class Polymorphism7 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cat){
            return "Кот";
        }
        else if (o instanceof Tiger){
            return "Тигр" ;
        }
        else if (o instanceof Lion ){
            return "Лев";
        }
        else if (o instanceof Bull ){
            return "Бык";
        }
        //напишите тут ваш код
        else
        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
