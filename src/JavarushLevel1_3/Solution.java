import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    /*разобраться,почему возраст не увеличивается на 20 */
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);

        //посчитать стоимость всех яблок
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        Apple apple3 = new Apple();
        apple3.addPrice(200);
        System.out.println("Стоимость яблок " + Apple.applesPrice);


      /*Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
то треугольника с такими сторонами не существует



        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String a1=bf.readLine();
        String b1=bf.readLine();
        String c1=bf.readLine();


        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);

        if((a+b)>c&&(b+c)>a&&(a+c)>b  ) {System.out.println("Треугольник существует.");}
        else {System.out.println("Треугольник не существует.");}

*/

        /*Напиши метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из
        двух чисел, записанных в аргументах метода. Например, среди чисел 8 и 11 ближайшее к
        десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:
используй метод public static int abs(int a), который возвращает абсолютную величину числа
        */

        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
/*
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String a1=bf.readLine();
        String b1=bf.readLine();
        String c1=bf.readLine();


        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);

        if(a==b&a==c){System.out.println(a+" "+b+" "+c);}
            else if (a==b){ System.out.println(a+" "+b);}
            else if (a==c){ System.out.println(a+" "+c);}
            else if (b==c){ System.out.println(b+" "+c);}
            else{};


*/


        /*вести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x, где
х - 366 для високосного года,
х - 365 для обычного года.

Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.
       */


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bf.readLine();
        int a = Integer.parseInt(a1);


if((a%400==0)||(a%100!=0)&&(a%4==0)){ System.out.println("количество дней в году: " + 366);}
else{System.out.println("количество дней в году: " + 365); }



        }


    public static void displayClosestToTen(int a, int b) {//должен вызывать метод abs
        if (abs(10 - a) < abs(10 - b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        // напишите тут ваш код

    }


    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }


    }

}
    class Person {
        public int age = 20;

        public void adjustAge(int age) {
            age = age + 20;// здесь нужно указать this.age так как без этого указания у нас изменяется копия
            //копия age  а не сама переменная. Все изменения,
            // которые происходят с копией, никак не влияют на нашу изначальную переменную .
            // Как только мы указываем this.age-переменная класса изменяется
            System.out.println("Age in adjustAge() is: " + age);
        }
    }


     class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice += applesPrice; // присваиваем переменной applesPrice класса Apple всю
            // сумму переменных applesPrice метода addPrice


        }
    }

     class Cat {
        private static int catsCount = 0;

        public void settr(int catsCount) {
            Cat.catsCount = catsCount;

        }
    }

