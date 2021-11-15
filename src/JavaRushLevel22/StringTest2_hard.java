package JavaRushLevel22;

import java.util.ArrayList;

/*Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
"JavaRush - лучший сервис обучения Java."

Результат:
"- лучший сервис обучения"

Пример:
"Амиго и Диего лучшие друзья!"

Результат:
"и Диего лучшие друзья!"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).*/
public class StringTest2_hard {

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        //"- лучший сервис обучения"
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
        //"и Диего лучшие друзья!"
        System.out.println(getPartOfString("Лучшие друзья Амиго и Диего!"));
        //"друзья Амиго и Диего!"
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        TooShortStringException tooShortStringException = new TooShortStringException();
        if (string == null) throw tooShortStringException;

        try {
            char[]mass=string.toCharArray();
            ArrayList<Integer>arrayList=new ArrayList<>();
            int countspase=0;

            for (int i = 0; i < mass.length ; i++) {

                if (mass[i]=='\u0020'){//запоминаем индексы каждого вхождения пробелов
                    countspase++;//если нашли пробел, увеличиваем счетчик
                    arrayList.add(i);//и добавляем его положение в список(это нужно чтобы правильно отформатировать строку вывода
                }

            }

            if (countspase < 4) {//если  пробелов меньше четырех -выбрасываем исключение
                throw tooShortStringException;
            }
            int firstspase=arrayList.get(0);//индекс первого пробела
            int forthspase=arrayList.get(3);//индекс 4го пробела

        if (countspase>4)  return string.substring(firstspase+1,arrayList.get(4));//
           else
            return string.substring(firstspase+1,string.length());




        } catch (Exception e) {
            throw tooShortStringException;
        }

    }






    public static class TooShortStringException extends RuntimeException {
    }
}
