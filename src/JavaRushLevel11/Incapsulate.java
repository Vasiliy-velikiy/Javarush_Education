package JavaRushLevel11;
/*Скрой все внутренние переменные класса Cat.*/
public class Incapsulate {public static void main(String[] args) {

}
    public class Cat {
      private   String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }


}
