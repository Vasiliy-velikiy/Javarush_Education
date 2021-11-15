package JavaRushLevel13;
/*Реализуй в классе Fox интерфейс Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что создавать дополнительные классы и удалять методы нельзя!*/
public class InheritanceTest3 {
    //исходный вариант
    /*
    * public static void main(String[] args) throws Exception {
    }

    public interface Animal {
         void getColor();

    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

    }*/
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
         void getColor();

    }

    public static abstract class Fox implements Animal {//асбтрактный метод может реализовывать интерфейс и
        // ему не нужно описывать все методы интерфейса
        public String getName() {
            return "Fox";
        }

    }
}
