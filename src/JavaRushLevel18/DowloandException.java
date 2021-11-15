import java.io.*;
import java.nio.Buffer;

/*1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.*/
public class DowloandException {

    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while (true){
            line= bf.readLine();
            FileInputStream fileInputStream=new FileInputStream(line);
            if(fileInputStream.available()<1000) {
                bf.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
