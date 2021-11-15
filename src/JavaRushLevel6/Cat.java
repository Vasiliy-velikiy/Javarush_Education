package JavaRushLevel6;
/*1задача:  - Создать статическую переменную int catCount в классе Cat. Создай конструктор
[public Cat()], в котором увеличивай данную переменную на 1.

- Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount

 -В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение
переменной catCount на экран.




*/


import java.util.ArrayList;

public class Cat {

ArrayList<Cat>cats= new ArrayList<>();


    static int catCount=0;

   public Cat(){


        catCount++;
    }

    public static void main(String[] args) {

       Cat cat=new Cat();
        printCats();
    }





public static void printCats(){


}

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }
}
