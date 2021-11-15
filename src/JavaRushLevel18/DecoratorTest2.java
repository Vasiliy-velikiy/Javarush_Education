package JavaRushLevel18;
/*Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream.
В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
2. Считай строку.
3. Если считанная строка равна "Д", то закрыть поток.
4. Если считанная строка не равна "Д", то не закрывать поток.*/

//исходный вариант

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.nio.BufferOverflowException;

/*public class QuestionFileOutputStream implements AmigoOutputStream {

}
public interface AmigoOutputStream {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}
*/
public class DecoratorTest2 {
    public static void main(String[] args) {


    }
}

   class QuestionFileOutputStream implements AmigoOutputStream {
private AmigoOutputStream amigoOutputStream;



        QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
            this.amigoOutputStream=amigoOutputStream;
        }



     @Override
     public void flush() throws IOException {
            amigoOutputStream.flush();

     }

     @Override
     public void write(int b) throws IOException {
            amigoOutputStream.write(b);

     }

     @Override
     public void write(byte[] b) throws IOException {
            amigoOutputStream.write(b);

     }

     @Override
     public void write(byte[] b, int off, int len) throws IOException {
            amigoOutputStream.write(b, off, len);

     }

     @Override
     public void close() throws IOException {



         System.out.println("Вы действительно хотите закрыть поток? Д/Н");
         BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
         String s=bf.readLine();
         if (s.equals("Д")) {  this.amigoOutputStream.close();//если не указать this.amigoOutputStream- не примет
             // решение с таким вариантом: f (s.equals("Д")) {  amigoOutputStream.close();


         }
     }
 }

 interface AmigoOutputStream  {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}