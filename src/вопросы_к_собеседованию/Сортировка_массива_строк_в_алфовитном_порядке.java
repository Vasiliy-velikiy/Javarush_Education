package вопросы_к_собеседованию;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Как отсортировать массив строк в алфавитном порядке?*/
public class Сортировка_массива_строк_в_алфовитном_порядке {
    public static void main(String[] args) {

        String[] organizedNames = new String[]{"bb", "dd", "Sss", "Aaa"};
//С УЧЕТОМ РЕГИСТРА
     /* //  Arrays.sort(mass);//1 способ без учета регистра


        //2 способ без учета регистра
        boolean done=false;
        while(!done)
        {
            done=true;
            for(int i=0;i<organizedNames.length-1;i++)
            {
                if(!(organizedNames[i]==null))
                {
                    String name1=organizedNames[i]; String name2=organizedNames[i+1];
                    if(name1!=null&&name2!=null)
                    {
                        int num=name1.compareTo(name2);
                        if(num>0)
                        {
                          String  temp=organizedNames[i]; //temp is a String that was declared earlier
                            organizedNames[i]=organizedNames[i+1];
                            organizedNames[i+1]=temp;
                            done=false;
                        }
                    }
                }
            }
        }



      */

        //БЕЗ  УЧЕТА РЕГИСТРА преобразуем в список  и у списка вызовем метод сортировки который в строке игнорирует регистр
        List<String>strings=Arrays.asList(organizedNames);
    strings.sort(  String::compareToIgnoreCase);

//либо Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
//Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
        for (String s : strings) {
            System.out.println(s);
        }

    }

}