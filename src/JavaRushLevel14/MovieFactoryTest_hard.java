/*У нас есть кинофабрика, но она работает не в полную силу.
        Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
        Вот что тебе нужно сделать для успешного решения:
        Разобраться, что программа умеет делать.
        Все классы должны быть внутри класса Solution.
        Добавить классы Cartoon, Thriller.
        Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
        Аналогично получению объекта SoapOpera сделать:
        добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
        добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
        Считать с консоли несколько ключей (строк).
        Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".

        Создать переменную movie типа Movie и для каждой введенной строки (ключа):
        получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
        вывести на экран movie.getClass().getSimpleName().

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MovieFactoryTest_hard {
    public static void main(String[] args) throws Exception {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String key=null;
//ввести с консоли несколько ключей (строк), пункт 7
        for(;true;) {
            key= reader.readLine();
            if (key.equals("cartoon")) {
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }
            else if (key.equals("thriller")) {
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
                }
            else if (key.equals("soapOpera")) {
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
                }
             else {
                 Movie movie = MovieFactory.getMovie(key);
                 break;
            }
                //тут цикл по чтению ключей, пункт 1
            }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

static class MovieFactory {

    static Movie getMovie(String key) {
        Movie movie = null;

        //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
        if ("soapOpera".equals(key)) {
            movie = new SoapOpera();
        }
        else if("cartoon".equals(key)){
            movie=new Cartoon();
        }
        else if("thriller".equals(key)) {
            movie=new Thriller();
        }

        //напишите тут ваш код, пункты 5,6

        return movie;
    }
}

static abstract class Movie {
}

static class SoapOpera extends Movie {
}
static class Cartoon extends Movie{

}
static class Thriller extends Movie{

}

//Напишите тут ваши классы, пункт 3
}