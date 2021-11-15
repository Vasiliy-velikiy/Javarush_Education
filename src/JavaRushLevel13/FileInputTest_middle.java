package JavaRushLevelTest;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*В этой задаче тебе нужно:
Считать с консоли имя файла.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.*/
public class FileInputTest_middle {
    //нужно доработать кодировку , но логика вывода данных файла правильная
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);

        int i = -1;
        while ((i = fileInputStream.read()) != -1) {

            System.out.print((char) i);
        }

        bf.close();
        fileInputStream.close();
    }
}
/*В данном случае мы считываем каждый отдельный байт в переменную i:

1
while((i=fileInputStream.read())!=-1){
Когда в потоке больше нет данных для чтения, метод возвращает число -1.

Затем каждый считанный байт конвертируется в объект типа char и выводится на консоль.

Подобным образом можно считать данные в массив байтов и затем производить с ним манипуляции:

byte[] buffer = new byte[fin.available()];
// считаем файл в буфер
fin.read(buffer, 0, fin.available());

System.out.println("File data:");
for(int i=0; i<buffer.length;i++){

    System.out.print((char)buffer[i]);
}*/


