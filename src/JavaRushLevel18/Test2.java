package JavaRushLevel18;

import java.io.*;

public class Test2 {


    public static void main(String[] args) throws IOException {


       //массив args таков что он всегдя существует, такая запись args.isEmpty-неприемлема
            if (args.length==4&&args[0].equals("-c")) {//эта строчка гарантирует что при запуске программы без параметров список останется неизменным
               BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
                String filename=bf.readLine();
               // String filename = "C:/Users/vamoskalev/Documents/java/newfolder/file1.txt";

                BufferedReader reader = new BufferedReader(new FileReader(filename));
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));

                int id_whichincrement=0;

                while (reader.ready()) {
                    int i_d=Integer.parseInt(reader.readLine().substring(0, 8).trim());//мы знаем что под id отводится 8 цифр
                                                                                       //максимально, следоветльно выбираем промежуток readLine().substring(0, 8), а
                                                                                       // если будет меньше(например 4 цифры а все осталное пробелы(подгоняется под 8 символов))
                                                                                       //то обрезаем методом trim(). - получившееся значение переводим в тип integer/
                    if (id_whichincrement<i_d) {           //выбираем максимальное значение id
                        id_whichincrement = i_d;
                    }

                }
                System.out.println(id_whichincrement);













                String productname=args[1];
                String price=args[2];
                String quantity=args[3];
                int id=++id_whichincrement;

String output=String.format("\n%-8.8s%-30.30s%-8.8s%-4.4s", id,productname,price,quantity);
               // String outputstring = ++id_whichincrement + productname + price + quantity;
                //writer.write("\n");
                writer.write(output);


                //bf.close();
                reader.close();
                writer.close();
            }
        }




}



//форматируем каждый параметр по заданое число символов
                /*
                String productname = "";
                String spase = "                               ";
                if (args[1].length() < 30) {
                    productname = args[1] + spase.substring(args[1].length(), 30);//последний мндекс не включается-и поэтому получается 30 символов
                }
                if (args[1].length() >= 30) {
                    productname = args[1].substring(0, 30);
                }


                String price = "";
                if (args[2].length() < 8) {
                    price = args[2] + spase.substring(args[2].length(), 8);
                }
                if (args[2].length() >= 8) {
                    price = args[2].substring(0, 8);
                }


                String quantity = "";
                if (args[3].length() < 4) {
                    quantity = args[3] + spase.substring(args[3].length(), 4);
                } else quantity = args[3].substring(0, 4);

                 */


//неправильное решение определения id для инкреминации может быть запись 12343329300 спартанце DVD худ фильм 514.00 12
//и к тому же макс значение может быть записано в предпосленей строчке
                    /*
                    //определяем id, которую необходимо при добавлении нового элемента инкреминировать
                    char[] strToArray = se.toCharArray();//на массив символов
                    String number = "";
                    for (int i = 0; i < strToArray.length; i++) {
                        if (Character.isDigit(strToArray[i])) {//знаю что вначале идут символы(цифры) а потом текст, который может записываться слитно
                            number += strToArray[i];//вычленяю цифры.
                        } else break;
                    }
                    id_whichincrement = Integer.parseInt(number);
                }
                // System.out.println(++id_whichincrement);




                     */