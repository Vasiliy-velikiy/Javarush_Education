package JavaRushLevelTest;

import java.io.*;
import java.nio.Buffer;

/*В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Вывести абсолютно все введенные строки в файл, каждую строчку — с новой строки.*/
public class FileInputTest_hard {
    public static void main(String[] args) throws IOException {


        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();

        BufferedWriter writter = new BufferedWriter(new FileWriter(s));

         for (;true;){

              s=bf.readLine();

                 writter.write(s + "\n");



             if(s.equals("exit")){
                 break;
             }


         }
        writter.close();


         //fileOutputStream.close();
        // напишите тут ваш код
    }

}
