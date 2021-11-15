package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот,
 который для x%2, потом последний.*/
public class ThreeArrayList {

    public static void main(String[] args) throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> biglist=new ArrayList<Integer>();
        ArrayList<Integer> smalllist_3=new ArrayList<Integer>();
        ArrayList<Integer> smalllist_2=new ArrayList<Integer>();
        ArrayList<Integer> smalllist_other=new ArrayList<Integer>();

//keyboard input 20 values
        for (int i = 0; i <20 ; i++) {
            int a=Integer.parseInt(bf.readLine());
            biglist.add(i,a);
        }
//cycle values which divided alternatively

        for (int i = 0; i <biglist.size() ; i++) {
            if(biglist.get(i)%3==0){
                smalllist_3.add(biglist.get(i));
            }
            if(biglist.get(i)%2==0) {
                smalllist_2.add(biglist.get(i));
            }
            if(!(biglist.get(i)%2==0)&&!(biglist.get(i)%3==0)){
                smalllist_other.add(biglist.get(i));
            }

        }






        printList(smalllist_3);
        System.out.println();
        printList(smalllist_2);
        System.out.println();
        printList(smalllist_other);

    }

    public static void printList(ArrayList<Integer> list) {
        for(int i:list){
            System.out.print(i+" ");
        }
        //напишите тут ваш код
    }
}
