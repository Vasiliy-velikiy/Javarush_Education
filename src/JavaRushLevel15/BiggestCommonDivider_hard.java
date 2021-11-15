

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.*/
public class BiggestCommonDivider_hard {
    public static void main(String[] args) throws Exception{

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            Integer a = Integer.parseInt(bf.readLine());
            Integer b = Integer.parseInt(bf.readLine());

            if(a<=0||b<=0){
                throw new Exception();

            }

            get(a, b);






        }
   static int get(int a,int b){
       int mod=1;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                mod = i;
                System.out.println(mod);
                break;
            }
        }
            return mod;


        }
    }


