package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей



*/
public class ParentConnections {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null, catGrandfather);


        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandmother,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catMother,catFather);






        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMather;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }



        Cat(String name, Cat parentMather, Cat parentFather) {
            this.name = name;
            this.parentMather = parentMather;
            this.parentFather=parentFather;


        }







        @Override
        public  String toString() {

            if (parentMather == null && parentFather==null)
                return "The cat's name is " + name + ", no mother, no father";
            else if(parentMather==null)
                return "The cat's name is "+name+", no mother, father is "+parentFather.name;
            else if(parentFather==null)
                return "The cat's name is "+name+", mother is "+parentMather.name+", no father";

            else if (!(parentMather == null) && !(parentFather==null))
             return "The cat's name is "+name+", mother is "+parentMather.name+", father is "+parentFather.name;

            return null;
        }
    }

}

