package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько,
выведи каждую с новой строки.*/
public class MaxStringOfArrayList {
  private static ArrayList<String> strings;
//сеттеры и гетеры не обязательно прописывать
    public static void setStrings(ArrayList<String> strings) {
        MaxStringOfArrayList.strings = strings;
    }

    public static ArrayList<String> getStrings() {
        return strings;
    }

    public static void main(String[] args) throws IOException{
strings=new ArrayList<String>();//нужно выделить память для приватной переменной strings


        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5 ; i++) {
            String s=bf.readLine();
            strings.add(s);

        }

        String s1=strings.get(0);
        for(String s:strings){
            if (s1.length()<s.length()){
                s1=s;
            }
        }

        for (String s2:strings){
            if (s2.length()==s1.length()){
                System.out.println(s2);
            }
        }




    }
}
