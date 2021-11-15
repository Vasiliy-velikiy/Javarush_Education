package JavaRushLevel9;
/*Создай метод public static void divideByZero, в котором подели любое число на ноль и
выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя
метод exception.printStackTrace()*/
public class ExceptionDivideByZero {
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        }

    public static void divideByZero() throws ArithmeticException{
        int a=100/0;
        System.out.println(a);

    }
}
