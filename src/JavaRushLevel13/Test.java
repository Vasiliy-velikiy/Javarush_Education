package JavaRushLevelTest;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


       ArrayList<Integer>list2=new ArrayList<>();
       ArrayList<Integer>list=new ArrayList<>();

       list2.add(8);
       list2.add(-11);
       list2.add(38);
       list2.add(0);
       list2.add(-51);
       list2.add(-12);

        for (int i = 0; i <list2.size(); i++) {
            if ((list2.get(i))%2==0){
                list.add(list2.get(i));
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            for (int j = list.size()-1; j >i ; j--) {
                if (list.get(j) <list.get(j-1)){
                    int middle=list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,middle);
                }


            }

        }

        for (Integer a:list){
            System.out.println(a);
        }

    }
}
