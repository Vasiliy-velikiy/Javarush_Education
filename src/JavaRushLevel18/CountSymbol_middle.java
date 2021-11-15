import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*С консоли считать имя файла.
    Посчитать в файле количество символов ',', количество вывести на консоль.
    Закрыть потоки.

    Подсказка:
    нужно сравнивать с ascii-кодом символа ','.*/
public class CountSymbol_middle {
    public static void main(String[] args) throws IOException {
        BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in));
        String filename=bf.readLine();
List<Integer > list=new ArrayList<>();
        //Reader reader=new InputStreamReader(new FileInputStream(filename));

        FileInputStream fileInputStream=new FileInputStream(filename);
        byte[] buffer = new byte[fileInputStream.available()];
int count=0;

        if (fileInputStream.available()>0){
            fileInputStream.read(buffer);


        }
        fileInputStream.close();

        for (int i = 0; i < buffer.length ; i++) {
            if(buffer[i]==44){
                count++;
            }

        }
        System.out.println(count);
    }


}
