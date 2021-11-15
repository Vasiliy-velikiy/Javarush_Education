package JavaRushLevel13;
/*Посмотри на программу и исправь ее, чтобы она компилировалась и работала:
Вынеси реализацию метода initializeIdAndName в класс User.
Сделай так, чтобы initializeIdAndName в классе User возвращал тип User.*/
public class MistakeInCode2 {
    //исходный вариант
    /*public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {//ОШИБКА- МЕТОД В ИНТЕРФЕЙСЕ ЛИШЬ ОПИСЫВАЕТ ПОВЕДЕНИЕ НО НЕ РЕАЛИЗУЕТ
        DBObject initializeIdAndName(long id, String name) {//метод будет статичным  без тела и без типа DBObject
            this.id = id;
            this.name = name;
            return this;
        }
    }

    static class User implements DBObject {//должен быть реализован метод initializeIdAndName и возвращать тип User c ереданными параметрами
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }*/
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        static void initializeIdAndName(long id, String name) {

        }
    }

    static class User implements DBObject {


        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }
}
