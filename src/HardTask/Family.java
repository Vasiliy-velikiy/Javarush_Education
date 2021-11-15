package HardTask;

import org.w3c.dom.ls.LSOutput;

/*Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта
 на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 */
public class Family {

    public static void main(String[] args) {
//Create block
        Human DedKolia=new Human("Коля",true,65);
        Human DedNikita=new Human("Никита",true,63);
        Human BabkaDusai=new Human("Dusai",false,54);
        Human BabkaNina=new Human("Нина",false,60);


        Human FatherSergey=new Human("Sergey",true,30, DedKolia, BabkaNina);
        Human MotherIra=new Human("Ira",false,32,DedNikita,BabkaDusai);

        Human SonEric=new Human("Eric",true,15,FatherSergey,MotherIra);
        Human SonPiter=new Human("Piter",true,12,FatherSergey,MotherIra);
        Human SonMark=new Human("Mark",true,10,FatherSergey,MotherIra);






        //Output Block
        System.out.println(DedKolia.toString());
        System.out.println(DedNikita.toString());
        System.out.println(BabkaDusai.toString());
        System.out.println(BabkaNina.toString());

        System.out.println(FatherSergey.toString());
        System.out.println(MotherIra.toString());

        System.out.println(SonEric.toString());
        System.out.println(SonMark.toString());
        System.out.println(SonPiter.toString());
        // напишите тут ваш код
    }






 public static  class Human {
     String name;
     boolean sex;
     int age;
     Human father;// если объявить какую то из этих переменных static то она будет одинакова для всех объектов Human
     Human mother;

     Human(String name, boolean sex, int age, Human father, Human mother){
         this.name=name;
         this.sex=sex;
         this.age=age;
         this.father=father;
         this.mother=mother;
     }
     Human(String name, boolean sex, int age){
         this.name=name;
         this.sex=sex;
         this.age=age;

     }






     public String toString() {
         String text = "";
         text += "Имя: " + this.name;
         text += ", пол: " + (this.sex ? "мужской" : "женский");
         text += ", возраст: " + this.age;

         if (this.father != null) {
             text += ", отец: " + this.father.name;
         }

         if (this.mother != null) {
             text += ", мать: " + this.mother.name;
         }

         return text;
     }

    }

}