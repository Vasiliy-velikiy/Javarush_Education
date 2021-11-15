package JavaRushLevel12;
/*Сделать класс Pegasus (пегас) на основе класса Horse (лошадь) и интерфейса CanFly (летать).*/
public class Polymorphism13 {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus  extends Horse implements CanFly{
        @Override
        public void fly() {

        }
    }

}
