package JavaRushLevel19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/*Считать с консоли 2 пути к файлам - file1, file2.
Файлы содержат строки. Так как file2 является обновленной версией file1, то часть строк совпадает.
Нужно создать объединенную версию строк из обоих файлов и записать эти строки в список lines.
Правила объединения:

Если строка в обоих файлах совпадает, то в результат она попадает с операцией (приставкой) SAME.
Например, SAME строка1.
Если строка есть в file1, но ее нет в file2, то считаем, что строку удалили и в результат она попадает с операцией (приставкой) REMOVED.
Например, REMOVED строка2.
Если строки нет в file1, но она есть в file2, то считаем, что строку добавили и в результат она попадает с операцией (приставкой) ADDED.
Например, ADDED строка0.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
Пустые строки даны в примере для наглядности и означают, что этой строки нет в определенном файле.
В оригинальном и редактируемом файлах пустых строк нет!
Пример 1:
содержимое оригинального файл (file1):
строка1
строка2
строка3
строка4
строка5
строка1
строка2
строка3
строка5
строка0

содержимое "редактированного" файла (file2):
строка1
строка3
строка5
строка0
строка1
строка3
строка4
строка5

результат объединения:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
строка4                            REMOVED строка4
строка5         строка5            SAME строка5
                строка0            ADDED строка0
строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
                строка4            ADDED строка4
строка5         строка5            SAME строка5
строка0                            REMOVED строка0

Пример 2:
содержимое оригинального файла (file1):
строка1

содержимое "редактированного" файла (file2):
строка1
строка0

результат объединения:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
                строка0            ADDED строка0*/
public class TrackingChanges_hard {

    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

/*
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String filename1=bf.readLine();
        String filename2=bf.readLine();
 */

       String filename1="C:/Users/vamoskalev/Documents/java/Новая папка/file1.txt";
       String filename2="C:/Users/vamoskalev/Documents/java/Новая папка/file2.txt";
        BufferedReader readerfile1=new BufferedReader(new FileReader(filename1));
        BufferedReader readerfile2=new BufferedReader(new FileReader(filename2));


/*
    while (readerfile1.ready()){
        String[]strings1=readerfile1.readLine().split("\\b");
        String[]strings2=readerfile2.readLine().split("\\b");

             for (int i = 0; i <strings1.length ; i++) {//за основу беру длину массива из первого(но предполагаю что каждая строчка делится на массив из 1 значения)
                if (strings1[i].equals(strings2[i])){
                    lines.add(new LineItem(Type.SAME,strings1[i]));
                }
                else if (!(strings1[i].equals(strings2[i]))){
                    lines.add(new LineItem(Type.ADDED,strings1[i]));
                }
                else if (!(strings2[i].equals(strings1[i]))){
                     lines.add(new LineItem(Type.REMOVED,strings1[i]));
                 }

        }



}



 */

        ///*
        ArrayList<String>arrayList1=new ArrayList<>();
        ArrayList<String>arrayList2=new ArrayList<>();

        while (readerfile1.ready()){   //цикл для добавления каждого массива 1го файла в список1
            String[]strings=readerfile1.readLine().split(" ");
                for (String s:strings)  {
               arrayList1.add(s);

                }
        }

        while (readerfile2.ready()){   //цикл для добавления каждого массива 2го файла в список2
            String[]strings=readerfile2.readLine().split(" ");
            for (String s:strings)  {
                arrayList2.add(s);

            }
        }
        //bf.close();
        readerfile1.close();
        readerfile2.close();



//проверка

        for(LineItem s2:lines){
            System.out.println(s2.type+ " "+s2.line);
        }




    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }


}








/*
        while (readerfile1.ready()){                                     //начало цикла-если есть что считывать в 1м файле
          String[]stringsfile1=readerfile1.readLine().split("\\b");//считываю первую строку в1м файле и делю по границе слова
            while (readerfile2.ready()){                                 //начало цикла(внутренний) -если есть что считывать во 2м файле(обнавленном
                String[]stringsfile2=readerfile2.readLine().split("\\b");//считываю первую строку во 2м файле
                     for (int i = 0; i <stringsfile1.length ; i++) {   //сравнение каждой строки из1го файла с каждой строкой из 2го файла
                         for (int j = 0; j <stringsfile2.length ; j++) {
                             if(stringsfile1[i].equals(stringsfile2[j])){  //если в 1 массиве есть совпадения строк из2го массива
                                 lines.add(new LineItem(Type.SAME,stringsfile1[i]));//то добавляем в список с пометкой одинаковые
                             }
                             //неправильно
                             else {

                                 lines.add(new LineItem(Type.REMOVED,stringsfile1[i]));//если нет, то с пометкой
                                     }
                             if(!(stringsfile2[j].equals(stringsfile1[i]))){

                             }
                              }


                     }
            }
        }
*/
/* //не понимаю че тут написано
        int count=(arrayList1.size()>arrayList2.size())?arrayList1.size():arrayList2.size();//если элементов в 1 файле больше то счетчик принимает наибольшее значение
        int y=0;
        for (int i = 0; i <count ; i++) {//цикл для перебора
            if(arrayList1.size()<arrayList2.size()&&y==arrayList2.size()-1){
                lines.add(new LineItem(Type.ADDED,arrayList2.get(y)));
            }else if(arrayList1.size()>arrayList2.size()&&i==arrayList1.size()-1){
                lines.add(new LineItem(Type.SAME,arrayList2.get(y)));
            }
            else {
                if (arrayList1.get(i).equals(arrayList2.get(y))) {
                    lines.add(new LineItem(Type.SAME, arrayList2.get(i)));
                } else {
                    if (arrayList1.get(i + 1).equals(arrayList2.get(y))) {
                        lines.add(new LineItem(Type.REMOVED, arrayList2.get(i)));
                    } else {
                        lines.add(new LineItem(Type.ADDED, arrayList2.get(y)));
                        i--;
                        y++;
                    }
                }
            }
        }



 //*/
/*
        for (int i = 1,j=1; i <=arrayList1.size() ; i++,j++) {
            try {
                arrayList1.get(i-1);
            }
            catch (Exception e){
                i--;
            }
            try {
                arrayList2.get(j-1);
                }catch (Exception e){
                j--;
            }
            if (arrayList1.get(i-1).equals(arrayList2.get(j-1))) {
                lines.add(new LineItem(Type.SAME,arrayList1.get(i-1)));
              }
            else if(arrayList1.get(i-1).equals(arrayList2.get(j))){
                lines.add(new LineItem(Type.ADDED,arrayList1.get(j-1)));
                i--;
            }
            else
                lines.add(new LineItem(Type.REMOVED,arrayList1.get(i-1)));
            j--;
            }




         */
