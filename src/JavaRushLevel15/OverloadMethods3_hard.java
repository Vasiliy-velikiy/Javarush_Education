package JavaRushLevel15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;

/*В этой задаче тебе нужно:
Считывать с консоли данные, пока не будет введено слово "exit".
Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
содержит точку '.', вызвать метод print() для Double;
больше нуля, но меньше 128, вызвать метод print() для short;
меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
иначе — вызвать метод print() для String.*/
public class OverloadMethods3_hard {
    //1 способ
    /*
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        for (; true; ) {

            String s = bufferedReader.readLine();

            //выход из цикла
            if (s.equals("exit")) break;
if(isaDouble(s) == true&&(s.indexOf('.') > -1)) {
    print(Double.parseDouble(s));
            }
else if ((isaInt(s)==true&&Integer.parseInt(s)>=128)||(isaInt(s)==true&&Integer.parseInt(s)<=0)){
    print(Integer.parseInt(s));
}
else if(isaShort(s)==true&&Short.parseShort(s)>0&&Short.parseShort(s)<128){
    print(Short.parseShort(s));
}
else {print(s);}



            }
            //напиште тут ваш код

        }

//для кажого типа нужно добавить метод boolean который определает корректность конвертации строкового значения в нужный тип

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }
    public static boolean isaDouble(String s){
        try
        {
            double d = Double.parseDouble(s);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }



    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }




    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }
    public static boolean isaShort(String s){
        try
        {
            short d = Short.parseShort(s);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
    public static boolean isaInt(String s){
        try
        {
            int d = Integer.parseInt(s);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }


     */

    //2 способ
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String input;
        Integer intvalue=0;
        double douvlevalue=0;
        Short shortvalue=0;
        while (!(input=bufferedReader.readLine()).equals("exit")){
            try {
                if (input.contains(".")) {
                    print(douvlevalue = Double.parseDouble(input));
                } else if ((shortvalue = Short.parseShort(input)) > 0 && shortvalue < 128) {
                    print(Short.parseShort(input));

                }
                else if ((intvalue=Integer.parseInt(input))<=0||intvalue>=128){
                    print(Integer.parseInt(input));
                }
                else {
                    print(input);
                }
            }
            catch (NumberFormatException e){
                print(input);

            }

        }

        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
