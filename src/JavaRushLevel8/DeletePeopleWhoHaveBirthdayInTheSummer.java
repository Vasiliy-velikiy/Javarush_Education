package JavaRushLevel8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "
дата рождения".
Удалить из словаря всех людей, родившихся летом.*/
public class DeletePeopleWhoHaveBirthdayInTheSummer {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 10 1995"));
        map.put("Харьков", dateFormat.parse("JUNE 10 2007"));
        map.put("Стоянов", dateFormat.parse("JUNE 11 2008"));
        map.put("Огурцов", dateFormat.parse("JUNE 12 2009"));
        map.put("Херабора", dateFormat.parse("JUNE 14 2010"));
        map.put("Упырь", dateFormat.parse("OCT 1 2012"));
        map.put("Шалтай", dateFormat.parse("OCT 13 2012"));
        map.put("Друзь", dateFormat.parse("OCT 11 2012"));
        map.put("Грузь", dateFormat.parse("OCT 21 2012"));




        removeAllSummerPeople(map);

        //напишите тут ваш код
    return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>>iterator=map.entrySet().iterator();
        while (iterator.hasNext()){

            int i=iterator.next().getValue().getMonth()+1; //У класса date есть методы взятия месяца
            if (i<9&&i>5){
                iterator.remove();
            }
        }

        //напишите тут ваш код

    }

    public static void main(String[] args) throws ParseException {
        createMap();

    }

}
