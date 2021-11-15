package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи*/
public class WhyLivesInCity {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> listcity = new ArrayList<>();
        List<String> listfamily = new ArrayList<>();

//блок ввода значений
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            listfamily.add(family);
            String city = reader.readLine();
            listcity.add(city);

        }

//блок создания словаря

        Map<String, String> map = new LinkedHashMap<String, String>();//
        for (int i = 0; i < listcity.size(); i++) {
            map.put(listcity.get(i), listfamily.get(i));

        }

        //System.out.println(map);//проверяем что скопировалаось в словарь

        String wholiveincity = reader.readLine();



//или так
        //Iterator<Map.Entry<String,String>> mapIterator=map.entrySet().iterator();
//while(mapIterator.hasNext()){
        //Map.Entry<String,String>entry=mapIterator.next();
        //getkey
        //String s1=entry.getKey();
        //get value
        //String s2=entry.getValue();
        for (Map.Entry<String,String>entry: map.entrySet()){
            String s1=entry.getKey();
            String s2=entry.getValue();
            if (wholiveincity.equals(s2)){
                System.out.println(s1);

            }
        }
//2cпособ
/*
   HashMap<String,String>map=new HashMap<String, String>();
        for(;;){
            String city=reader.readLine();
            if(city.isEmpty()){
                break;
            }
            String name=reader.readLine();
            map.put(name,city);

        }
        String input=reader.readLine();

        for (Map.Entry<String,String>entry:map.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();

            if (input.equals(key)) {
                System.out.println(value);
            }
        }




        */




        //  }


    }
}
    /* инетресная мысли(не способ)

class MyMap{
    String key;
    String value;

   //public MyMap(String s, String s1) {

   // }
   Map<List<String>, List<String>> map=new HashMap<>();
        List<MyMap> newList = new ArrayList<>();
        for (int i=0;i<listcity.size();i++){
            newList.add(new MyMap(listcity.get(i),listfamily.get(i)));
        }
}

     */
