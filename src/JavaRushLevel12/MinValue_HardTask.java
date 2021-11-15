package JavaRushLevel12;

import java.util.Arrays;

/*Напиши метод, который возвращает минимальное число в массиве и его позицию (индекс).*/
public class MinValue_HardTask {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        /*
        int[] arr2 = array;
        if (array == null || array.length == 0) {

            return new Pair<Integer, Integer>(null, null);
        } else {

            for (int i = 0; i < arr2.length; i++) {
                for (int j = arr2.length - 1; j > i; j--) {
                    if (arr2[j] < arr2[j - 1]) {
                        int middle = arr2[j];
                        arr2[j] = arr2[j - 1];
                        arr2[j - 1] = middle;
                    }

                }

            }
        }
//Вызов indexOf в вашем списке будет возвращать -1, потому что ЗНАЧЕНИЕ  никогда не будет найден, так как ваш список
//содержит объект массива, а не список данных, содержащихся в вашем массиве.

//indexOf даст резуьтат если создать коллекцию изагрузить туда значения

/*или же сделать класс обетку в массиве
Integer[] array = {1,2,3,3,4,5};

List Arraylist=Arrays.asList(array);
System.out.println(Arraylist.indexOf(значение));

тоже вернет правильное значение


        int c= Arrays.asList(array).indexOf(arr2[0]);

 return new Pair<Integer, Integer>(, );


         */
        if (array == null || array.length == 0) {

            return new Pair<Integer, Integer>(null, null);
        } else {

            int min=array[0];
            int index=0;
            for (int i = 1; i <array.length ; i++) {

                if(min>array[i]){
                    min=array[i];
                    index=i;

                }

            }
            return new Pair<Integer, Integer>(min,index );

        }
    }
        //напишите тут ваш код





    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
