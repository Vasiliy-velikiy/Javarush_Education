package Stream;

import java.io.Serializable;

/*Используя минимум изменений кода сделайте так, чтобы сериализация класса C стала возможной.*/
public class MinimumChanges {

        public class A implements Serializable {
            String name = "A";

            public A(String name) {
                this.name += name;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        public class B extends A  {
            String name = "B";

            public B(String name) {
                super(name);
                this.name += name;
            }
        }

        public class C extends B  {
            String name = "C";

            public C(String name) {
                super(name);
                this.name = name;
            }
        }

        public static void main(String[] args) {

        }


}
