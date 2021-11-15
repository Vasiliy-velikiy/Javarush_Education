package JavaRushLevelTest;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10*/
public class FileInputTest2_hard {
    public static void main(String[] args) throws Exception {


        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> list = new ArrayList<>();
// ридер для чтения имени файла
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = consoleReader.readLine();
        consoleReader.close();
//работает с текстовым файлом который создали в notepad++(но первая строка почему то не учитывается)
        FileInputStream fileInputStream = new FileInputStream(filename);
//ридер загрузки содержимого файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        String str=reader.readLine();

        while((str=reader.readLine())!=null) {
            int number=Integer.parseInt(str);
            list2.add(number);
            if (number % 2 == 0) {
                list.add(number);
            }
        }
        reader.close();

//вывод добавленных чисел из файла
        //for (Integer is:list2){
          //  System.out.println(is);
       // }

        //System.out.println();

        Collections.sort(list);
        //System.out.println("posle sortirovki: ");
        for (Integer a:list){
            System.out.println(a);




        }

    }




    }


