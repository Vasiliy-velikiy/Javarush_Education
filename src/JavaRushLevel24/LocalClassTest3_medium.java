package JavaRushLevel24;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/*В классе Dog реализуй логику метода toSayable, которая описана в джавадоке.*/
public class LocalClassTest3_medium {
    public static void main(String[] args) {
        List<Pet> pet = Util3.getPets();
        List<Sayable> pets = Util3.convertPetToSayable(pet);
        Util3.printDialog(pets);
    }
}

/*
В работе вам иногда будет нужно закастить класс к какому-нибудь другому классу, не интерфейсу :)))
Класс DogPet использует 2 класса - SuperDog и Dog, разберись с getName в классе DogPet
Так намного лучше, чем Copy+Paste!
 */
interface Pet {
    public Sayable toSayable(int i);
}
interface Sayable {
    String say();
}

abstract class SuperDog {
    protected String getSuperQuotes() {
        //some logic here
        return " *** ";
    }

    protected SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy EEE");
}
class Util3 {
    //Util отлично работает с классами Dog, Mouse.
    public static void printDialog(List<Sayable> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).say());
        }
    }

    public static List<Pet> getPets() {
        List<Pet> pets = new LinkedList<>();
        pets.add(new Dog("Барбос"));
        pets.add(new Dog("Тузик"));
        pets.add(new Dog("Бобик"));
        pets.add(new Mouse());
        pets.add(new Dog("Шарик"));
        return pets;
    }

    public static List<Sayable> convertPetToSayable(List<Pet> pets) {
        List<Sayable> result = new LinkedList<>();
        for (Pet pet : pets) {
            int i = (int) (Math.random() * 7) - 2;
            result.add(pet.toSayable(i));
        }
        return result;
    }
}
 class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**
     * Если так получилось, что есть готовый класс А (тут SuperDog) с логикой, которую вы хотите использовать.
     * То возможны 3 способа:
     * 1) из класса А скопировать логику себе (это плохо, т.к. поддерживать несколько копий одного и того же кода проблематично)
     * 2) создать экземпляр класса А внутри нашего класса и использовать его, связь has-a (не всегда подходит, т.к. класс А сам по себе)
     * 3) создать внутренний класс, который наследуется от А, использовать его методы вместе с
     * методами и полями нашего класса, т.к. внутренний класс имеет доступ к своему родителю как наследник,
     * а также ко всем полям и методам включая private того класса, в который он вложен.
     * <p/>
     * Итак, разбираемся с п.3:
     * Внутри метода toSayable создайте class DogPet, который наследуется от SuperDog и реализует интерфейс Sayable
     * создайте метод private String getName(), который будет использовать логику двух классов - Dog и SuperDog.
     * Пусть этот метод возвращает имя собаки (класс Dog), которое с обеих сторон выделено getSuperQuotes (класс SuperDog)
     * Пример, " *** Барбос *** "
     * Логика метода say:
     * Если i < 1, то используя метод getName вывести на экран, что собака спит. Пример, " *** Шарик ***  спит."'
     * Иначе вывести фразу: "имя_собаки лает гааав! сегодняшняя_дата". Пример для i=3, " *** Тузик ***  лает гааав! 13-ноя-2013 Ср"
     * Для форматирования даты используйте formatter из класса SuperDog.
     * <p/>
     * <b>Пример вывода:</b>
     *  *** Барбос ***  лает гааааав! 13-ноя.-2013 ср
     *  *** Тузик ***  лает гаав! 13-ноя.-2013 ср
     *  *** Бобик ***  лает гааав! 13-ноя.-2013 ср
     * Мышь пищит.
     *  *** Шарик ***  спит.
     *
     * @param i количество букв 'а' в слове гав
     * @return экземпляр класса DogPet
     */
    public Sayable toSayable(final int i) {
        class DogPet extends SuperDog implements Sayable{

            @Override
            public String say() {
                String s;
                if(i<1) s=getName()+" "+"спит.";
                else {
                    s=getName()+" "+"лает г";
                    for (int j = 0; j <i ; j++) {
                        s+="а";

                    }
                    s+="в! ";
                    Date date=new Date();
                    s+=formatter.format(new Date());

                }
                return s;
            }

            private String getName(){
                String s=getSuperQuotes()+""+Dog.this.name+""+getSuperQuotes();
                return s;
            }
        }
        DogPet dogPet=new DogPet();
        return dogPet;
    }
}

/*
обратите внимание, как именно Mouse отличается от Dog
Этот класс - привычный для вас.
*/
 class Mouse implements Pet, Sayable {
    @Override
    public Sayable toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Мышь пищит.";
    }
}
