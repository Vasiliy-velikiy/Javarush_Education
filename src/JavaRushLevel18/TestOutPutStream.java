package JavaRushLevel18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutPutStream {

    public static void main(String[] args) throws IOException {

        String name="C:/Users/vamoskalev/Documents/java/Новая папка/file1.txt";
        File file =new File(name);
        String s="I love java";
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(s.getBytes());//для того чтобы записать строчку в файл нам нужно ее перевести
        //в байтовый массив методом getBytes(),только потом метод write запишет поток байтов в файл
//строки будут перезаписываться а не создаваться заново, накапливаясь в файле
        fileOutputStream.close();
// если в конец new FileOutputStream(file ); добавить аргумент boolean append =true-значит будет происходить конкатенция
        



    }
}
