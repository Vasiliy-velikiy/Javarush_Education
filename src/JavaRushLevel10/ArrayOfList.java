package JavaRushLevel10;

import java.util.ArrayList;

/*Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.*/
public class ArrayOfList {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();

        printList(arrayOfStringList);

    }

    public static ArrayList<String>[] createList() {





        ArrayList<String>list1=new ArrayList<>();
        list1.add("sTRoka3");
        list1.add("Stroka1");
        list1.add("123");



        ArrayList<String>list2=new ArrayList<>();
        list2.add("aaaa3");
        list2.add("zassa");
        list2.add("1111");


        ArrayList<String>[] arrayoflist=new ArrayList[2]; //массив, элементами которого явл списки
        arrayoflist[0]=list1;
        arrayoflist[1]=list2;
        //напишите тут ваш код

        return arrayoflist;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
