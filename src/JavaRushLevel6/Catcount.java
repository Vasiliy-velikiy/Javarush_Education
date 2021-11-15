package JavaRushLevel6;
/*1) В конструкторе класса Catcount [public Cat()] увеличивать счётчик котов
(статическую переменную этого же класса catCount) на 1.
В методе finalize уменьшать на 1


2) Создать статическую переменную int catCount в классе Cat. Создай конструктор
[public Cat()], в котором увеличивай данную переменную на 1.*/


public class Catcount {






    public static int catCount = 0;

    Catcount() {
        catCount++;
    }

    protected void finalize() throws Throwable {
        catCount--;
    }

    public static void main(String[] args) {
       Cat cat1=new Cat();
       Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();
        Cat cat5=new Cat();
        Cat cat6=new Cat();
        Cat cat7=new Cat();
        Cat cat8=new Cat();
        Cat cat9=new Cat();
        Cat cat10=new Cat();
        System.out.println(Cat.catCount);


    }

}

