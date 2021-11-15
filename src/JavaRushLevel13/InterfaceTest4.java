package JavaRushLevel13;
/*Создай класс Screen и реализуй в нем интерфейсы Selectable и
Updatable. Не забудь реализовать методы!*/
public class InterfaceTest4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }
    class Screen implements Selectable,Updatable{
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }

    //напишите тут ваш класс

}
