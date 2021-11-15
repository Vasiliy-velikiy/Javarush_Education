package JavaRushLevel18;



import java.io.*;

/*CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске со следующим набором параметров:
-c productName price quantity
добавляет товар с заданными параметрами в конец файла, генерируя id (8 символов) самостоятельно путем
инкремента максимального id, найденного в файле.

Значения параметров:
-c - флаг, который означает добавления товара.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.

Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.

Пример содержимого файла:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234

args[0]  -c
args[1]  productName
args[2]   price
args[3]   quantity




*/
public class PriceCRUD_hard {
    public static void main(String[] args) throws IOException {
 if (args[0].equals("-c")&&args[1]!=null&&args[2]!=null&&args[3]!=null){
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //String filename=bf.readLine();

        String filename="C:/Users/vamoskalev/Documents/java/newfolder/file1.txt";


        BufferedReader reader=new BufferedReader(new FileReader(filename));
        BufferedWriter writer=new BufferedWriter(new FileWriter(filename,true));

 int id_whichincrement = 0;
        
        while (reader.ready()){
            String se=reader.readLine();


            //определяем id, который необходимо при добавлении нового элемента инкреминировать
            char[] strToArray = se.toCharArray();//на массив символов
            String number="";
            for (int i=0;i<strToArray.length;i++){
               if (Character.isDigit(strToArray[i])){//знаю что вначале идут символы(цифры) а потом текст, (нужны все цифры идущие перед буквами или пробелом)
                   number+=strToArray[i];//вычленяю цифры.
               }
               else break;
                }
            id_whichincrement=Integer.parseInt(number);//нахожу максимальное значение id
            }
       // System.out.println(++id_whichincrement);





        //форматируем каждый параметр по заданое число символов
        String productname="";
        String spase="                               ";
        if (args[1].length()<30){
            productname=args[1]+spase.substring(args[1].length(), 30);//последний индекс не включается-и поэтому получается 30 символов
        }
        if (args[1].length()>=30){
            productname=args[1].substring(0, 30);
        }


        String price="";
        if (args[2].length()<8){
            price=args[2]+spase.substring(args[2].length(), 8);
        }
        if (args[2].length()>=8){
            price=args[2].substring(0, 8);
        }


        String quantity="";
        if (args[3].length()<4){
            quantity=args[3]+spase.substring(args[3].length(),4);
        }
        else quantity=args[3].substring(0, 4);




//если первый  входной параметр -c пускаем на запись файла

            String outputstring=++id_whichincrement+productname+price+quantity;
            writer.write("\n");
            writer.write(outputstring);

     //bf.close();
     reader.close();
     writer.close();
        }




        }




    }


