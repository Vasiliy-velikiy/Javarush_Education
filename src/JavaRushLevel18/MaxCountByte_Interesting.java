package JavaRushLevel18;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

/*Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.*/
public class MaxCountByte_Interesting {
    public static void main(String[] args) throws IOException {
//для хранения значений байтов и их повторов нам нужен map где значение байтов-key , а повторов-value
        HashMap<Integer,Integer>map=new HashMap<>();



        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        FileInputStream fileInputStream=new FileInputStream(s);
        //?int count=1;//каждое значение имеет счетчик 1(количество таких значений) -само себя
//available-метод возвращает количество непрочитанных байтов
        while (fileInputStream.available()>0) {
            //метод read()-метод читает один байт из файла и возвращает его как результат. Тип результата
            //расширяется до int.
            int b = fileInputStream.read();



            if (!map.containsKey(b))
                map.put(b, 1);
            else {
                int value = map.get(b);//get-возвращает значение объекта, ключ которого равен b
                //Чтобы положить объект в коллекцию, используется метод put,
                // а чтобы получить по ключу - метод get.
                map.put(b, value + 1);


            }
        }
//неверный результат-этот способ считает только количество записей в мапе а не частоту конкретного  байта
        //перебор map для поиска похожих значений и внесение их map
/*
            for (Integer i : map.keySet()) {// ИТЕРАЦИЯ-перебераем каждое значение  по уникальным значениям  так как они единичны, а value-будет перезаписываться
                if (map.containsKey(a)) {//если какое то значение похоже на считываемое то увеличиваем счетчки на 1
                    count++;
                }


            }
            map.put(a, count);//-записываем уникальное значение и число повторений
            count = 1;//-необходимо сбросить счетчик чтобы он начал отсчет для другого значения
        }

 */
            //поток нам больше не нужен, закрываем его
        fileInputStream.close();

//для сортировки методом Collection.sort нам необходимо value внести в список и отсортировать по возрастанию( для простоты)
        List<Integer> list = new ArrayList<Integer>(map.values());
        List<Integer> listkey = new ArrayList<Integer>(map.keySet());
        Collections.sort(list);
        //смтрим списрк
       // System.out.println(list);
        //смотрим максимальное число повторений
        //System.out.println(list.get(list.size()-1));


        //После чего пробегитесь по элементам и выведите те,
        // у которых записанное в HashMap количество повторов равно найденному максимуму.
//Map.Entry<K, V>> entrySet(): возвращает набор элементов коллекции.
// Все элементы представляют объект Map.Entry
//
    //неверно так сравнивать pair.getValue()==list.get(list.size()-1) - это сравнение ссылочных типов.
    /*
    for (Map.Entry pair:map.entrySet()) {
    if(pair.getValue()==list.get(list.size()-1)){
        //то будет выводится
        System.out.print(pair.getKey()+" ");

}
}

     */
        int max=Collections.max(map.values());

        for (Integer i: map.keySet()){
            if(map.get(i)==max){
                System.out.print(i+" ");
            }
        }





//проверка-какие байты повторяются n-число раз
        System.out.println(map);


    }
}
