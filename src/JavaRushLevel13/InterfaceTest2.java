package JavaRushLevel13;
/*Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы*/
public class InterfaceTest2 {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public boolean isAlcoholic() {
            return true;
        }

        @Override
        public String toString() {
            if (isAlcoholic()) {//подразумевается что тут будет true
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

    }
}
