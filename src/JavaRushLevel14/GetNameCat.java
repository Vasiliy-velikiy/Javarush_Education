package JavaRushLevel14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:
Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
вывести на экран cat.toString().*/
public class GetNameCat {

    public static void main(String[] args) throws Exception {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
for (;true;) {
    String str = bf.readLine();
    if (str.isEmpty()){
        break;
    }
    System.out.println(CatFactory.getCatByKey(str));
}

    }

      static   class CatFactory   {



          public static    Cat getCatByKey(String key) {
               Cat cat = null;
                if ("vaska".equals(key)) {
                    cat = new MaleCat("Василий");
                } else if ("murka".equals(key)) {
                    cat = new FemaleCat("Мурочка");
                } else if ("kiska".equals(key)) {
                    cat = new FemaleCat("Кисюлька");
                } else {
                    cat = new Cat(key);
                }
                return cat;
            }
        }

       static class Cat   {
            private String name;

            protected Cat(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public String toString() {
                return "Я уличный кот " + getName();
            }
        }

       static   class MaleCat extends Cat {
            MaleCat(String name) {
                super(name);
            }

            public String toString() {
                return "Я - солидный кошак по имени " + getName();
            }
        }

         static class FemaleCat extends Cat {
            FemaleCat(String name) {
                super(name);
            }

            public String toString() {
                return "Я - милая кошечка по имени " + getName();
            }
        }

    }



