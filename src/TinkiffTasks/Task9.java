package TinkiffTasks;

import JavaRushLevel24.MarkerInterfaceTest3;



/*Даня в обеденный перерыв ходит в одно и то же кафе. Ему, как сотруднику банка, положено специальное предложение:
при каждой покупке больше, чем на 100 рублей, Даня получает купон на бесплатный обед.

Даня узнал стоимость своих обедов на ближайшие n дней. Ему хочется минимизировать свои затраты, грамотно используя талоны.
Требуется найти минимальные суммарные затраты Дани на обеды.


Формат входных данных

В первой строке дается натуральное число n(0 <= n <= 100) В каждой из n строк записана стоимость обеда в каждой из дней
(неотрицательное целое число, не больше, чем 300).


Формат выходных данных

В первой строке выдайте минимально возможную суммарную стоимость обедов.


Замечание

В первом примере Дане придется купить первые 3 обеда, после чего у него появится талон.
 Этот талон будет выгоднее всего потратить на последний обед. Таким образом, он купит первые 4 обеда и получит пятый
  бесплатный.
пример
5
35
40
101
59
63

вывод
235
Решение
Воспользуемся методом динамического программирования: dp[n][k]— стоимость, которую потратит Даня за n обедов,
если у него осталось k талонов. Тогда формула пересчета имеет вид:
dp[n + 1][k] = min(dp[n][k − (if an > 100then1else0)] + an, dp[n − 1][k + 1])
Для восстановления ответа кроме минимума требуется хранить тот переход, на котором минимум
был достигнут.

  */
;
import java.io.IOException;

import java.util.*;
public class Task9 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        int countdinner=scanner.nextInt();


       Integer[]dinners=new  Integer[countdinner];
        for (int i = 0; i <countdinner ; i++) {
            int a=scanner.nextInt();
            dinners[i]=a;
        }

       /* for(int a:dinners){
            System.out.print(a+" ");
        }*/
        int sum=0;
        ArrayList<Integer>sum4elements=new ArrayList<>();
        //List<Integer> test=new ArrayList<>( Arrays.asList(dinners));
        List<Integer> test;


        for (int i = 0; i <countdinner ; i++) {
            test=new ArrayList<>( Arrays.asList(dinners));
            test.set(i,0);
            for (int j = 0; j <test.size() ; j++) {
                //System.out.print(test.get(i)+ " ,");
                sum=sum+test.get(j);
               // System.out.print(sum+" ");
            }
            sum4elements.add(sum);
            sum=0;
            //System.out.println();
        }

     //   System.out.println(sum4elements);
        Collections.sort(sum4elements);
        System.out.println(sum4elements.get(1));


    }
}
