package JavaRushLevel8;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/
public class SetOfPlant {


    public static void main(String[] args) {


//Хранит значения произвольно но в ед экземпляре
        HashSet<String> seter=new HashSet<String>();
        seter.add("арбуз");
        seter.add("банан");
        seter.add("вишня");
        seter.add("груша");
        seter.add("дыня");
        seter.add("ежевика");
        seter.add("женьшень");
        seter.add("земляника");
        seter.add("ирис");
        seter.add("картофель");
        seter.add("картофель");





     for(String s:seter) {
            System.out.println(s);
        }
    }
}
