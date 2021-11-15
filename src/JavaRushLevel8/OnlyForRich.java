package JavaRushLevel8;

import java.util.*;

/*Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу:
 "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.*/
public class OnlyForRich {
    public static Map<String, Integer> createMap() {
        Map<String,Integer>map=new HashMap<String, Integer>();
        map.put("Richmond",500);
        map.put("Phili",4000);
        map.put("Jonson",3500);
        map.put("Westbrook",50000);
        map.put("Lopez",200);
        map.put("Fox",4500);
        map.put("Libombo",6000);
        map.put("Abigale",300);
        map.put("Batler",350);
        map.put("Kerel",5789);






        System.out.println(map);
removeItemFromMap(map);
        System.out.println(map);
        return map;


        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

//1способ

        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator(); //cоздаем интератор,с парными значениями из map
while(iterator.hasNext()) {//засталяем возвращать значения из скопированных в пред шаге
    Map.Entry<String, Integer> entry=iterator.next();//создаем новуюмапу с двоиным значением и говорим ей применять на себя все возвращающие значения с помощью метода next()
    String key=entry.getKey();//делим  на ключ и значения
    Integer value=entry.getValue();
    if (value < 500) {//если прис. опр условие интератор удаляет последнее возвращенное значение
        iterator.remove();
    }
}




  //нельзя одновременно проводить перебор и изменять/удалять элементы- возникает ошибка
        //поэтому ед варинат -интератор(1 способ)



        /*
        for (Map.Entry<String,Integer>entry:map2.entrySet()){

            String key=entry.getKey();
            Integer value=entry.getValue();

            if(value<500){
                map.remove(entry.getValue());
            }
        }



         */





       }



      //напишите тут ваш код


    public static void main(String[] args) {

createMap();

    }

}
