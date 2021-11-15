package TinkiffTasks;

/*Условие

У вас есть N бревен, длина i-го бревна равна A_i
Вы можете выполнить следующую операцию не более K раз:


Выбрать одно из N бревен и разрезать его. Когда вы разрезаете бревно
длины L  на расстоянии t(0<t<L, tt(0<t<L,t может быть нецелым)) от его конца, оно превращается в два бревна длины
 t и L−t соответственно.

Найдите минимальную длину самого длинного из бревен после того, как вы сделаете не более K операций.
Выведите это число с округлением до ближайшего целого вверх.


Формат входных данных

В первой строке вводятся два числа  N и K (1<= N <= 2 * 10^5, 0 <= K <= 10^9) -количество бревен и разрезов соответственно.

Во второй строке вводятся N чисел A_i (1 <= A_i <=10^9) -длины бревен.


Формат выходных данных

Выведите одно число  минимальную длину самого длинного бревна после разрезов, округленную вверх.

Примеры данных
Пример 1
2 3
7 9
вывод
4
Пример 2
3 0
3 4 5
вывод
5
Решение*/
import java.util.*;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();
        String[]param=s.split(" ");
        int countlogs=Integer.parseInt(param[0]);  //количество бревен
        int incisions=Integer.parseInt(param[1]);

        String s1=scanner.nextLine();
        String []strings=s1.split(" ");
        Integer []lgh_logs=new Integer[strings.length];  //длина каждого бревна



        for (int i = 0; i<lgh_logs.length ; i++) {
            lgh_logs[i]= Integer.parseInt(strings[i]);

        }
       // for (int l:lgh_logs) System.out.println(l);
        ArrayList<Double>list=new ArrayList<>();

        if (incisions>lgh_logs.length) {//если разрезов больше чем количество бревен то делаем разрезы по всем бревнам и оставшиеся разрезы по максимальным половинкам
            for (int i = 0; i < lgh_logs.length; i++) {
                double polbrevna =(double) lgh_logs[i] / 2;
                list.add(polbrevna);//добавляем две половинки
                list.add(polbrevna);
            }
            //делаем разрезы по половинкам
            Collections.sort(list);
            for (int i = incisions-lgh_logs.length-1; i >=0 ; i--) {
                double polbrevna=list.get(i)/2;
                list.set(i,polbrevna);//обновляем одну половинку
                list.add(polbrevna);//и добавляем другу половинку

            }
            Collections.sort(list);
            //System.out.println(list);
            System.out.println((int)(Math.floor(list.get(list.size()-1))));
        }


        //System.out.println(list.get(list.size()-1));

        if (incisions==0){
           List<Integer> list1= Arrays.asList(lgh_logs);
            Collections.sort(list1);
            System.out.println(list1.get(list1.size()-1));
        }



    }
}
