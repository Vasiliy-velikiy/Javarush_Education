package Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.

Закрыть потоки.*/
public class PunctuationMarks {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bf.readLine();
        String filename2 = bf.readLine();


        BufferedReader bufferedReader=new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filename2));


        File file=new File(filename1);
        char[]chars=new char[(int) file.length()];
        //ArrayList<Character>chars=new ArrayList<Character>((int) file.length());


        while (bufferedReader.ready()){
           int c= bufferedReader.read();
            if(c>33&&c<48||  c>=58&&c<=64||c>=91&&c<=96||c==10||c>=123&&c<=127){
                continue;
            }
            bufferedWriter.write((char)c);



        }



   /*

        bufferedReader.read(chars);

        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]>31&&chars[i]<48&&chars[i]==10){
                chars[i]='@';

            }
            bufferedWriter.write(chars[i]);

        }





        for (int i = 0; i <chars.size() ; i++) {
            if(chars.get(i)>31&&chars.get(i)<48&&chars.get(i)==10){
                //chars.remove(i);

            }
            bufferedWriter.write(chars.get(i));

        }

*/

        for (char i:chars){
             // System.out.print(i);

        }

        bf.close();
        bufferedReader.close();
        bufferedWriter.close();

    }
}