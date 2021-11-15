package JavaRushLevel12;
/*Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.*/
public class Polymorphism11medium {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public  interface Businessman {
        public void workHard();
    }
   public static class Dop_class   {
        public void workHard(){

        }
    }

    public static  class CTO extends Dop_class implements Businessman {

    }
}
