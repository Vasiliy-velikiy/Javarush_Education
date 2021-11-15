package JavaRushLevel15;
/*Измени метод printName() так, чтобы он выполнялся для man и woman.
Реализация метода printName() должна быть одна.*/
public class CorrectMistakes3 {

    //исходный вариант
    /*public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Man man) {

    }

    public static class Human {

    }

    public static class Man {

    }

    public static class Woman {

    }*/
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human man) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman  extends Human{

    }
}
