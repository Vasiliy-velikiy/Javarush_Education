package JavaRushLevel21;

import JavaRushLevel20.SerializeTest4;

/*Разреши клонировать класс А
Запрети клонировать класс B
Разреши клонировать класс C
Не забудь о методах equals и hashCode!*/
public class CloneTest {

    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public A() {

        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }


    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public B() {

        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
           // CloneNotSupportedException e=new CloneNotSupportedException();
            //return e;
            throw new CloneNotSupportedException();
        }
    }





    public static class C extends B implements Cloneable {
        public C() {
        }

        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            //или можно создать так
            //C c=new C(getI(),getJ(),getName());
            C c=new C();//чтобы задать свой режим клонирования в ручную- у всех классво родитеелй должен быть пустой конструктор, по другому не клонировать
            return c;
        }
    }

    public static void main(String[] args) {

    }


}
