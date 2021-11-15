package вопросы_к_собеседованию;
//Регулярное выражение для разбиения строки на слова?
public class Regex_дляразбитиястрокинаслова {
    public static void main(String[] args) {
        //  \\b-граница слова
//разделение методом сплит -вот для него регулярка  [\s\p{Punct}]+
       // String[]mass="words worg, sdsff. sdsds!".split("[\\s?\\p{Punct}]");//но нужно чистить массив от пустых элементов
        //String[]mass="words worg, sdsff. sdsds!".split("\\b[a-z]\\p{Punct}?\\b");//но нужно чистить массив от пустых элементов

        //ябы сначала заменил все знаки пунктуцации на пробелы и дальше разделил по пробелам
        String sw="words worg, sdsff. sdsds!";
        String newsw=sw.replaceAll("\\p{Punct}","");
        String[]mass=newsw.split("\\s") ;

        for (String s:mass)
        System.out.println(s);
    }
}
