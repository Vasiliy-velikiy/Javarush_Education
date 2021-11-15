package JavaRushLevel19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*В методе main подмените объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна заменять все подстроки "te" на "??".
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.*/
public class SystemoutTest {


        public static TestString testString = new TestString();

        public static void main(String[] args) {
            PrintStream console=System.out;

            ByteArrayOutputStream outputStream=new ByteArrayOutputStream();

            PrintStream stream=new PrintStream(outputStream);
            System.setOut(stream);

            testString.printSomething();
            String result=outputStream.toString();

            System.setOut(console);

           // StringBuilder stringBuilder=new StringBuilder(result);
            //stringBuilder.replace("", , "");
            result=result.replace("te", "??");
                  System.out.println(result);
        }

        public static class TestString {
            public void printSomething() {
                System.out.println("it's a text for testing");
            }
        }

    }

