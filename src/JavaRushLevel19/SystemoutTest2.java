package JavaRushLevel19;

import org.w3c.dom.ls.LSOutput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить только цифры.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.

Пример вывода:
12345678*/
public class SystemoutTest2 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();

        PrintStream stream=new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String result=outputStream.toString();
        System.setOut(console);
//replaceAll-начит заменить все "[^0-9]" значек^-приставка не-тоесть заменить все кроме цифр от0до9 на пустое значение-""
        result=result.replaceAll("[^0-9]", "");

        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
