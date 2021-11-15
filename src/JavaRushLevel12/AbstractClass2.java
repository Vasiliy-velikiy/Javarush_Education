package JavaRushLevel12;
/*Исправь код, чтобы программа компилировалась.

Подсказка: метод getChild должен остаться абстрактным.*/
public class AbstractClass2 {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();//Если в классе есть хоть один абстрактный метод,
        // класс тоже помечается ключевым словом abstract.
    }
}
