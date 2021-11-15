package JavaRushLevel18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.

Информация по каждому товару хранится в отдельной строке.

Пример содержимого файла:
194 хлеб 12.6 25
195 масло сливочное 52.2 12
196 молоко 22.9 19

Пример вывода для id = 195:
195 масло сливочное 52.2 12*/
public class GetStringInFile_hard {

    public static void main(String[] args) throws IOException {

        //args[0]="196";
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();


        int indexsubstring; //маркер чтобы определять индекс первого пробела который идет после параметра(цифры 196 )

        FileReader fileReader=new FileReader(s);
        BufferedReader readerInformation=new BufferedReader(fileReader);


        while (readerInformation.ready()){//цикл повторяется ПОКА ридер готов читать(есть инофрмация для чтения)
            String se= readerInformation.readLine();

            indexsubstring=se.indexOf(" ");//возвращает индекс первого встречающегося элемента-" "

            if(args[0].equals(se.substring(0,indexsubstring))){//в этом же цикле определяем соотетсвие параметра и каждой считываемой подстрики на вводимые цифры(к примеру 196)
                System.out.println(se);
            }

        }
        readerInformation.close();

        //System.out.println(list);//проверка содержания списка-каждая строчка находится в ячейке списка


    }


}