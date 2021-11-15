package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

/*Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.*/
public class ChangeFirstWord {

    public static void main(String[] args) throws IOException {


        //1способ
/*
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = reader.readLine();
            String s2="";
            s2=s2+string.substring(0, 1).toUpperCase();//первый символ делаем заглавным
            for (int i = 1; i <string.length() ; i++) {
                //смотрим,был ли слева пробел(сравниваем символы индекса с предшествующим)
                if(" ".equals(string.substring(i-1,i)))
                    s2=s2+string.substring(i,i+1).toUpperCase();
                else {
                    s2=s2+string.substring(i, i+1);
                }

            }


        System.out.println(s2);

 */

        //2способ
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
//Метод split() разбивает объект String на массив строк путём разделения строки указанной подстрокой.
     for (String s:string.split("\\b")) //Совпадают границы слова за пределами скобок.
          {
         System.out.print(s.substring(0,1).toUpperCase()+s.substring(1));

        }



            //напишите тут ваш код
        }
    }








//вариант если ввод/вывод строк с новой строки

/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();

            if (string.isEmpty()) {//условие выхода из бесконечного цикла должна быть на1 месте. потому что по последовательности выдаст ошибку
                //если строка будет пустая- Индекс строки вне диапазона:
                break;
            }

            Character ch = string.charAt(0);
            ch = Character.toUpperCase(ch);
            String a = string.substring(1);
            string = ch + a;
            arrayList.add(string);


        }




        for (String s : arrayList) {
            System.out.println(s);

        }



        //напишите тут ваш код
    }

 */