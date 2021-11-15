package JavaRushLevel7;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.*/
public class MamaMilaRamy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,"мама");
        list.add(1,"");
        list.add(2,"мыла");
        list.add(3,"");
        list.add(4,"раму");
        list.add(5,"");
        String as="именно ";

        for (int i = 1; i < list.size(); i=i+2) {
            list.set(i,as); // =as+list.get(i);

        }





    for( String s:list){
        System.out.println(s);
    }

    }
}
