package вопросы_к_собеседованию;

import java.nio.charset.Charset;

/*	Как развернуть строку задом наперед?*/
public class ReverseString {
    public static void main(String[] args) {
        String s="Hello my name is Jhon";

        //1способ
        /*
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        s=stringBuilder.toString()//из стрингбилдера делаем строку
        System.out.println(s);

         */

        //2способ
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print( s.charAt(i));
        }

        System.out.println(Charset.defaultCharset());//узнать текущую кодировку

    }
}
