package JavaRushLevel5;
/*Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.*/
public class Animal2 {

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomcat=new Cat("Tom",30,4);
        Dog dog=new Dog("Brown",34,"brown");
    }


    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;

        }
    }

    public static class Cat {
        String name;
        int height;
        int age;

        public Cat(String name, int height, int age) {
            this.name = name;
            this.height = height;
            this.age = age;
        }

    }


    public static class Dog {
        String name;
        int height;
        String color;

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
}