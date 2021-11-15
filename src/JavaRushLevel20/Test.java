package Stream;


/*Расставить обращение к методам суперкласса и модификаторы доступа так, чтобы вывод на экран был следующим:

C class, method2
A class, method2
A class, method1
B class, method1

1. Из одного метода можно вызвать только один метод суперкласса.
2. Из одного метода можно вызвать только один метод класса.
3. Можно менять модификаторы доступа к методам.*/
public class Test {
    public static void main(String[] s) {
        A a = new C();
        a.method2(); //смотрим на цепочку вызовов, 1 вызов класс С метод 2

    }

    public static class A {
        private static void method1() {
            System.out.println("A class, method1");//печатаем на экран и переходим к строчке 35 которая ожидала своей очереди вызова
        }

        public void method2() {//Вызов из 34 строчки
            System.out.println("A class, method2");//печатает на экран и вызы-
            method1();//вает свой статический метод 1(если мы не поставим перед классом А private static- то в этой строчке будет вызываться 1ый метод класса С
        }
    }

    public static class B extends A {
        public void method1() {//из 51 строчки был вызван метод 1 который в свою очередь вызы-
            super.method2();//-вает метод 2 Класса А
            System.out.println("B class, method1");
        }

        public void method2() {
            System.out.println("B class, method2");//печатаем и завершаем вызовы
        }
    }

    public static class C extends B {
        public void method1() {
            System.out.println("C class, method1");

        }

        public void method2() {
            System.out.println("C class, method2");//печать на экран
            super.method1();//и обращение к методу 1 Класса В

        }
    }
}
