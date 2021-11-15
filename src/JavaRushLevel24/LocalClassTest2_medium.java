package JavaRushLevel24;


import java.util.LinkedList;
import java.util.List;

/*В классе Cat реализуй логику метода toSayable, которая описана в джавадоке*/
public class LocalClassTest2_medium {
    public static void main(String[] args) {
        List<Pet1> pet = Util2.getPets();
        List<Sayable1> pets = Util2.convertPetToSayable(pet);
        Util2.printDialog(pets);
    }
}
interface Pet1 {
    public Sayable1 toSayable(int i);
}
 interface Sayable1 {
    String say();
}



 class Util2 {
    //Util отлично работает со всеми классами Cat, Mouse. А ведь Mouse отличается от Cat.
    public static void printDialog(List<Sayable1> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).say());
        }
    }

    public static List<Pet1> getPets() {
        List<Pet1> pets = new LinkedList<>();
        pets.add(new Cat1("Мурзик"));
        pets.add(new Cat1("Васька"));
        pets.add(new Cat1("Кошка"));
        pets.add(new Mouse1());
        pets.add(new Cat1("Томас"));
        return pets;
    }

    public static List<Sayable1> convertPetToSayable(List<Pet1> pets) {
        List<Sayable1> result = new LinkedList<>();
        for (Pet1 pet : pets) {
            int i = (int) (Math.random() * 7) - 2;
            result.add(pet.toSayable(i));
        }
        return result;
    }
}



/*
обратите внимание, как именно Mouse отличается от Cat
Этот класс - привычный для вас.
*/
 class Mouse1 implements Pet1, Sayable1 {
    @Override
    public Sayable1 toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Мышь пищит.";
    }
}

/*
В работе вам иногда будет нужно закастить класс к какому-нибудь интерфейсу (тут Sayable),
который не реализован в текущем классе
 */
 class Cat1 implements Pet1 {
    private String name;

    public Cat1(String name) {
        this.name = name;
    }

    /**
     * Это - механизм адаптирования к другому интерфейсу - Sayable
     * Внутри метода toSayable создайте class CatPet, реализующий интерфейс Sayable
     * Логика метода say:
     * Если i < 1, то вывести на экран, что кот спит. Пример, "Васька спит."
     * Иначе вывести фразу: "имя_кота говорит мяу!". Пример для i=3, "Васька говорит мяяяу!"
     * <p/>
     * <b>Пример вывода:</b>
     * Мурзик спит.
     * Васька говорит мяяу!
     * Кошка говорит мяяяяяу!
     * Мышь пищит.
     * Томас говорит мяу!
     * <p/>
     *
     * @param i количество букв 'я' в слове мяу
     * @return экземпляр класса CatPet
     */
    public Sayable1 toSayable(final int i) {
        class CatPet implements Sayable1 {

            @Override
            public String say() {
                String s;
                if (i<1)  s= Cat1.this.name+" "+"спит.";
                else {
                    s = Cat1.this.name + " " + "говорит м";
                    for (int j = 0; j < i; j++) {
                        s += "я";
                    }
                    s += "у!";
                }

                return s;
            }
        }
        CatPet catPet=new CatPet();
        return catPet;
    }
}