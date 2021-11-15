package JavaRushLevel22;
/*Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять*/
public class StringTest {
    //static int  count=0;
    /* static int  count=0;
    static int firsttab=0;
    static int secondttab=0; */
    public static String getPartOfString(String string) throws TooShortStringException {
        //1способ почему то не принят валидатором  возможно надо было дописать   if(string==null) throw new TooShortStringException();

        int  count=0;
        int firsttab=0;
         int secondttab=0;
        for (int i = 0; i <string.length() ; i++) {
            //System.out.println(count);
            firsttab=string.indexOf('\t');
            secondttab=string.indexOf('\t',firsttab+1);

            if(string.charAt(i) == '\t'){//проверяет все знаки в строке начиная с начала
                count++;
            }

        }
       if (count<2) throw new TooShortStringException();//если менее 2х табулияции, выбрасываем исключение


        return string.substring(firsttab+1,secondttab);




        //2способ принятый валидатором
        /*
        if(string==null) throw new TooShortStringException();
        int  count=0;
        char[]masschar=string.toCharArray();
        for (int i = 0; i <masschar.length ; i++) {
            if (masschar[i]=='\t'){
                count++;
            }
        }

        if (count<2) throw new TooShortStringException();

        else {
            int firsttab=string.indexOf('\t')+1;
            return string.substring(firsttab,string.indexOf('\t',firsttab+1));
        }

         */
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        //System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));

       //System.out.println(getPartOfString("\tJavaRush - лучший сервис обучения Java.\t "));
      // System.out.println(getPartOfString("\t\t"));
       // System.out.println(count);

        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));


/*
        System.out.println(getPartOfString("0\t1\t2\t3"));
        System.out.println(getPartOfString("0\t1\t2\t3"));
        System.out.println(getPartOfString("0\t\t2\t3"));
        System.out.println(getPartOfString("\t1a\t\t"));
        System.out.println(getPartOfString("\tJavaRush - лучший сервис\tобучения Java\t."));*/

       // System.out.println(count);
       // System.out.println(firsttab);
       // System.out.println(secondttab);
    }
}
