package JavaRushLevel24;

public class Animal {
    public void meow() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Animal anonTiger = new Animal() {
            @Override
            public void meow() {
                System.out.println("Raaa!");
            }
        };

        Animal notAnonTiger = new Animal().new Tiger();

        anonTiger.meow(); // будет выведено Raaa!
        notAnonTiger.meow(); // будет выведено Raaar!
    }

    private class Tiger extends Animal {
        @Override
        public void meow() {
            System.out.println("Raaar!");
        }
    }
}
