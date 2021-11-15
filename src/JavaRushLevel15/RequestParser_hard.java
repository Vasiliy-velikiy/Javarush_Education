package JavaRushLevel15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//https://metanit.com/java/tutorial/7.2.php
/*Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (дробные числа разделяются точкой);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14*/
public class RequestParser_hard {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String link = bf.readLine();
    //нужно определить индекс, с которого вырежем в новую строку все параметры
    int a=link.lastIndexOf("?");
    //substring-возвращает новую подстроку с опредленного индекса включая индекс
        String parametr=link.substring(a+1);


//создаем массив и добавляем поочередно все данные разделенные символом-&
String [] parametrarray=parametr.split("&");

//создаем коллекцию для отделения имени параметра от значения
        ArrayList<String>arrayList=new ArrayList<>();

        //проходим циклом по всем значениям parametrarray,которые имеют =(равно) отделяем наименование от цифр
        for (int i = 0; i <parametrarray.length ; i++) {
            if (parametrarray[i].contains("=")) {
                int b = parametrarray[i].lastIndexOf("=");
                String middle = parametrarray[i].substring(0, b);
                arrayList.add(middle);
            } else arrayList.add(parametrarray[i]);

        }
for (int i=0;i<arrayList.size();i++){
    System.out.print(arrayList.get(i)+" ");
}


        for (int i = 0; i <parametrarray.length; i++) {
            if(parametrarray[i].contains("obj")) {
                System.out.println("");
                    int c = parametrarray[i].lastIndexOf("=");
                    try {
                        double d = Double.parseDouble(parametrarray[i].substring(c + 1));
                        alert(d);
                    } catch (Exception e) {
                        alert(parametrarray[i].substring(c + 1));

                    }

                }


            }
        }
            //add your code here



        public static void alert ( double value){
            System.out.println("double: " + value);
        }

        public static void alert (String value){
            System.out.println("String: " + value);
        }


    }

