package JavaRushCiclLevel4;
/*Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.*/
public class EvenNumbers {
    public static void main(String[] args) {

        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
        /*более простой способ

         for (i = 2; i <= 100; i+=2) {
           System.out.println(i);
       }




        */
    }
}
