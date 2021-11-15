package JavaRushLevel22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот*/
public class StringbuilderTest2_hard {

    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        /*   C:/Users/Василий/Documents/тестовые_документы/1.txt   */
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Scanner bf=new Scanner(System.in);
        String filename=bf.next();
      // String filename="C:/Users/Василий/Documents/тестовые_документы/1.txt";
        //BufferedReader bfr=new BufferedReader(new FileReader(filename));
        Scanner bfr=new Scanner(new FileReader(filename));
       ArrayList<String> strings=new ArrayList<>();

       ArrayList<String> finishstring=new ArrayList<>();


        while (bfr.hasNext()){
         //String[] strings=bfr.next();
                strings.add(bfr.next());

        }
        //ArrayList<String> strings2=new ArrayList<>(strings);
       System.out.println(strings); //проверка, чтоб правильно скопировалось в список
       //System.out.println(strings2); //проверка, правильно ли скопировлось во второй список



        int i = 0;
        for ( i = 0; i <strings.size() ; i++) {
           // System.out.println(s);
            StringBuilder stringBuilder=new StringBuilder(strings.get(i));
            String reversstring=  stringBuilder.reverse().toString();//для каждой строки нахожу реверсивную
            //System.out.println(s+" " +stringBuilder);// проверка-правильно ли реверс строки
            for (int j = i+1; j <strings.size() ; j++) {

                if (strings.get(j).equals(reversstring)){
                    //finishstring.add("исходная строка: "+strings.get(i)+",  реверсивная строка: "+reversstring);

                    result.add(new Pair(strings.get(i),reversstring));
                    strings.remove(strings.get(i));
                    strings.remove(reversstring);
                    i--;
                    break;

                }
            }   //тк при последнем элементы будет задвоение- потому что если в списке у нас осталось 2












        }
        //System.out.println(finishstring);
        System.out.println(result.toString());


    }

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}
