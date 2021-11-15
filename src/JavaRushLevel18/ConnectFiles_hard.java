package JavaRushLevel18;

import java.io.*;
import java.util.*;

/*Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ...,
в конце - последнюю.
Закрыть потоки.*/
public class ConnectFiles_hard {
//правильный вариант
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> treeSet=new TreeSet<>();//будет хранить значени в отсортированом виде. т.к имена файлов отличаются только цифрами после части Lion.avi.part2,Lion.avi.part37 -цифры и будут раставлять записи в порядке возрастания

        while (true){
            String s=bf.readLine();
            if(s.equals("end"))
                break;
            else
                treeSet.add(s); //добавление всех входящих строк в список
        }

        String templateString=treeSet.first();//строка для определния пути к папке
        templateString =templateString.substring(0, templateString.lastIndexOf("."));//путь к корневой  папке  где у нас элементы (последний индекс  не включается)
        /*различие в примере и на компьтере виндовс!!!- программа получает доступ к файлу ЕСЛИ указать полный путь файла в месте с расширением
         * "C:/Users/vamoskalev/Documents/java/Новая папка/части_файла/Lion.avi.txt"  -а в задаче путь/Lion.avi.partN- поэтому строка
         * //String filenameOfwritting=templateString.substring(0, templateString.lastIndexOf("."));//путь для записи где отсекаем суффикс partN
         * не пройдет условие
         * */
        String filenameOfwritting=templateString;//а эта строка верная для имени записываемого файла


        try (FileOutputStream fileOutputStream=new FileOutputStream(filenameOfwritting)){//создаем поток для записи
            for (String s:treeSet){   //итерируем каждую строку которую ввели поочереди добавления
                try(FileInputStream fileInputStream=new FileInputStream(s)) {//для каждоый строки создаем поток чтения
                    byte[]buff=new byte[fileInputStream.available()];//для каждого потока нам нужен буфер где будут хранится се байты символов файла
                    while (fileInputStream.available()>0){
                        int count=fileInputStream.read(buff);// поочереди байтовый поток записываем в буффер и значение присваиваем count
                        fileOutputStream.write(buff,0,count);
                    }

                }
            }



        }
    }


}



//вариант не додумал до конца ???
    /*
   //FileOutputStream fileWriter=new FileOutputStream("C:/Users/vamoskalev/Documents/java/Новая папка/части_файла/Lion.avi.txt");
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));



        Map<Integer,byte[]>map=new TreeMap<>();//для хранения в отсоритрованном виде,где ключ=часть файла(part)

        String s;//строка для принятия значений
//String namefileFromWriting=s.substring(0,s.length() - 18);
                                                //файл для записи всех частей

        while (true) {
            s = bf.readLine();//имя файла
            if (s.equals("end")) break;//если введено  "end"-выход из программы

            String namefile = s.substring(s.length() - 18);//из передаваемой ссылки вычленяем имя файла вида Lion.avi.part1.txt
            String part = namefile.substring(13, namefile.length() - 4);//вычленяем номер части и приобразовываем в int  части и добавляем в соотетсвующий списко
            Integer numberpart = Integer.valueOf(part);

            FileInputStream fileReader = new FileInputStream(s);//создаем байтовый поток

            byte [] buff=new byte[fileReader.available()];//создаем байтовый буфер размером с считывающий файл
            int count = 0;
            while (fileReader.available() > 0) {
                count = fileReader.read(buff);//записываем байты в буффер


            }
            map.put(numberpart, buff);//добавляем номер части и ему соответсвующий буфер

        }
/*
        for(Map.Entry pair:map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
            fileWriter(pair.getValue());
        }





        }

        */







//ВАРИАНТ С ПОСЛЕДОВАТЕЛЬНЫМ ДОБАВЛЕНИМЕМ
                /*
String writefile;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream fileWriter=new FileOutputStream("C:/Users/vamoskalev/Documents/java/Новая папка/части_файла/Lion.avi.txt");

        while (true) {
            String s = bf.readLine();
            if (s.equals("end")) break;
            FileInputStream fileReader=new FileInputStream(s);


            byte [] buff=new byte[fileReader.available()];
            while (fileReader.available()>0){
                int count=fileReader.read(buff);
                fileWriter.write(buff);

            }






          //  fileWriter.close();
           // fileReader.close();
        }



                 */




/*здесь я выделяю подстроку которая будет числом(часть,-это нужно чтобы упорядочить добавление по порядкам частей
, тк Lion.avi.part2.txt , преффикс Lion.avi.part -12 элементов(начиная с 0) ,а окончание .txt-4 элемента, можно найти число которое идет после приставки
        String index=str.substring(13,str.length()-4); 13-включается ,str.length()-4 -не включается в итоге получаем число следующее после буквы "t" и перед "."
        //  String str="Lion.avi.part21.txt"; //пример для вывода подстроки
        //String index=str.substring(13,str.length()-4);

        System.out.println(str);
        System.out.println(index);
        int number=Integer.parseInt(index);
        System.out.println(index);

 */