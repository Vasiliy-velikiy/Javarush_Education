package JavaRushLevel12;
/*Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.*/
public class AbstractClass5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName(){
            return "Name";
        }
        public Pet getChild(){
            return null;
        }

    }

    public static class Dog extends  Pet{
        public String getName(){
            return "Name";
        }
        public Pet getChild(){
            return null;
        }

    }

}
