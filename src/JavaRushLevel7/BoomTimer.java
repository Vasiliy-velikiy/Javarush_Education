package JavaRushLevel7;
/*
Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку,
воспользуйся функцией:
 Thread.sleep(100); //задержка на одну десятую секунды.



 */

public class BoomTimer {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(100);

            System.out.println(i);

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
