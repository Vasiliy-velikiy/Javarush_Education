package JavaRushLevel12;
/*Переопредели метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота,
а собака — собаку.*/
public class Polymorphism3 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();//в переменную типа Pet мы передаем ссылку на класс Сat и его методы
        //далее создаем переменную Типа Pet и ей присваиваем метод который от 1ой переменной(которая в
        // свою очередь обращается к методу класса Cat)
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        public Pet getChild(){
            return new Dog();
        }

    }

}
