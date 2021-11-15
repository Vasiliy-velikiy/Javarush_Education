package JavaRushLevel8;

import java.util.ArrayList;

/*1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/
public class Family {
    public static void main(String[] args) {
        Human son1=new Human("Zhenia",13,true);
        Human son2=new Human("Lenia",11,true);
        Human son3=new Human("Igor",10,true);

        ArrayList<Human>childrenJunior=new ArrayList<Human>();
        childrenJunior.add(son1);
        childrenJunior.add(son2);
        childrenJunior.add(son3);

        Human father=new Human("Aleksandr",34,true,childrenJunior);
        Human mother=new Human("Olga",29,false,childrenJunior);

        ArrayList<Human>childrenmiddlefather=new ArrayList<Human>();
        childrenmiddlefather.add(father);
        ArrayList<Human>childrenmiddlemother=new ArrayList<Human>();
        childrenmiddlemother.add(mother);




        Human grandfather1=new Human("Nikolay",65,true,childrenmiddlefather);
        Human grandfather2=new Human("Vasiliy",64,true, childrenmiddlemother );
        Human grandmother1=new Human("Zina",63,false,childrenmiddlefather);
        Human grandmother2=new Human("Nina",60,false, childrenmiddlemother);


        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());


        //напишите тут ваш код
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human>children;

        Human(String name,int age,boolean sex,  ArrayList<Human>children){
            this.name=name;
            this.age=age;
            this.sex=sex;
        this.children=children;




        }

        Human (String name,int age,boolean sex){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.children=new ArrayList<>();
        }




        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
