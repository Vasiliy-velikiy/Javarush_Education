package JavaRushCiclLevel4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988*/
public class OutputNameAndDateofBirth {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        String a1 = bf.readLine();
        String a2 = bf.readLine();
        String a3 = bf.readLine();

        int y = Integer.parseInt(a1);
        int m = Integer.parseInt(a2);
        int d = Integer.parseInt(a3);
        System.out.println("Меня зовут "+s1+".");
        System.out.println("Я родился "+d+"."+m+"."+y);

    }
}
