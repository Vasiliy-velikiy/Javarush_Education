package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

//ти параметры задаются из командной строки через пробел
например java CountEnglishLetter.java param1 param2 param3-
тоесть args[0]--e или -d
тоесть args[1]-fileName
тоесть args[2]-fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.*/
public class Encryption {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(args[1]);
        FileOutputStream fileOutputStream=new FileOutputStream(args[2]);



        if(args[0].equals("-e")&&args.length!=0){

            while (fileInputStream.available()>0){

                fileOutputStream.write(fileInputStream.read()+1);
            }

            fileInputStream.close();
            fileOutputStream.close();

        }

        else if(args[0].equals("-d")&&args.length!=0){
            while (fileInputStream.available()>0){

                fileOutputStream.write(fileInputStream.read()-1);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }


    }

}


/*этот вариант для вводимого ключа-например ключ вводится число 45-все значения наичнаются смещаться на 45 позиций вперед
 //(строка37
        //int key=Integer.parseInt(args[0]);

            while (fileInputStream.available()>0){
                int read=fileInputStream.read();
                fileOutputStream.write(read+key);
            }



  */
//  System.out.println("done");