

/*Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.*/
//задачу принимает но во 2 файле 2первые строки-пустые и лишь на третьей
// записывает файлы в обратном порядке
import java.io.*;
import java.nio.Buffer;

public class ReversWriteByte_middle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String firstfile=bf.readLine();
        String secondfile=bf.readLine();

        FileInputStream fileInputStream=new FileInputStream(firstfile);
        FileOutputStream fileOutputStream=new FileOutputStream(secondfile);

        byte[]buff=new byte[fileInputStream.available()];

        while(fileInputStream.available()>0){
            int count = fileInputStream.read(buff);

            for (int i = buff.length-1; i >=0 ; i--) {
                fileOutputStream.write(buff[i] );


            }
        //fileOutputStream.write(buff,0+count,count);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
}
