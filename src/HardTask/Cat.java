package HardTask;

import java.util.ArrayList;
/*2 задача:- 1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется
этот новый кот. Создать 10 объектов Cat. 3. Метод printCats должен выводить всех котов
на экран. Нужно использовать переменную cats*/
public class Cat {


    public static ArrayList<Cat> cats = new ArrayList<>(); //напишите тут ваш код


    public Cat() {
       //1 вариант добавления котов в список  cats.add(this);//Это звучит так, как будто вы на самом деле спрашиваете, как ссылаться на экземпляр,
        // который вы создаете.Вот что делает ключевое слово this .


    }

    public static void main(String[] args) {


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
//2 вариант добавления котов в список
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);

        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
            //напишите тут ваш код
        }
    }
}