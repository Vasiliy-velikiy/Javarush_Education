package JavaRushLevelTest;
/*Унаследуй Fox от интерфейса Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что методы удалять нельзя.*/
public class InterfaceTestL7 {
    // исходный вариант
    /*public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static class Fox {
        public String getName() {
            return "Fox";
        }
    }*/
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default void getColor(){

        }

       default Integer getAge(){
            return null;
       }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

}
