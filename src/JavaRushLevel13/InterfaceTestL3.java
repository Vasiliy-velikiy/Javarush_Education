package JavaRushLevelTest;
/*Удали все некорректные строки в интерфейсе Button*/
public class InterfaceTestL3 {
    // исходный вариант
    /*public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        public void onPress();

        protected void onPress();

        void onPress();

        private void onPress();

        protected String onPress(Object o);

        String onPress(Object o);

        private String onPress(Object o);

    }*/
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        String onPress(Object o);


    }
}
