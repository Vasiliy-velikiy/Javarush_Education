package JavaRushLevel18;

import java.io.*;
import java.util.*;

/*Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361*/
public class CountSymbol_hard {
    public static void main(String[] args) throws IOException {
        //1способ


        FileInputStream fileReader = new FileInputStream(args[0]);//поток считывает символы из параметра args[0]
        // значения ascii-это 256 вариаций, но частота символов может больше быть чем поместит в себя byte[]
        int[] symbolbuff = new int[256];


        for (int i = 0; i < fileReader.available(); i++) {//интервал считывания-все символы в файле
            symbolbuff[fileReader.read()]++;//считывает байт из файла и увеличивает на 1 ячейку массива индекс
            // которой соотетвует этому байту. В итоге самое большое значение в массиве будет у ячейки, которая соотетсвует самому частому байту)байтам
//остается найти  в массиве максимум и вывести индексы ячеек, имеющих максимальное значение
        }


      //  Arrays.sort(symbolbuff);-не нужно сортировать так как по asii начинаются символы с байта, которые в десятичной форме начинается с нуля, далее 1,2,3 и тд

        for (int i = 0; i < symbolbuff.length; i++) {//цикл для вывода
            if (symbolbuff[i] != 0) {//проверка на пустое значение
                System.out.println((char) i + " " + symbolbuff[i]);
            }

        }
        fileReader.close();

    }
//2способ
/*
    BufferedReader bufferedReader=new BufferedReader(new FileReader(args[0]));
    Map<Integer,Integer>map=new TreeMap<>();//Treemap хранит в отсортированном виде по ключу

    int count=1;//счетчик для повтора
    int symbol;//числовое представление символов,которые читаются bufferedReader.read();

         while (bufferedReader.ready()) {
             symbol = bufferedReader.read();

             if (map.containsKey(symbol)) {
                 count = map.get(symbol) + 1;
             }
             map.put(symbol, count);
             count = 1;
         }
         for (Map.Entry<Integer,Integer>pair : map.entrySet()){
             int symbolchar=pair.getKey();//ключи хранятся в int чтобы привести их к char сделаем промежуточную переменную symbolchar
             System.out.println((char)symbolchar+" "+pair.getValue());

         }
         bufferedReader.close();



 */

    //3способ не работает
    /*FileInputStream ascii=new FileInputStream(args[0]);//поток считывает байты из параметра args[0]
        FileReader fileReader=new FileReader(args[0]);//поток считывает символы из параметра args[0]
        BufferedReader bf=new BufferedReader(fileReader);//создаем буфер для чтения даннхы из файла
        HashMap<Character, Integer> map=new HashMap<>();//создаем коллекцию для хранения символов и количества их повторов

        while (bf.ready()) {//пока в буфере есть данные для чтения
            char[] symbol = bf.readLine().toCharArray();//кажду строку дробим на символы и помещаем в массив

            for (char i : symbol) {
                if (!map.containsKey(i))
                    map.put(i, 1);//счетчик для символов и количества повторений
                else {
                    int value = map.get(i);//get-возвращает значение объекта, ключ которого равен b
                    //Чтобы положить объект в коллекцию, используется метод put,
                    // а чтобы получить по ключу - метод get.
                    map.put(i, value + 1);//счетчик для символов и количества повторений
                }
            }
        }

        List<Integer> listvalue = new ArrayList<Integer>(map.values());
        List<Character> listkey = new ArrayList<Character>(map.keySet());

//сортировка по возрастанию кода ASCII
        for (int i = 0; i <listkey.size() ; i++) {
            for (int j = listkey.size()-1; j >=i ; j--) {
                if ((int)listkey.get(j)<(int)listkey.get(j-1)){
                    int middle=(int)listkey.get(j);
                    listkey.set(j, listkey.get(j-1));
                    listkey.set(j-1,(char) middle);
                }

            }

        }

        //Collections.sort(listkey);

    fileReader.close();//закрываем поток считывания

        for (Character character: listkey){
            System.out.println(character+" "+map.get(character));
        }




    *
    */


}