package JavaRushLevelTest;
/*Реализуй интерфейс Updatable в классе Screen.*/
public class InterfaceTestL6 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}
