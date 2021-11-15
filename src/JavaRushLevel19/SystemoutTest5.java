package JavaRushLevel19;

import java.io.*;
import java.nio.BufferOverflowException;

/*Считай с консоли имя файла.
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Закрой поток файла.

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/
public class SystemoutTest5 {


    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream console=System.out;

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

        PrintStream stream=new PrintStream(byteArrayOutputStream);

        System.setOut(stream);

        testString.printSomething();


 //твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
String  s=byteArrayOutputStream.toString();

        //Возвращаем все как было
        System.setOut(console);






        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String name=bufferedReader.readLine();
        //FileWriter fileWriter=new FileWriter(name);

        FileOutputStream fileWriter=new FileOutputStream(name);

        byte[]bytes=s.getBytes();// кодирует данную строку в последовательность байтов, используя
        // charsetName (кодировку), сохраняет результат в новый массив байтов.
fileWriter.write(bytes);





        bufferedReader.close();
        fileWriter.close();
        System.out.println(s);



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }

    }
}
