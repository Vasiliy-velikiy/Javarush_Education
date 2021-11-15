package JavaRushLevel17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не
 должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго -
в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из
списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.*/
public class Filerider_hard {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws IOException {

        Filerider_hard fileriderhard = new Filerider_hard();//класс типа solution
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String namefile1 = bufferedReader.readLine();
        String namefile2 = bufferedReader.readLine();

        ////создаем объект FileReader для пути файла
        FileReader fileReader1 = new FileReader(namefile1);
        FileReader fileReader2 = new FileReader(namefile2);
//создаем BufferedReader с существующего FileReader для построчного считывания


        // we reader lines for first file and add in allLines
        BufferedReader reader = new BufferedReader(fileReader1);
        String line;
        while ((line = reader.readLine()) != null) {
            allLines.add(line);
        }

        // we reader lines for first file and add in allLines
        reader = new BufferedReader(fileReader2);

        while ((line = reader.readLine()) != null) {
            forRemoveLines.add(line);
        }


        reader.close();
        fileReader1.close();
        fileReader2.close();
        bufferedReader.close();
        try {
            fileriderhard.joinData();
        } catch (Exception e) {

        }


        for (String s : allLines) {
            System.out.println(s);
        }


    }

    public void joinData() throws CorruptedDataException {
        //for (String s : forRemoveLines){ // сhecking allines on value from forremovelines
//если список allines содержит все строки из forRemoveLines- удалить все строки в списке allines такие же как в   forRemoveLines
            if(allLines.containsAll(forRemoveLines)){//contains-это метод Java, позволяющий проверить, содержит ли String другую
                // подстроку или нет. Возвращает логическое значение
                allLines.removeAll(forRemoveLines);
            }
            else {
                allLines.clear();
                throw new CorruptedDataException();
            }




        }
    }



 class CorruptedDataException extends IOException {
}