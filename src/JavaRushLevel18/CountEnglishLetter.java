package Stream;

import java.io.FileInputStream;

import java.io.IOException;

/*В метод main первым параметром приходит путь к файлу.
Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
Вывести на экран число (количество символов).
Закрыть потоки.*/
public class CountEnglishLetter {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(args[0]);
     int countenglishletter=0;

        while (fileInputStream.available()>0){
            int i=fileInputStream.read();
                if(i>=65&&i<=90){
                    countenglishletter++;
                }
                else if (i>=97&&i<=122){
                    countenglishletter++;
                }
        }
fileInputStream.close();
        System.out.println(countenglishletter);
/*
при запуске из командной строки мы сначала компилируем в файл с расширением .class-то файл . JAVA,
 скомпилированный компилятором Java, содержит байт-код, который является двоичным кодом программы,
 запускаемый когда работает Java Virtual Machine (JVM).
 затем запускаем файл java командой java CountEnglishLetter.java, далее идет параметр args[0]
 C:/Users//Василий/Documents/тестовые_документы/1.txt-путь к файлу который передается в объект считывания байтов из  файла
 строчка-14


java CountEnglishLetter.java C:/Users//Василий/Documents/тестовые_документы/1.txt


 */
 /*проверка вывода параметров
for(String s:args){
    System.out.println(s);
}

 */

    }
}
