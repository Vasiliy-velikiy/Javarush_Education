package TinkiffTasks;

import java.util.Scanner;
/*Вам дана строка S длины 4, состоящая из заглавных букв латинского алфавита.

Определите, правда ли, что S состоит из двух различных букв, каждая из которых встречается
дважды.

Вам нужно ответить на T независимых наборов входных данных.


Формат входных данных

Первая строка теста содержит одно целое число T (1 <= T <= 100) количество наборов входных данных.
Затем следуют T наборов входных данных.

В первой строке набора входных данных вводится строка S(|S|=4).


Формат выходных данных

Для каждого набора входных данных выведите ответ на него - «Yes»−, если S
состоит из двух букв, каждая из которых встречается дважды, и «No» иначе.

Примеры данных
Пример 1
4
ABBA
GOGO
FIRE
WAPP
вывод:
Yes
Yes
No
No*/
public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a1 = scanner.nextLine();
        int a = Integer.parseInt(a1);


        String[] strings = new String[a];
        for (int i = 0; i < a; i++) {
            String s = scanner.nextLine();
            strings[i] = s;

        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < strings.length; i++) {

            for (int j = 0; j < strings[i].length(); j++) {
                for (int k = strings[i].length() - 1; k > j; k--) {
                    if (strings[i].charAt(j) == strings[i].charAt(k)) count1++;
                }

            }
            //System.out.println(count1);
            count2=count1;


            if (count2==2) System.out.println("Yes");
            else System.out.println("No");
            count1=0;

        }


    }
}