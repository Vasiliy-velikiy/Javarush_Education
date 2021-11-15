package JavaRushLevel22;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        /*SortedMap<String, Charset> charsets = Charset.availableCharsets();//получить список всех кодировок, с которыми Java может работать
                                                    //этот метод возвращает набор пар (имя кодировки, объект описывающий кодировку)*/
/*
        for(Map.Entry pair: charsets.entrySet()){//
            //System.out.println(pair.getKey()+" = "+pair.getValue());//
        }

        Charset currentCharset = Charset.defaultCharset();//получить текущую активную кодировку (Unicode)
        //System.out.println(currentCharset);*/


      /*  char cg='s';
        char cg2=115;
        System.out.println(cg);
        System.out.println(cg2);*/
       /* char[] ch=Character.toChars(100000);//в массив чар мы загоняем char которые кодируют кодпоинт(цифровое значение по юникоду) равный 110000
        System.out.println(ch);//это должен быть китайский символ
        System.out.println(ch.length);//этот символ кодируют 2 чара
*/
        Pattern pattern=Pattern.compile("1\\+1=2");//+это спецсимвол , его нужно экранировать\ и обратный слэш тоже нужно экранировать
        Matcher matcher=pattern.matcher("1+1=2");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }


    }
}
