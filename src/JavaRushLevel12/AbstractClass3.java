package JavaRushLevel12;
/*Исправь код, чтобы программа компилировалась*/
public class AbstractClass3 {
    public static void main(String[] args) {

    }

    private abstract  static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract   Pet getChild();// абстрактный метод всегда без реализации и без скобок
    }
}
