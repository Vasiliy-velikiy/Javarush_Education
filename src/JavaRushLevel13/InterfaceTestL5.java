package JavaRushLevelTest;
/*Переделай наследование в классах и интерфейсах так, чтобы программа компилировалась и
продолжала делать то же самое.
Класс Hobby должен наследоваться от интерфейсов Desire, Dream*/
public class InterfaceTestL5 {
    //исходный вариант
    /*public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream implements Hobby {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby extends Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }*/
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream  {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
