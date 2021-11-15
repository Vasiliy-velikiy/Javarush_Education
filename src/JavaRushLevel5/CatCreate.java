package JavaRushLevel5;

import jdk.jfr.DataAmount;

import java.util.concurrent.Callable;

/*Создать класс Cat. У кота должно быть имя
(name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/
public class CatCreate {
    public static void main(String[] args) {
/*Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
Наполните этих троих жизнью, то есть, конкретными данными.
*/

        Cat1 cat1=new Cat1("barankin", 4,8,1);
        Cat1 cat2=new Cat1("snuf",1,12,4);
        Cat1 cat3=new Cat1("zhiga",2,10,2);





   /*Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.*/


/*
        Cat cat1=new Cat();
        cat1.name="Barsik";
        cat1.age=2;
        cat1.weight=1;
        cat1.strength=1;

       Cat cat2=new Cat();
        cat2.name="Barsik";
        cat2.age=3;
        cat2.weight=1;
        cat2.strength=1;

       Cat cat3=new Cat();
        cat3.name="Barsik";
        cat3.age=1;
        cat3.weight=1;
        cat3.strength=1;


 */
        System.out.println(cat1.fight(cat2));
        //System.out.println(cat2.fight(cat1)); -для проверки,2,4,6 выражения служат для проверки- противоположное значение

        System.out.println(cat2.fight(cat3));
        //System.out.println(cat3.fight(cat2));

        System.out.println(cat1.fight(cat3));
        //System.out.println(cat3.fight(cat1));


    }
}







 class Cat1{

    String name;
    int age;
    int weight;
    int strength;

    Cat1( String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }




   /*Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были
лучшие показатели по большинству критериев.Метод должен определять, выиграли ли мы (this)
бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false*/
/*если у нас есть конструктор, то при создных котах таким образом  Cat cat1=new Cat("barankin", 4,8,1)
 выражение if (this.age < anotherCat.age) return true;
       else return false; всегда будет FALSE, потому что this.age будет ссылаться на значение
       класса int age; которая не проинициализирована явным образом

 */


/*
       public boolean fight(Cat anotherCat) {
           int pobeda_po_kriteriu=0;
           if(this.age<anotherCat.age)
               pobeda_po_kriteriu++;
           else if (this.age>anotherCat.age)    pobeda_po_kriteriu--;

           if(this.weight>anotherCat.weight)
               pobeda_po_kriteriu++;
           else if (this.weight<anotherCat.weight) pobeda_po_kriteriu--;

           if (this.strength>anotherCat.strength)
               pobeda_po_kriteriu++;
           else if (this.strength<anotherCat.strength) pobeda_po_kriteriu--;

           if (pobeda_po_kriteriu>0) return true;
           else return false;

       }

 */

/*можно так же реализовать в методе fight сравнение с помощью метода упорадочивания
 обьектов одного типа- compare. Этот метод может работать как с конструктором класса,
 так и с созданием объекта и инициализ переменных поочередно, тогда как СМ ВЫШЕ предыдущая
 реализация метода не может работать с конструктором- будет постоянно показывать либо true ,либо false во всех операциях
-compare возвращает положительное число если вызывающий объект больше объекта переданного в качестве параметра
-отрицательное,если вызывающий объект меньше объекта переданного в качестве параметра
-ноль если объекты равны
 */
        public boolean fight (Cat1 anotherCat){
            int AgeScore = Integer.compare(anotherCat.age, this.age );// так как
            //у нас чем меньше возраст тем шанс победы больше
            int StreightScore = Integer.compare(this.strength, anotherCat.strength);
            int WeightScore = Integer.compare(this.weight, anotherCat.weight);

            int score = AgeScore + StreightScore + WeightScore;
            if (score > 0) return true;//return score>0?true:false (если 1 выражение будет истиным
                //то возвращается 2 выражение, если 1 выражение ложное-возвращается 3 выражение
            else return false;

        }
    }



/*Создать class Person.
У человека должно быть имя String name, возраст int age, адрес String address, пол char
 Создай геттеры и сеттеры для всех переменных класса Person.*/
class Person    {

    String name;
    int age;
    char sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

/*Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создай геттеры и сеттеры для всех переменных класса Dog.*/
class  Dog1{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
