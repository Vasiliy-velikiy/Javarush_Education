package JavaRushLevel12;
/*Переопредели метод getName в классе Whale(Кит), чтобы программа
ничего не выводила на экран.*/
public class Polymorphism2 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName(){
            return "";

        }

    }
}

