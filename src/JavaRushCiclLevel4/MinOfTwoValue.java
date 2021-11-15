package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.*/
public class MinOfTwoValue {
    public static void main(String[] args)  throws  Exception{


    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String a1 = bf.readLine();
    String b1 = bf.readLine();

    int a = Integer.parseInt(a1);
    int b = Integer.parseInt(b1);


    if (a>b){
        System.out.println(b);
    }
     else if (a==b) {
            System.out.println(a);
        }
    else{
            System.out.println(a);
        }




}
}