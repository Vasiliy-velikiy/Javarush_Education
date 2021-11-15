package JavaRushLevel19;
/*В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.
*/
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/*В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.

*/
public class SystemoutTest3 {
    public static TestString testString = new TestString();
    public static void main(String[] args) {
        //создаю поток вывода и присваиваю ему значение переменной out(значение которое будет выведено на экран )
        PrintStream console=System.out;
//создаю динамический байтовый массив
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
 //передаю этот массив на поток вывода(т.е то что мы будем выводить но в байтах)
  //и еще это адаптер к классу Printstream
        PrintStream printStream=new PrintStream(byteArrayOutputStream);//так как в поток нужно внести какое то значение вывода-это будет байтовый масс


//адаптер устанавливаю как текущую переменную System.out
 //переменной out-присвиваем значение вывода-поток который нужно вывести через переменную    out
System.setOut(printStream);

//вызываем метод который не знает о наших манипуляциях и выведет сообщение как ему было поручено
//??одновременно записывая в байтовый массив данные
testString.printSomething();

//Преобразовываем записанные в наш ByteArray данные в строку
String result=byteArrayOutputStream.toString();

result=result.toUpperCase();

 //Возвращаем все как было //без этого не будет работать
 System.setOut(console);


        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
