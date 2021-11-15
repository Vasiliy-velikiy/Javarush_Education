package JavaRushLevel18;
/*Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4*/
import java.io.*;

public class RoundNumbersTest_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));//создаем буфер для ввода имен файлов
        String filename1=bf.readLine();//имена файлов
        String filename2=bf.readLine();

        FileReader fileReader=new FileReader(filename1);//отдельно создаем поток для чтения символов из файла
        BufferedReader data=new BufferedReader(fileReader);//буфер для чтения символов

        FileWriter fileWriter=new FileWriter(filename2);//поток записи символов в файл


        while (data.ready()) {                         //ready-метод возвращает true если есть что то на прочтение в файле
            String s = data.readLine();               //построчно присваиваем s прочтенну СТРОКУ
            String[] array = s.split(" ");      // Метод split() разбивает объект String на массив строк путём разделения строки указанной подстрокой.

            for (String s1 : array) {   //итерируем и преобразуем каждое значение массива
                double d = Double.parseDouble(s1);
                int l = (int) Math.round(d); //чтобы округлить переменная должна быть либо int либо long округляет след образом 3.49 => 3, 3.50 => 4 и тд
                String str = Integer.toString(l); //переводим число в строку
                fileWriter.write(str);  //записываем в файл строку
                fileWriter.write(" ");
            }
        }
        //закрытие потоков
                bf.close();
                fileReader.close();
                fileWriter.close();
                data.close();



        }

    }

