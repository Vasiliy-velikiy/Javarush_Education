package JavaRushLevel22;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример
getTokens("level22.lesson13.task01", ".")

возвращает массив строк
{"level22", "lesson13", "task01"}*/
public class StringTokenizerTest {

    public static void main(String[] args) {
        getTokens("level22.lesson13.task01", ".");

    }




    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
      //  System.out.println(tokenizer.countTokens());   //используя текущий набор разделителей, определяет количество лексем, которые осталось разобрать и возвратить в качестве результата
        String[]strings=new String[tokenizer.countTokens()];
        int i=0;
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
          strings[i]=token;
          i++;
        }


      // for (String s:strings) System.out.println(s);
        return strings;

    }
}
