package JavaRushLevel15;
/*Оцени наши машины и определи их в подходящую категорию — роскошное или дешевое авто — и выведи результат.
Для вывода используй только переменные из класса Constants.
В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
Создай public static класс LuxuriousCar (РоскошнаяМашина).
Создай public static класс CheapCar (ДешеваяМашина).
Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными способами модификаторы доступа так,
чтобы в классах Ferrari и Lanos выполнялось расширение видимости.*/
public class InterfaceTest2 {
    public static void main(String[] args) {
        new InterfaceTest2.LuxuriousCar().printlnDesire();
        new InterfaceTest2.CheapCar().printlnDesire();
        new InterfaceTest2.Ferrari().printlnDesire();
        new InterfaceTest2.Lanos().printlnDesire();
    }


    public static class LuxuriousCar extends Constants{
        protected void printlnDesire() {
            System.out.println(WANT_STRING+LUXURIOUS_CAR);

        }
    }
    public static class CheapCar extends Constants{
        protected void printlnDesire() {
            System.out.println(WANT_STRING+CHEAP_CAR);

        }
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(WANT_STRING+FERRARI_NAME);
            //add your code here
        }
    }

    public static class Lanos extends CheapCar{
        public void printlnDesire() {
            System.out.println(WANT_STRING+LANOS_NAME);
            //add your code here
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";

    }
}
