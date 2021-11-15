package JavaRushLevel22;

import java.io.*;
import java.util.*;

 /*В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова совпадала с
 первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Считай, что абсолютно все слова из исходного списка могут (и должны!) быть включены в результат (лишних слов нет).
Метод getLine должен возвращать любой правильный вариант при наличии нескольких таковых (см. пример).
Слова разделять пробелом.
Вывести полученную строку на экран.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
или
Вена Амстердам Мельбурн Нью-Йорк Киев
или
Мельбурн Нью-Йорк Киев Вена Амстердам
и т.п.*/

//одно из решений
/*. Не нужного придумывать ничего сложного и страшного. Достаточно использовать цикл while и метод Collections.shuffle(),
который в случайном порядке перемешивает коллекцию. И после каждого перемешивания проверяем, соблюдается ли условие, и
 если да, то возвращаем стрингбилдер из уже отсортированного списка методом shuffle. Если же не соответстсует условию, то
 в цикле список будет шафлиться до тех пор, пока условие не будет true.*/
public class StringbuilderTest3_veryhard {

    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String filename=bf.readLine();
        bf.close();

        //String filename="C:/Users/Василий/Documents/тестовые_документы/1.txt";
        BufferedReader bfr=new BufferedReader(new FileReader(filename)); //нужен чтобы прочитать всю строку (предполагаем что в файле написаны слова в 1 строку разделенные пробелом
        String line="";
        StringBuilder sb=new StringBuilder();
        while ((line=bfr.readLine())!=null){
            sb.append(line+" ");
        }
        String[]text=sb.toString().split(" ");  //делим строку по промежуткам и вкладываем в массив
 bfr.close();

        StringBuilder result=getLine(text);//закидываем в метод getLine массив слов
        System.out.println(result.toString());


    }

    public static StringBuilder getLine(String... words) {
     if(words.length==0||words==null)return  new StringBuilder("");
      ArrayList<String>list=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i < words.length; i++) {//цикл перебора массива слов
            list.add(words[i]);
        }
        while(true){
            Collections.shuffle(list);//рандомно мешаем коллекцию до тех пора пока все элементы не сложуться в нужную нам последоветльность
            if (check(list)){      //если последня и первая буква двух элементов совпадает то  переходим на строчку ниже
                for (String s:list)   {//перебор элементов коллекции
                    stringBuilder.append(s+" ");
                }
                String str=stringBuilder.toString().trim();  //обрезаем от лишнего последнего пробела строку
            StringBuilder stringBuilder1=new StringBuilder(str);  //создаем объект для возвращения на сонове нужной строки
            return stringBuilder1;
            }

        }

/*
        for (int i= 0; i < words.length ; i++) {//добавление массива слов в список 1
            list.add(words[i]);
        }
        List<String> array =new ArrayList<>(); //массив для нужного порядка элемента

       array.add(list.remove(0));//добавление первого элемента в список заданного порядка и этот элемент удаляю в списке при 1м добавлении

       while (array.size()< words.length) {//пока нужный список меньше массива слов входящих в метод- цикл будет работать
           for (int i = 0; i <list.size() ; i++) {//перебераем каждый элемент из 1го списка

 /*(преобразуем эл-т в строку(берем слово последнего э-та из второго списка ).извлекаем символ по индексу (который равен
                           последней букве у последнего эл-та из второго списка).сравниваем игнорируюя регистр С
                           первой буквой элемента i первого списка  (преобразуя в строку)

             слова)с

               if((String.valueOf(array.get(array.size()-1).charAt((array.get(array.size()-1)).length()-1))).equalsIgnoreCase(String.valueOf(list.get(i).charAt(0)))) {
//если буквы первая и псоледняя равны по содержанию то добавляем элемент в список 2 при этом удаляя  его из 1го списка
                  array.add(list.remove(i));
               }
           }


       }

        for (String word:array){ //конкатирую резуьтат
            stringBuilder.append(word+" ");
        }


        */

    }

    public static boolean check(ArrayList<String >list){
        for (int i = 0; i < list.size()-1; i++) {
       String s1= String.valueOf(list.get(i).charAt(list.get(i).length()-1)).toLowerCase();  //символ последнего индекса строки
       String s2= String.valueOf(list.get(i+1).charAt(0)).toLowerCase();       //символ первого индекса следующего элемента коллекции
       char a=s1.charAt(0);
       char b=s2.charAt(0);
        if(!(a==b)){
            return false;
        }
    }
        return true;


    }
}
