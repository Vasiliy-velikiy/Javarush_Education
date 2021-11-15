package Stream;

import java.io.*;
import java.util.Scanner;

/*Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки "." на знак "!".
Результат вывести во второй файл.
Закрыть потоки*/
public class ReplaceSymbol {
    public static void main(String[] args) throws IOException {
        //Scanner scanner=new Scanner(System.in);

        //String filename1=scanner.nextLine();
       // String filename2=scanner.nextLine();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String filename1=bf.readLine();
        String filename2=bf.readLine();

        BufferedReader bufferedReader=new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filename2));

        File file=new File(filename1);
        char[]chars=new char[(int) file.length()];

        bufferedReader.read(chars);



        for (int r = 0; r <chars.length ; r++) {
            if(chars[r] == '.'){
                chars[r]='!';
            }
           bufferedWriter.write(chars[r]);

        }
//check
        for (char i:chars){
        //    System.out.print(i);

        }
//!!запись не будет происходить если потоки не будут закрыты
        bf.close();
       bufferedReader.close();
       bufferedWriter.close();


    }
}
