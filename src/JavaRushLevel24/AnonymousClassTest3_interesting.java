package JavaRushLevel24;

import java.util.LinkedList;
import java.util.List;

/*Сделайте так, чтобы метод getIterator возвращал анонимный класс.
Перенесите логику LocalIterator в анонимный класс.
Меняйте только тело метода getIterator.*/
public class AnonymousClassTest3_interesting {
    public static List<Iterator> iterators = new LinkedList<>();

    private int countItems;//по умолчанию тут значение ноль

    public Iterator getIterator(final String name) {
      /* class LocalIterator implements Iterator {//как было изначально
            public LocalIterator() {
                countItems++;
                System.out.println(name + " item " + countItems);
            }

            public Iterator next() {
                return new LocalIterator();
            }
        }
        return new LocalIterator();
*/
        countItems++;
        System.out.println(name + " item " + countItems);

        return new Iterator() {
            Iterator iterator;
            @Override
            public Iterator next() {
               String iteratorname=name;
                return getIterator(name);//рекурсивно будем вызывать метод где находится логика вывода
            }
        };

    }
    public static void main(String[] args) {
        AnonymousClassTest3_interesting solution = new AnonymousClassTest3_interesting();

        Iterator iterator = solution.getIterator("iterator");
        for (int i = 1; i < 5; i++) {
            iterators.add(iterator.next());
        }
    }
}


 interface Iterator {
    Iterator next();
}
