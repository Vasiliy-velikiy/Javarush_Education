package JavaRushLevel11;
/*Скрой все внутренние переменные класса Cat и Dog.
Также скрой все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.*/
public class Incapsulate4 {

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

 public int getSpeed() {////если будет доступ private то метод isCatNear не сможет с ним взаимодейтвовать
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {//если будет доступ private то метод isDogNear не сможет с ним взаимодейтвовать
        return speed;
    }

   public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
