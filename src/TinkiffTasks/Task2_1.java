package TinkiffTasks;

import JavaRushLevel24.MarkerInterfaceTest3;
/*Вдоль круглого пруда с периметром K расположены N деревень.

i -я деревня находится в A_i метрах от самой северной точки пруда по часовой стрелке.

Вы хотите посетить все N деревень в каком-то порядке. Вы можете начать и закончить свое путешествие в любой деревне,
 при этом вы можете передвигаться только вдоль границы пруда.

Найдите минимальное расстояние, которое вам придется преодолеть, чтобы посетить все N деревень.


Формат входных данных

В первой строке вводятся два числа K и N(2<= K <= 10^6, 2 <= N <= 2 * 10^5) -
периметр пруда и количество деревень соответственно.

В следующей строке вводятся N чисел A_i(0 <= A_i < K) - расстояния от самой северной точки пруда до деревень.

Гарантируется, что A_1 < A_2 < ... <A_N

Формат выходных данных

Выведите одно число  минимальное расстояние, которое необходимо пройти, чтобы посетить все N деревень.


Замечание

В первом примере можно начать путешествие в деревне 1, затем посетить деревню 2, а затем деревню 3.
 Суммарная длина такого путешествия будет равна 10.

Во втором примере можно начать путешествие в деревне 3, затем посетить деревню 1, а затем деревню 2.
 Суммарная длина такого путешествия будет равна 10.

Примеры данных
Пример 1
20 3
5 10 15
вывод:
10
Пример 2
20 3
0 5 15
вывод:
10
Решение*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String []parametry=s.split(" ");

        int peripetr=Integer.parseInt(parametry[0]);

        int countcderevnya=Integer.parseInt(parametry[1]);

        String s2=scanner.nextLine();
        String[]strings=s2.split(" ");
        int[]mass=new int[strings.length];

        for (int i = 0; i < mass.length ; i++) {
            mass[i]=Integer.parseInt(strings[i]);

        }
        //мы можем идти толко по часовой стрелке и против
        //так как движение от первого к псоледнему элементу будет равна той же велечине что от последнего к первому -мы объединяем как первое движение
        //другим вариантом будет движение от последнего к первому и далее к предпоследнему-и среди этих двух вариантов выбираем минимальное расстояние
        int mindist=0;
        ArrayList<Integer>list=new ArrayList<>();
        mindist=mass[mass.length-1]-mass[0]; //дистанция по часовой стрелке от 1го к последнему элементу
        list.add(mindist);
                            //дистанция против часов стрелки от последнего к первому эл.ту
        mindist=peripetr-mass[mass.length-1]+ mass[mass.length-2];//из периметра вычетаю последний эл.т и прибавляю длину до ппредпоследнего
list.add(mindist);

        Collections.sort(list);



        System.out.println(list.get(0));


    }
}
