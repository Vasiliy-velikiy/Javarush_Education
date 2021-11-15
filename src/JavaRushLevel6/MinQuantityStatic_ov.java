package JavaRushLevel6;
/*Расставь минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.


*/
public class MinQuantityStatic_ov {

        public static int step;

        public static void main(String[] args) {
            method1();
        }

        public static void method1() {
          method2();//если бы в method2 не было static, то обращаться к этому методу
            //нужно было так new MinQuantityStatic_ov().method2()
        }

        public static void method2() {
            new MinQuantityStatic_ov().method3();
        }

        public void method3() {
            method4();
        }

        public  void  method4() {
            step++;
            for (StackTraceElement element : Thread.currentThread().getStackTrace())
                System.out.println(element);
            if (step > 1)
                return;
            main(null);
        }
    }

