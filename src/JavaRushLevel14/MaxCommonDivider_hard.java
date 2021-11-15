package JavaRushLevel14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*/*Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.*/
public class MaxCommonDivider_hard  {
    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(bf.readLine());
        Integer b = Integer.parseInt(bf.readLine());

        if(a<=0||b<=0){
            throw new Exception();

        }
            int mod=1;
        for (int i = min(a,b); i >0 ; i--) {
            if(a%i==0&&b%i==0){
                System.out.println(i);
                break;
            }
            if (i==1) System.out.println(mod);

        }






    }

    static int min(int a,int b){
        return a>b?b:a;
    }



}
