import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Scannner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, input number");

        /* чтобы проверить соответсвие вводимым данным- ввод числа а не строки
        применяется метод проверки целочисленного значения hasNextInt()
         */
        //если вводимое значение соответсмвует целочисл. то переменной number присваивается значения метода
        // (который считывает вводимое значение) если нет- то метод nextLine считывает последоват символов,
        // сохраняет в строковой переменной s и выводит на экран или  другие значения


        if(scanner.hasNextInt()){
            int number=scanner.nextInt();
            System.out.println("you entered the number---->"+number);
        } else if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            System.out.println("you entered double value--->" + a);
        }
        else {
            String s=scanner.nextLine();
            System.out.println("you entered wrong value ----> "+s);
        }

        //правильнее завершать раюоту сканера по завершению
        scanner.close();
//initialize Scanner object
        Scanner scanner2=new Scanner("Text/will be/ delimiter ");
        //initialize the String delimiter
        scanner2.useDelimiter("/");
        //printing delimiter used
        System.out.println("the delimiter use is -->"+scanner2.delimiter());
        //printing the tokenized Strings
        while (scanner2.hasNext()){
            System.out.println(scanner2.next());
        }
        scanner.close();

        Scanner scanner3=new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

        scanner3.useDelimiter("\n/*/*/*"); //? почему выводятся 3 звезды. если закоментировать эту строку, вывод не изменится

        while (scanner3.hasNext()) {
            System.out.println(scanner3.nextLine());
        }

        scanner3.close();
    }




    }

