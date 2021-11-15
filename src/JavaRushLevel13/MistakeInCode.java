package JavaRushLevel13;
/*Исправь 4 ошибки в программе, чтобы она компилировалась.*/
public class MistakeInCode {
    public static void main(String[] args) {
     // System.out.println(new Dream().HOBBY.toString());  //ОШИБКА   -СОЗДАТЬ эземпляр интерфейса мы нее можем
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
     public Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
/* ИСХОДНЫЙ ВАРИАНТ
public static void main(String[] args) {

        System.out.println(new Dream().HOBBY.toString());  //ОШИБКА
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        private static Hobby HOBBY = new Hobby();   //ОШИБКА
    }

    class Hobby extends Desire implements Dream {  //2 ОШИБКИ
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
*/