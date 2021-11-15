package JavaRushLevel8;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*змерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.
*/
public class TenThousandGetValue {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));

    }
        public static List fill (List list){
            for (int i = 0; i < 10000; i++) {
                list.add(new Object());
            }
            return list;
        }

        public static long getGetTimeInMs (List list){
            // напишите тут ваш код
long i=System.currentTimeMillis();
            get10000(list);

            // напишите тут ваш код
return System.currentTimeMillis()-i;
        }

        public static void get10000 (List list){
            if (list.isEmpty()) {
                return;
            }
            int x = list.size() / 2;

            for (int i = 0; i < 10000; i++) {
                list.get(x);// получение значения для ArrayList роисходить быстрее потому что
                //мы указываем конкретный адрес памяти, тогда как LinkedList ищет номер х по цепочке ссылок
            }
        }
    }

