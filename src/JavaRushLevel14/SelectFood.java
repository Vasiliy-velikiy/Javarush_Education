package JavaRushLevel14;
/*Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
Для этого нужно:
Реализовать интерфейс Selectable в классе Food.
Метод onSelect() должен выводить на экран фразу "The food was selected".
Подумай, какие методы можно вызвать для переменной food, а какие для — selectable.
В методе foodMethods вызови методы onSelect, onEat, если это возможно.
В методе selectableMethods вызови методы onSelect, onEat, если это возможно.
Не используй явное приведение типов.*/
public class SelectFood {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        food.onSelect();
        food.onEat();
        //тут добавьте вызов методов для переменной food
    }

    public static void selectableMethods(Selectable selectable) {
        selectable.onSelect();
        //тут добавьте вызов методов для переменной selectable
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");

        }
    }

}
