package JavaRushLevel8;

import java.util.*;

/*1. Внутри класса SetFromCat создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять
в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались
во множестве.

Каждый кот с новой строки.*/
public class SetFromCat {
    public static class Cat{
    }

    // step 1 - пункт 1

    public static void main(String[] args) {

        Set<Cat> cats = createCats();

        //  cats.remove(cats.toArray()[0]);-удаляем элемент который конвертировали в массим с индексом 0
//или
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());//удаляю первый возвращающийся обьект

//или так  for (Cat cat : cats) {
//         cats.remove(cat);
//         break;
//     }

        System.out.println(cats.size());

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);


    }

    public static Set<Cat> createCats() {
        Set<Cat>set= new HashSet<Cat>();

        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();


        set.add(cat1);
        set.add(cat2);
        set.add(cat3);



        //напишите тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        //или так  for (Cat cat: cats) {
        //            System.out.println(cat);
        //        }

        Iterator iterator=cats.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // step 4 - пункт 4
    }





}
