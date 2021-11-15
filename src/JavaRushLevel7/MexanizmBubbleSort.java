package JavaRushLevel7;

import java.util.Arrays;

public class MexanizmBubbleSort {

    public static void main(String[] args) {


        int[] array = {1, 18, 2, 13, 4, 5};


        int[] arrayCopy = new int[6];//copy sourse array in new array
        for (int i = 0; i <array.length ; i++) {
            arrayCopy[i]=array[i];
        }
/*--можно скопировать при помощи Arrays.copyOf---->int [] arrayCopy = Arrays.copyOf(array, array.length);
мы передаем наш оригинальный массив (из которого надо скопировать значения) и
 длину нового массива, в который мы копируем данные. В данном случае в качестве длины
 мы указали numbers.length, т.к. хотим скопировать массив целиком.
 Если же мы хотим скопировать только несколько первых элементов, можно указать длину
  для нового массива меньше:

  -- Кстати, если нужно скопировать часть массива,
   но не с начала, а “из середины”, Arrays позволяет сделать и это:
    int [] arrayCopy = Arrays.copyOfRange(array, 2,6);  В новый массив были скопированы числа из ячеек со второй (включительно) по шестую (не включительно).-
    со второй (включительно) по шестую (не включительно).
--Arrays.equals(numbers, numbers2)--->сравнение содержимых массива
а это сравнение ссылок массива : --->numbers.equals(numbers2)

 */
        for (int j = 0; j < array.length; j++) {
/*внешний цикл-чтобы звершить сортировку нужно вернуться в начало массива
 и произвести сравнение еще раз.(Более сложный вариант- реализовать увеличение исходного элемента  или умньшение
конечного элемента( так как в 1 шаге мы уже пододвинули туда элемент самый большой, нет
смысла еще раз проводить сравнение(пример будет ниже)
*/


            for (int i = 0; i < 5; i++) {
/* внутренний цикл- это один проход- выявление самого большого элемента и
 сдвигания его в край. но сортировка произведена не полностью, так как есть еще числа которые должны быть
раставлены в порядке возрастания- именно для этого и создается внешний цикл чтобы сделать 5 проходов
(на 1 меньше чем количества элементов)

                 */


 /* пример :for (int i = 0; i < array.length; i++) {
            for (int j = 4; j > i; j--) {//проход с конца элемента до предначального(начальный не учитывается, потому что в него будет вкладываеться мак или мин значение )
            //можно реализовать и наоборот что мак или мин будет вкладываться в последний элемент массива
                if (array[j - 1] < array[j]) {
                    int middle = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = middle;
                }
            }*/
                if (array[i] > array[i + 1]) {
                    int middle = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = middle;

                }

            }
            System.out.println(array[j]);


        }


        //тоже самое но использование класса Arrays


        System.out.println(arrayCopy);
        System.out.print("sourse arrayCopy: ");
        System.out.println(Arrays.toString(arrayCopy));
        Arrays.sort(arrayCopy);
        System.out.println(arrayCopy);
        System.out.print("sorted arrayCopy: ");
        System.out.println(Arrays.toString(arrayCopy));



    }
}