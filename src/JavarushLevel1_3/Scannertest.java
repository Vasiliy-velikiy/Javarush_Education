import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;
/*задачи:
1)ввести с клавиатуры имя и вывести надпись-  name + зарабатывает 5000$. Ха-ха-ха!
2)ввести с клавиатуры 3 имени и вывести на экран name1+ name2+ name3=Очень хорошие друзья

3) реализовать метод getMetreFromCentimetre( метод на вход принимает количество сантиметров
и возвращает количество полных метров, например 253cm--->2m. Программа не должна считывать
данные с клавиатуры.
И ВО втором варианте преобразовать задачу так,чтобы программа считывала данные с консоли

4)Ввести с клавиатуры отдельно ИМЯ, ЧИСЛО1. Вывести надпись--> "Имя" получает "число1"


 */


public class Scannertest {

    public static void main(String[] args) throws Exception { // должны прописать исключения для ввода данных---чтобы не выдавал ошибку


   /*1ЗАДАЧА

        1 ВАРИАНТ СО Scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите имя");
        String s=scanner.nextLine();
        System.out.println(s+" зарабатывает 5000$. Ха-ха-ха!");
       */
   /*2 вариант с bufferedReader, bufferedWriter

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter the name ");
        String name=bufferedReader.readLine();
        System.out.println(name+ " зарабатывает 5000$. Ха-ха-ха!");
            */
   /* 2 ЗАДАЧА

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String name1=br.readLine();
          String name2=br.readLine();
          String name3=br.readLine();
        System.out.println(name1+" "+name2+ " "+name3+"=Очень хорошие друзья");
          */



    /* 3 задача (вариант Scanner)( отдельно с вводом данных, обработкой значений и возвратом через метод
  getMetreFromCentimetre   не получается.
         Scanner scanner=new Scanner(System.in);
        System.out.println("enter value in sm");
        int value=scanner.nextInt();
        if (value!=0){
            double a=(double)value/100;
            System.out.println(a+" m");
            } else System.out.println("0");
*/

    /* вариант с buffered
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter value in cm");
        String b = bf.readLine();

        double a=Double.parseDouble(b);
        if (a!=0){
            a=a/100;
            System.out.println(a+" m");
        } else System.out.println("0");
     */

    /*метод для решения первой части 3 задачи (с входными значениями)
public void double getMetreFromCentimetre(int i){
    return (double) i/100;
    }
     */


        //=4 задача
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        String s1=bf.readLine();





        int a1=Integer.parseInt(s1);

        System.out.println(s+" получает "+a1);




    }
}



