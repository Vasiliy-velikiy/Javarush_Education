package JavaRushLevel15;
/*В этой задаче тебе нужно:
Создать класс Cat с публичным полем name типа String в классе Solution.
В статическом блоке создать объект типа Cat и присвоить его переменной cat (не забудь инициализировать поле name).
В статическом блоке вывести имя созданного кота на экран.
Примечание: не создавай конструкторы с параметрами в классе Cat.*/
public class StaticTest {
    public static Cat cat;
static {
    cat=new Cat();
    cat.name="myrzik";
    System.out.println(cat.name);
}

    public static void main(String[] args) {

    }

    public static  class Cat{
       public String name;


    }
}


