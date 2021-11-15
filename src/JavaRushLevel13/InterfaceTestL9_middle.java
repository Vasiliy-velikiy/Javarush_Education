package JavaRushLevelTest;
/*В этой задаче тебе нужно:
Реализовать интерфейс DBObject в классе User.
Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран:
 "The user's name is Neo, id = 1".
Метод toString и метод main менять нельзя.
Подумать, что должен возвращать метод initializeIdAndName в классе User.
Обрати внимание: методы toString() и main() менять нельзя.*/
public class InterfaceTestL9_middle {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix extends User {
        public static User NEO = new User().initializeIdAndName(1,"Neo");

    }

    interface DBObject {
     User initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id=id;
            this.name=name;
            toString();
return this;// объект типа User (объект на котором производится вызов метода "этот" объект)
        }
    }

}
