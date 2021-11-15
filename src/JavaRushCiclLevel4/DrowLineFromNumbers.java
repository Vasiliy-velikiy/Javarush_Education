package JavaRushCiclLevel4;

/*Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).*/

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DrowLineFromNumbers {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <11 ; i++) {
            System.out.print(8);

        }
        System.out.println();

        for (int i = 0; i <10 ; i++) {
            System.out.println(8);

        }


        /*Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.*/

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bf.readLine();

        for (int i = 0; i <10 ; i++) {
            System.out.println(a1+" любит меня.");

        }

    }
}
