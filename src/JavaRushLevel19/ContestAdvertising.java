package Stream;

import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

/*В методе main подмени объект System.out написанной тобой ридер-оберткой.
Твоя ридер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth*/
public class ContestAdvertising {

    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console=System.out;
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

        PrintStream stream=new PrintStream(byteArrayOutputStream);
        System.setOut(stream);

        testString.printSomething();
        //String result=byteArrayOutputStream.toString();
        String []strings=byteArrayOutputStream.toString().split("\\n");


        System.setOut(console);


       // String[]strings=result.split(" ");


        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
                if (i%2==1){
                    System.out.println("JavaRush - курсы Java онлайн");
                }

        }
/*
        for (String se:strings){
          System.out.println(se);
        }
       System.out.println(strings[4]);



 */
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
