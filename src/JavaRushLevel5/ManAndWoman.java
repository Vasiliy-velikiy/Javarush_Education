package JavaRushLevel5;
/*1. Внутри класса  создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address*/
public class ManAndWoman {
    public static void main(String[] args) {

        Man man=new Man("Gosha",21,"yl Pupkina");
        Man man2=new Man("Grisha",24,"yl Pdsds");
        Woman woman=new Woman("Nika",30,"yl Zalypkina");
        Woman woman2=new Woman("Nikalay",30,"yl Zalemhana");
    }
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
            System.out.println(name + " " + age + " " + address);
        }


    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
            System.out.println(name + " " + age + " " + address);
        }
    }


}
