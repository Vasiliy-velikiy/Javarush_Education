package TinkiffTasks;



/*Во время разработки некоторой задачи Саша решил сгенерировать несколько новых тестов. Каждый тест Саши должен представлять
 собой натуральное число, не меньшее l и не большее r. Кроме того, натуральное число в тесте обязательно должно состоять
  из одинаковых цифр.

Например, число 999 подходит под это требование, а число 123 — нет. Какое максимальное число различных тестов сможет
создать Саша?


Формат входных данных

В единственной строке вводятся два натуральных числа l,r   (1 <= l,r <= 10^{18})— ограничения на тесты Саши.

Обратите внимания, что эти числа не вместятся в 32-битный тип данных, используйте 64-битный при необходимости


Формат выходных данных

Выведите одно число — количество тестов, которое может сделать Саша.


Замечание

В первом тесте Саше подходят номера [4,5,6,7]

Во втором тесте подходят все числа, кратные 11, от 11 до 99.

Примеры данных
Пример 1
4  7
вывод
4
Пример 2
10  100
вывод
9
Решение

На самом деле, интересных чисел достаточно мало. Можно их все сгенерировать заранее, а потом
просто для каждого элемента в списке проверить, что он принадлежит отрезку.
Чтобы сгенерировать весь список, надо для каждой цифры k от 1 до 9 сделать генерацию всех
чисел, состоящих только из k. Это делается пошагово: если предыдущее значение было равно x, то
следующее — 10 · x + k.*/

import java.util.*;
public class Task5 {

    public static void main(String[] args) {

    List<Long> list=new ArrayList<>();


        for ( long i = 1; i <Math.pow(10,18);  i=10*i+1 ) {
            list.add(i);
        }
        for ( long i = 2; i <Math.pow(10,18);  i=10*i+2 ) {
            list.add(i);
        }
        for ( long i = 3; i <Math.pow(10,18);  i=10*i+3 ) {
            list.add(i);
        }
        for ( long i = 4; i <Math.pow(10,18);  i=10*i+4 ) {
            list.add(i);
        }
        for ( long i = 5; i <Math.pow(10,18);  i=10*i+5 ) {
            list.add(i);
        }
        for ( long i = 6; i <Math.pow(10,18);  i=10*i+6 ) {
            list.add(i);
        }
        for ( long i = 7; i <Math.pow(10,18);  i=10*i+7 ) {
            list.add(i);
        }
        for ( long i = 8; i <Math.pow(10,18);  i=10*i+8 ) {
            list.add(i);
        }
        for ( long i = 9; i <Math.pow(10,18);  i=10*i+9 ) {
            list.add(i);
        }
        Collections.sort(list);
        //System.out.println(list);

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[]strings=s.split(" ");
        int l=Integer.parseInt(strings[0]);
        int r=Integer.parseInt(strings[1]);

        int count=0;

        for (long i = l; i <=r ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                if (i==list.get(j)){
                    count++;
                }
            }
        }
        System.out.println(count);



    }
}
