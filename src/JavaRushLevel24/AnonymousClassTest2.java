package JavaRushLevel24;
/*Исправить наследование во всех классах, чтобы вывод метода main был CCBAYS*/
public class AnonymousClassTest2 extends C{
    private class A {
        protected String value = "A";

        public A() {
            System.out.print(value);
        }
    }

    private A a = new A() {//вывод буквы А (т.к переходим к конструктору класса А при создании объекта
        { //у анонимных классов нет своих конструкторов, но что-то можно сделать в блоке инициализации класса
            value = "Y";//пеоезаписываем переменную
            if (super.getClass().getName().contains(".AnonymousClassTest2$")) {
                System.out.print(value);
            }
        }
    };

    public AnonymousClassTest2() {//тк у этого класса есть родитель то неявно содерится ссылка на конструктор родителя super-переходим на строчку 41
        System.out.print("S");//конец--и лишь в самом конце вызываем конструктор класса
    }

    public static void main(String[] args) {
        new AnonymousClassTest2();// начало--т.к класс sоlution потомок  класса С, то при создании объекта переходим в строчу 21-коснтруктора
    }
}
interface JustAnInterface {
    public static final B B = new B();

    class B extends C  {
        public B() {//тк. этот объект явл потомком класса С-неявно вызывается конструктор класса родителя super-опять переходим на строчку 42

            System.out.print("B");  //и лиш потом выводим объект в строчке 36 и далее следуем по порядку- к строчке 12
        }
    }
}

class C implements JustAnInterface {
    public C() {
        System.out.print("C");//выводим букву
        B localB = B;//тк.находится ссылка на новый объект-переходим на строчку 33
    }
}