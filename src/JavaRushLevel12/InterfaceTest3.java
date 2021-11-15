package JavaRushLevel12;
/*Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).
*/
public class InterfaceTest3 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat,CanMove{
        public void eat(){
        }
        public void move(){

        }
    }

    public class Duck implements CanEat,CanMove,CanFly {
        public void eat(){
        }
        public void move(){

        }
        public void fly(){

        }
    }

    public class Car implements CanMove {
        public void move(){

        }

    }

    public class Airplane implements CanMove,CanFly{
        public void move(){

        }
        public void fly(){

        }
    }
}
