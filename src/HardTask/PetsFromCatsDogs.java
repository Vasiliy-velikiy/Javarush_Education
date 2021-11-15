package HardTask;


import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.*/
public class PetsFromCatsDogs {
    public static class Dog {

    }
    public static class Cat {

    }
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats,dogs);
        //System.out.println("до удаления    ");//Это нужно для проверки
        printPets(pets);
        //System.out.println("после удаления");//Это нужно для проверки
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();

        Set<Dog>set_dogs=new HashSet<Dog>();
        set_dogs.add(dog1);
        set_dogs.add(dog2);
        set_dogs.add(dog3);
        //напишите тут ваш код
        return set_dogs;
    }

    public static Set<Object> join(Set<Cat> cats,Set<Dog> dogs ) {//
        Set<Object> pets=new HashSet <Object>();
   pets.addAll(cats);
   pets.addAll(dogs);

        //напишите тут ваш код

    return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {

        Iterator iterator=pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //напишите тут ваш код
    }




    //напишите тут ваш код
}

