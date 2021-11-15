package JavaRushLevel12;
/*Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow*/
public class AbstractClass4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow  extends Animal{
        public String getName(){//из абстрактного класса если наследуется в другой класс, ВСЕГДА НУЖНО
            //переопределять метод
            /*Если ты наследовал свой класс от абстрактного класса,
            то нужно переопределить все унаследованные абстрактные методы — написать для них
            реализацию. Иначе такой класс тоже придется объявить абстрактным. Если в классе
            есть хотя-бы один нереализованный метод, объявленный прямо в нем или унаследованный
            от класса-родителя, то класс считается абстрактным.*/
            return "name";
        }


    }
}
