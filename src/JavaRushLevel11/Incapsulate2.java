package JavaRushLevel11;
/*cкрой внутренние переменные класса Cat, к которым есть доступ с помощью методов.*/
public class Incapsulate2 {

    public static void main(String[] args) {
    }

    public class Cat {
      private String name;// здесь был public
        private int age;//здесь был public
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
