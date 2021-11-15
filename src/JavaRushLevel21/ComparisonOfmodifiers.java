package JavaRushLevel21;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/*Реализовать логику метода isModifierSet, который проверяет, содержит ли переданный параметр allModifiers
значение конкретного модификатора specificModifier.

P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.
*/
public class ComparisonOfmodifiers {
public static void main(String[] args) {
        int classModifiers = ComparisonOfmodifiers.class.getModifiers();//getModifiers() возвращает результат в виде числа, в котором
                                                           // как бы зашифрованы модификаторы доступа того класса или метода, у которого он вызван.
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
        }
//один из способов решения задачи
        /*Я зашел на сайт Оракл    https://docs.oracle.com/javase/7/docs/api/java/lang/reflect/Modifier.html
В описании Field Detail про модификаторы доступа, перешел по ссылке Constant Field Values (значения полей),
 открылась таблица с возвращаемыми значениями для каждого модификатора. Они возрастают от 1 до 2048. (1, 2, 4, 8,
  16 ....) .
Далее я обратил внимание на метод  methodModifiers в нашем задании. Он возвращает СУММУ значений всех полей,
которые есть в нашем методе (в данном случае Main).
Если вывести в консоль значения:
public static boolean isModifierSet(int allModifiers, int specificModifier) {
        System.out.println(allModifiers + " " + specificModifier);
    }
то мы увидим такой результат:
1 1
1 8
9 8   // нас интересует это.
9 - это СУММА значений модификаторов в методе main, а 8 - значение модификатора, наличие которого мы хотим проверить (ИСКОМОЕ).
Я сделал задачу так: Если максимальное значение модификатора 2048 и каждое следующее значение в таблице в два раза меньше, то сумма всех модификаторов будет меньше 4096.
Я определил две эти переменные как максимальная и минимальная и через цикл начал проверять, в каком диапазоне
лежит СУММА значений модификаторов MAIN. Далее из СУММЫ значений вычитаю наше ИСКОМОЕ значение и проверяю.
 Разумеется перед этим сделал проверку на то, что ИСКОМОЕ значение меньше, чем СУММА .

int nMin;
            int nMax = 4096;
            int numb;
            for( nMin = 2048; nMin >= 1; ) {
                if ((nMin < allModifiers) && (allModifiers < nMax)) {
                    numb = allModifiers - specificModifier;
                    if ((specificModifier == (allModifiers - numb)) || (specificModifier == numb)) {
                        return true;
                    }
                }
                nMin /= 2;
                nMax /= 2;
            }
            return false;

Естественно, если совпадений нет, возвращаем ложь.*/

public static boolean isModifierSet(int allModifiers, int specificModifier) {
//почему не проходить это условие?
    /*if(allModifiers == specificModifier) return  true;
    else  return  false;
//потому что сравниваются числа получаемых мадификаторов

     */
        //но все гораздо проще- если какого то модификатора нет в классе то побитовая операция даст ноль
/*пример
Вычисляем NestedClass.class.getModifiers() & Modifier.FINAL:
100 0000 1001 - NestedClass.class.getModifiers()
000 0001 0000 - Modifier.FINAL (добавили слева 3 нуля для удобства)
000 0000 0000 - ответ 0. У нас нет ни одной единицы, т.к. только 1 & 1 = 1. 1 & 0 = 0, 0 & 1 = 0, 0 & 0 = 0

 */
  return  (allModifiers & specificModifier) > 0;//&-побитовая операция-это значит что  два числа переводятся в байты и начинается сравнивнение
        }

private static Method getMainMethod() {
        Method[] methods = ComparisonOfmodifiers.class.getDeclaredMethods();
        for (Method method : methods) {
        if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
        }
        }
