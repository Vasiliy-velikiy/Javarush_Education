package JavaRushLevel18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде,
в котором она записана в файле.
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
public class GetInformationFromFilehard {
    public static void main(String[] args) throws IOException {

        //args[0]="196";
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        List<String>list=new ArrayList<>();

        FileReader fileReader=new FileReader(s);
BufferedReader readerInformation=new BufferedReader(fileReader);

int id=Integer.parseInt(args[0]);

        while (readerInformation.ready()){

           String se= readerInformation.readLine();
            list.add(se);


        }
        fileReader.close();


        for (int i = 0; i <list.size() ; i++) {

            if (list.get(i).contains("1")){
                System.out.println(list.get(i));
            }
        }


        //System.out.println(list);//проверка содержания списка-каждая строчка находится в ячейке списка


    }

}
