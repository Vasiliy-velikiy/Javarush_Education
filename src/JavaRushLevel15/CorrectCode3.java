package JavaRushLevel15;
/*Упрости код:
убери все наследования классов, которые автоматически добавятся при компиляции;
убери все конструкторы, которые создаются и добавляются автоматически.*/
public class CorrectCode3 {
//исходный вариант
    /*public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine extends Object implements Runnable {
        public Machine() {
            super();
        }
    }

    public class Car extends Machine implements Runnable {
        public Car() {
            super();
        }
    }*/
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine  {

    }

    public class Car extends Machine  {

    }

}
