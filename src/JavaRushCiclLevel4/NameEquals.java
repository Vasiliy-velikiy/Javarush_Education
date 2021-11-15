package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.*/
public class NameEquals {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));


        String a1 = bf.readLine();
        String b1 = bf.readLine();
        int c=a1.length();
        int n=b1.length();

        if(a1.equals(b1)) {
            System.out.println("Имена идентичны");
        }
        else if (c==n){
            System.out.println("Длины имен равны");
        }
        else {}

        }



}

