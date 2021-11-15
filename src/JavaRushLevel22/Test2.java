package JavaRushLevel22;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file1=new File("C:\\Users\\Василий\\Documents\\тестовые_документы\\1.txt");
        File file2=new File("C:\\Users\\Василий\\Documents\\тестовые_документы\\3.txt");
        file2.createNewFile();

        //BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
            FileInputStream fileInputStream=new FileInputStream(file1);
        byte[]mass=new byte[fileInputStream.available()];
        fileInputStream.read(mass);
        FileOutputStream fileOutputStream=new FileOutputStream(file2);
        fileOutputStream.write(mass);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
