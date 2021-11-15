package JavaRushLevel19;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import  org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import javax.management.modelmbean.XMLParseException;


/*Считай с консоли имя файла, который имеет HTML-формат.

Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>

Первым параметром в метод main приходит тег. Например, "span".
Вывести на консоль все теги, которые соответствуют заданному тегу.
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
Количество пробелов, \n, \r не влияют на результат.
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
Тег может содержать вложенные теги.

Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми*/
/*
public class TagTest_hard {
    public static void main(String[] args) throws IOException {


       String filename="C:/Users/vamoskalev/Documents/java/Новая папка/file3.html";
      //  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      //  String filename=bf.readLine();
        BufferedReader reader=new BufferedReader(new FileReader(filename));
     StringBuilder html=new StringBuilder();

        while (reader.ready()){
            html.append(reader.readLine());
        }
        String htmlString=html.toString();//тк StringBuilder-Объект, мы не можем сдлеать так sout(html)
        //System.out.println(htmlString);

//без Parser.xmlParser()-валидатор не принимает
       Document document=Jsoup.parse(htmlString,"",Parser.xmlParser());//раскладываем на теги (в переменной document разложились все теги)
      //Parser document=xmlParser();
        //Elements tags=document.select(args[0]);// args[0]-это входящий параметр тэга(какой то тег)
  //интересующие теги выбираем из  document и загоняем в Elements-т.е сортируем
       Elements tags=document.select("span");// Так же можем поставить "span"
        System.out.println(tags.toString());//выдас нам все строчки которые начинаются <span> и заканчиваются </span>

        reader.close();
      //  bf.close();
    }
}




*/


/*  while (reader.ready()){
        html+=reader.readLine();
    }
        Pattern p = Pattern.compile(">([^<]*)<");
        Matcher m = p.matcher(html);
        ArrayList<String> matches = new ArrayList<>();
        while(m.find()) {
            String text = m.group(1);
            if(!text.isEmpty())
                matches.add(text);
        }
        for(String match : matches) {
            System.out.println(match);
        }*/
