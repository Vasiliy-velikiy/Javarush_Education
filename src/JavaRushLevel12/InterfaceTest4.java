package JavaRushLevel12;
/*Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин),
Airplane (самолет).*/
public class InterfaceTest4 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run(){

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanFly,CanSwim,CanRun  {
        public void fly(){

        }
        public void swim(){

        }
        public void run(){

        }

    }

    public class Penguin implements CanSwim ,CanRun {
        public void run(){

        }
        public void swim(){

        }

    }

    public class Airplane implements CanFly,CanRun {
        public void fly(){

        }

        public void run(){

        }

    }
}
