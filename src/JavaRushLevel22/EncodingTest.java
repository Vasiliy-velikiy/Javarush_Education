package JavaRushLevel22;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.*/
public class EncodingTest {
    public static void main(String[] args) throws IOException {


        //BufferedReader bf=new BufferedReader(new FileReader(args[0]));
        //BufferedWriter br=new BufferedWriter(new FileWriter(args[1]));

        FileInputStream inputStream=new FileInputStream(args[0]);
        byte[]mass=new byte[inputStream.available()];

        inputStream.read(mass);
        String s = new String(mass, "Windows-1251");

         inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(args[1]);


        byte[]mass2= s.getBytes(StandardCharsets.UTF_8);
        outputStream.write(mass2);
        outputStream.close();


    }

}
