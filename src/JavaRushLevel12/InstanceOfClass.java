package JavaRushLevel12;
/*Напиши метод, который определяет, какой объект в него передали.
Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык»,
«Корова», «Животное».

Примечание: постарайся определять тип животного как можно более точно.*/
public class InstanceOfClass {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

      if(o instanceof Tiger){
            return "Тигр";
        }
      else if(o instanceof Lion){
            return "Лев";
        }
        else  if(o instanceof Cat){
            return "Кот";
        }else if(o instanceof Bull){
            return "Бык";
        } else if(o instanceof Cow){
            return "Корова";
        }
        //напишите тут ваш код

        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger  extends  Cat{
    }

    public static class Lion  extends Cat{
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }


}
