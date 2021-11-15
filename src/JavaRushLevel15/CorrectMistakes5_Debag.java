package JavaRushLevel15;
/*Программа выводит 0 9, а должна — 6 9. Найди одну(!) ошибку и исправь ее.
Используй дебаг. Для этого поставь breakpoint-ы (Ctrl+F8), потом зайди в меню Run -> Debug.
F9 - выполнение кода до следующего breakpoint-а.
F8 - переход к следующей строке кода.

F8 — идти по участку кода и не заходить во внутренние методы;
F7 — идти по участку кода и заходить во внутренние методы.*/
public class CorrectMistakes5_Debag {

    //исходный вариант
    /*public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }
}*/
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 6;

        public A(int f1) {
            initialize();
            this.f1 = f1;

        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);

            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }
}
