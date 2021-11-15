import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    /* учитывая 2 значения int, верните true, если одно отрицательное, а другое положительное.
    За исключением случаев, когда параметр «негативный» имеет значение «истина»,
    возвращается значение «истина», только если оба значения отрицательны.
     */
String d;


    public boolean posNeg(int a, int b, boolean negative) {
        if (a>0&b<0&negative==false) return true;
            if (a<0&b>0&negative==false)return true;
                else if (a<0&b<0&negative==true)return true;
                    else return false;
    }

    /*Для данной строки верните новую строку, в которой "не" было добавлено вперед.
    /Однако, если строка уже начинается с «not», вернуть строку без изменений.
    Примечание: используйте .equals () для сравнения двух строк.
        notString("candy") → "not candy"
        notString("x") → "not x
        notString("not bad") → "not bad"

   */
    public String notString(String str) {
        if(str.length()>=3&& str.substring(0,3).equals("not")) {
            return str;
        }
        else return "not "+str;
    }



    /*метод на вход принимает 1 целое число.
    Нужно посчитать сумму цифр этого числа. 546----> 5+4+6=15
    делается через строковую переменную(только так можно увидеть длину этого значения
     */

    public static int sumDigitsInNumber(int number){
        int sum=0;
        String n=Integer.toString(number); //конвертация целого числа в строковый
        for (int a=0; a<n.length();a++) {
            sum+=Character.getNumericValue(n.charAt(a)); /*charAt(a) возвращает индекс указанного элемента.
 например number=546, n= Integer.toString(number)=тоже 546 но уже строковое значение со своей длинной
 n.charAt(0)это=5, а   n.charAt(2) это=6
        */
/* метод getNumericValue() преобразует символы в int, но применяется только к символам, которые
обозначают цифры т.е от "0" до "9"
 */
        }

return  sum;
    }



    public static void main(String[] args)   {

    Test test=new Test();
    String s="kek";
    String s1="kek";
    String s2="Добро пожаловать на Prog";
        System.out.println("1version--" +s.equals(s1));
        System.out.println(s);

      //  System.out.println(test.posNeg(1,-1,false));
        //System.out.println(test.posNeg(-1,1,false));
        //System.out.println(test.posNeg(-4, -5, true));
//  TODO

        System.out.println(test.notString("not candy"));
        System.out.println(test.notString("x"));


            System.out.println(sumDigitsInNumber(451));

        List <String> list=new ArrayList<String>();
        for (String s3 : list) {
            
        }
        
    }


}


                





