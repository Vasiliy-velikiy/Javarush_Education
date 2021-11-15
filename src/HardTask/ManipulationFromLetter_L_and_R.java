package HardTask;

import java.util.ArrayList;

/*1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза*/
public class ManipulationFromLetter_L_and_R {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");

//вывод исходных элементов
        //for (String s:strings) {
          // System.out.println(s); }
        //System.out.println();



        strings = fix(strings);


        for (String string : strings) {
            System.out.println(string);
        }





    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i <strings.size() ; i++) {






/*если ставить во всех условихя if- какое то из условий не будет выполняться
После ключевого слова if ставится условие. И если это условие выполняется, то срабатывает код,
который помещен в далее в блоке if после фигурных скобок

//конструкция if-else дает обработку дополнительных условий которые будут считаться друг сдругом вместе, в
случае с if проверка условий происходит по отдельности

 */
            if(strings.get(i).indexOf("л")>=0&&strings.get(i).indexOf("р")>=0){
                continue;//  ключевое слово, которое может быть использовано в любой структуре цикла,
                // и оно призывает цикл сразу же перейти к следующей итерации. т е ничего не делает и переходит дальше
            }


            else if(strings.get(i).indexOf("р")>=0){
                strings.remove(i);
                i--;
            }
            else if (strings.get(i).indexOf("л")>=0) {

                strings.add(i + 1, strings.get(i));
                i++;
            }






        }
        //напишите тут ваш код
        return strings;
    }
}
