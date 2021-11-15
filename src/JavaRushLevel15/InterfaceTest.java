package JavaRushLevel15;
/*Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
Реализуй их методы.*/
public class InterfaceTest {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Sellable,Discountable,Movable {
        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }

        @Override
        public boolean isMovable() {
            return false;
        }
    }

}

