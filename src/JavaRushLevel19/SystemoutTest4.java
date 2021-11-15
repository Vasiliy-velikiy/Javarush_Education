package JavaRushLevel19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

/*В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9*/
public class SystemoutTest4 {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
//запоминаем настоящий PrintStream в специальную переменную
        PrintStream console=System.out;

        //Создаем динамический массив
        ByteArrayOutputStream byteArrayOutputStream=new  ByteArrayOutputStream();

        //создаем адаптер к классу PrintStream
        PrintStream stream=new PrintStream(byteArrayOutputStream);

        //Устанавливаем его как текущий System.out
        System.setOut(stream);

//Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

// //Преобразовываем записанные в наш ByteArray данные в строку
        String result=byteArrayOutputStream.toString();

        //Возвращаем все как было
        System.setOut(console);

//манипулации со строкой

      String[] strings=result.split(" ");
      int first=Integer.parseInt(strings[0]);
      int second=Integer.parseInt(strings[2]);
      //проверка
        //System.out.println(first);
        //System.out.println(second);

      int resultint=0;



        if(strings[1].equals("+")){
            resultint=first+second;
        }
        if(strings[1].equals("-")){
            resultint=first-second;
        }
        if(strings[1].equals("*")){
            resultint=first*second;
        }




        result=result+resultint;

//решение не верное так как число может быть многозначным
        /*int first=Character.getNumericValue(result.charAt(0));
        int second=Character.getNumericValue(result.charAt(4));






        if(result.charAt(2)=='+'){
            resultint=first+second;
        }
        if(result.charAt(2)=='-'){
            resultint=first-second;
        }
        if(result.charAt(2)=='*'){
            resultint=first*second;
        }

String SASASA=String.valueOf(resultint);
  result=result+resultint;


        //stringBuilder=stringBuilder.append(resultint);

         */


            System.out.print(result);



    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}
