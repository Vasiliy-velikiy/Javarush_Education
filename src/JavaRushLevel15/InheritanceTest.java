package JavaRushLevel15;

import JavaRushLevel13.InterfaceTest3;

/*В этой задаче тебе нужно:
В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
void getRightCup() - выбрать подходящую чашку;
void putIngredient() - положить ингредиенты;
void pour() - залить жидкость.
В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой последовательности: выбирает чашку,
кладет ингредиенты, заливает жидкость.
В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
Распределить следующие фразы между всеми методами в классах LatteMaker и TeaMaker:
"Заливаем кипятком"
"Берем чашку для латте"
"Насыпаем чай"
"Берем чашку для чая"
"Заливаем молоком с пенкой"
"Делаем кофе"
Каждый метод должен выводить в консоль свою фразу, не пересекаясь с другими методами.*/
public class InheritanceTest {
    public static void main(String[] args) {

    }


}

class  LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");

    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");

    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}

class TeaMaker extends  DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");

    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
abstract class DrinkMaker{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }



}