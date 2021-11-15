package JavaRushLevel22;

import java.util.*;

/*Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
*/
public class StringbuilderTest_medium {

    public static void main(String[] args) {
/*
        Map<String, String> map=new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);

        System.out.println(getQuery(map));
        System.out.println(map);



 */
        /*
        Map<String, String> map=new LinkedHashMap<>();
        map.put("name",null);
        map.put("country",null);
        map.put("city",null);
        map.put("age",null);

        System.out.println(getQuery(map));
        System.out.println(map);


         */

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder=new StringBuilder();
        for (Map.Entry pair: params.entrySet()){
            if(pair.getValue()==null  )
                stringBuilder.append("");
            if((pair.getValue()!=null&&pair.getValue()!=null)){
                stringBuilder.append(String.format("%s = '%s' and ",pair.getKey(),pair.getValue()));
            }

        }
        if(stringBuilder.length()>6)// нужна проверка чтобы возвращало пустую строку
                                    // если в строке все значения null  то длина строки будет нулевая
        stringBuilder.delete(stringBuilder.length()-5,stringBuilder.length());
       return stringBuilder.toString().trim();
    }
}
