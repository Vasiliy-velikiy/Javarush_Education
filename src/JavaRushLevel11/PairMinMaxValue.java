package JavaRushLevel11;
/*Напиши метод, который возвращает минимальное и максимальное числа в массиве*/
public class PairMinMaxValue {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //1 способ
        /*
      int[]  inputArraycopy=inputArray;

        for (int i = 0; i <inputArraycopy.length ; i++) {
            for (int j = inputArraycopy.length-1; j >i ; j--) {
                if(inputArraycopy[j]<inputArraycopy[j-1]){
                    int middle=inputArraycopy[j];
                    inputArraycopy[j]=inputArraycopy[j-1];
                    inputArraycopy[j-1]=middle;
                }

            }

        }
        int nach=inputArraycopy[0];
        int konec=inputArraycopy[inputArraycopy.length-1];


        // напишите тут ваш код

        return new Pair<Integer, Integer>(nach, konec);

         */
        //2способ
        int a=inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if(a>inputArray[i]){
               a=inputArray[i];
            }

        }
        int b=inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (b < inputArray[i]) {
                b = inputArray[i];
            }
        }


        return new Pair<Integer, Integer>(a,b);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
