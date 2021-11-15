package JavaRushLevel5;
/*Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.*/


public class Circle2 {
    public double x;
    public double y;
    public double radius;

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2(double x, double y) {
        this(x,y,10);//нам нужно выбрать подходящий конструктор, и единсвенный это конструктор с 3 значениями, а так как нам нужен радиус 10,
        //3 значение 3хзначного конструктора инициализируем десяткой. два первых значени передаем двухзначному конструктору, который вызывает
        //3хзначный конструктор

        //напишите тут ваш код
    }

    public Circle2() {
        this(5, 5, 1);//вызывает конструктор с 3 параметрами
    }

    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle2 anotherCircle = new Circle2(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
