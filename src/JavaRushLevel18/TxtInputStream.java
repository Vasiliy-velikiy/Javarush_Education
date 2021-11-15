package JavaRushLevel18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
Например, first.txt или name.1.part3.txt.
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать
исключение UnsupportedFileNameException.
Подумай, что еще нужно сделать, в случае выброшенного исключения.*/
public class TxtInputStream extends FileInputStream {
    // private final Object UnsupportedFileNameException=new UnsupportedOperationException();

    FileInputStream fileInputStream;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        //try {

            //if(fileName.substring(fileName.length()-4, fileName.length())==".txt")  {
            if (!(fileName.endsWith(".txt"))) {


                super.close();
                throw new UnsupportedFileNameException();
            }
        //} catch (Exception exception) {//ключевое слово брошено, его не надо обрабатывать!


        }
    //}


        public static void main (String[]args){


        }
    }


class UnsupportedFileNameException extends Exception {

}
