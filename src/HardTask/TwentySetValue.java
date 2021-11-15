package HardTask;

import java.util.*;

/*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.*/
public class TwentySetValue {
    public static Set<Integer> createSet() {

        HashSet<Integer>set=new HashSet<Integer>();


        for (int i = 0; i <20 ; i++) {
            set.add(i);

        }


        System.out.println(set);
        removeAllNumbersGreaterThan10(set);
        System.out.println(set);


        // напишите тут ваш код
return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        //1 способ: неявное создание итератора, но выдает все равно ошибку ConcurrentModificationException
/*
        for (Integer a:set) {
            if(a>10){
                set.remove(a);
            }

        }

 */
//2 способ: создаем копию коллекции. Перебираем копию итератором(так как HashSet хранит данные бези ндекса, и нам нужен метод возврата hasNext, а лишние значения удаляем у оригинала
       /* HashSet<Integer>list2=new HashSet<Integer>(set);
        Iterator<Integer>iterator=list2.iterator();
        while(iterator.hasNext()){
            Integer a=iterator.next();
            if(a>10){
                set.remove(a);//указываем оргинал и что будем в нем удалять
                //отличие от 3 способа-здесь казываем какое значение удаляем(мы это можем сделать так как перебощик у нас перебирает один список
                //а удаляем из другого),в 3 способе же нет аргумента ,так как он удаляем последнее возвращенное значение метода next();

                // - ЭТОТ способ тоже самое что и 3, там не надо копировать в новый SET
            }



        }


        */

        //3вариант:  --самый оптимальный вариант
/*
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            Integer a=iterator.next();
                if(a>10){
                    iterator.remove();//удаляем последнее возвращающее значение метода next
                }
        }
        // напишите тут ваш код



 */
        //4 cпособ
        HashSet<Integer>setother=new HashSet<Integer>();
        for(Integer a:set){
            if(a<=10){
                setother.add(a);
            }
        }
        set.retainAll(setother);//удаляет элементы, не принадлежащие коллекции set
        //a set.removeAll(setother)- удаляет элементы принадлежащие коллекции




        return set;
    }

    public static void main(String[] args) {
createSet();

    }
}