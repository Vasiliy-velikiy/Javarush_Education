package Stream;

import java.io.*;

/*1. Считать с консоли имя файла. Считать содержимое файла.
2. Для каждой строки в файле:
2.1. переставить все символы в обратном порядке.
2.2. вывести на экран.
3. Закрыть потоки.

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/
public class ReversTextTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String namefile=bf.readLine();

       // String namefile = "C:/Users/Василий/Documents/тестовые_документы/1.txt";

        BufferedReader reader = new BufferedReader(new FileReader(namefile));



        while (reader.ready()){
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(reader.readLine());
            stringBuilder.reverse();
            System.out.println(stringBuilder);
        }

        bf.close();
        reader.close();


    }
}
