package JavaRushLevel15;
/*Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError*/

//исходный вариант
    /*public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }
    }*/
public class CorrectMistakes6_Exception_StackOverflowError {

    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract double getMoney();

        public Object getAmount() {
            return getMoney();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        private double amount = 123d;

        public double getMoney() {
            return amount;
        }

        @Override
        public Object getAmount() {
            return super.getAmount();
        }
    }
}
