package JavaRushLevel8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
"May is the 5 month".
Используй коллекции.*/
public class NameOfMonth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();



        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("January");
        arrayList.add("February");
        arrayList.add("March");
        arrayList.add("April");
        arrayList.add("May");
        arrayList.add("June");
        arrayList.add("July");
        arrayList.add("August");
        arrayList.add("September");
        arrayList.add("October");
        arrayList.add("November");
        arrayList.add("December");


        for (int i = 0; i < arrayList.size(); i++) {

            if (s.equals(arrayList.get(i))) {
                    int number=arrayList.indexOf(s)+1;
                System.out.println(s + " is the " + number + " month.");
            }
        }
    }
}