package JavaRushLevel8;
/*Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TenThousandInsert {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        long startTime = System.currentTimeMillis();
        // напишите тут ваш код

        insert10000(list);

        // напишите тут ваш код
return System.currentTimeMillis()-startTime;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
