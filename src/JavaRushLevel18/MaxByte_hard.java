package JavaRushLevel18;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Передайте имя файла в нить ReadThread.
        Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и
        добавить его в словарь resultMap,
        где параметр String - это имя файла, параметр Integer - это искомый байт.
        Закрыть потоки.*/
public class MaxByte_hard {

    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String namefile = bf.readLine();
            if (namefile.equals("exit")) break;
            ReadThread readThread = new ReadThread(namefile);
            readThread.start();


        }

    }


    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        int []mass=new int[256];//int нужен для того, чтобы отслеживать количество повторов символа-он может быть 1млн
 //индекс на 256 нужен чтобы отследить сам символ, тк в кодировке ascii 256 символов
        int max=mass[0];//максимальное значение массива
        int indexmass=0;//индекс максимального значения массива
        String filename;//переменная, чтобы была возможность записи в словарь

        public ReadThread(String fileName) throws FileNotFoundException {
            fileInputStream = new FileInputStream(fileName);
            this.filename=fileName;
            //implement constructor body
        }


        public void run() {

            try {
                while (fileInputStream.available() > 0) {//пока идет считывание
                    mass[fileInputStream.read()]++;//величение элемента массива пока идет считывание символа равное индекса массива
  // поток считывает символ "s" в байтах, это будет 115, затем mass[115] увеличивается на 1,(по умолчанию после создания массива у всех элементов знач 0). Далее элемент считывает другой какй то массив и увеличивает значение,соответсвующее индексу

                }
                fileInputStream.close();//если поток закрыть в блоке while-считается тольок 1 элемент и цикл прекратится

            } catch (Exception e) {
            }
//поиск макс значения массива и индекса соотетсвующего ему
            for (int i = 0; i < mass.length; i++) {
                if(mass[i]>max){
                    max=mass[i];
                    indexmass=i;
                }
            }

            int colichestvo=max;
            char ch=(char)indexmass;//переводим индекс(он равен десятичному представлению байта какого то символа)


           resultMap.put( filename, indexmass);
            //System.out.println(resultMap);//проверка

            // implement file reading here - реализуйте чтение из файла тут
        }
    }
}