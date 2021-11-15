package JavaRushLevel14;

import java.util.Objects;

/*Давай напишем программу, которая определит, что умеют делать жители океана:
Подумай, как связаны интерфейсы Swimmable (способен плавать) и Walkable (способен ходить) с классом OceanAnimal (животное океана).
Правильно расставь наследование интерфейсов и класса OceanAnimal.
Подумай, как могут быть связаны классы Orca (Косатка), Whale (Кит), Otter (Выдра) с классом OceanAnimal.
Расставь правильно наследование между классами Orca, Whale, Otter и классом OceanAnimal.
Подумай, какой класс должен реализовать интерфейс Walkable и добавить интерфейс этому классу.
Подумай, какое животное еще не умеет плавать и добавить ему интерфейс Swimmable.*/
public class CorrectMistakes {
    //исходный вариант
    /*public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca {
    }

    static class Whale {

    }

    static class Otter {

    }*/
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal  implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal{
        @Override
        public void swim() {
            super.swim();
        }

        @Override
        Swimmable getCurrentAnimal() {
            return new Orca();
        }
    }

    static class Whale  extends OceanAnimal{


        @Override
        Swimmable getCurrentAnimal() {
            return new Whale();
        }
    }

    static class Otter implements Walkable, Swimmable {
        @Override
        public void walk() {

        }

        @Override
        public void swim() {
           Otter currentAnimal = new Otter();
            currentAnimal.displaySwim();

        }
        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        Swimmable getCurrentAnimal() {
            return new Otter();
        }

    }


}
