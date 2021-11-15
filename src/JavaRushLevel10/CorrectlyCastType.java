package JavaRushLevel10;


/*

Правильно расставь операторы приведения типа, чтобы получился ответ: d > 0.
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);

*/
public class CorrectlyCastType {
    public static void main(String[] args) {

        int a = 0;              //=0
        int b =(byte) a + 46;   //=46 //создаем переменную с на 2млн значений и в нее кладем суженый тип (byte) a + 46
        byte c = (byte) (a * b);//0
        double f = (char) 1234.15;//=1234 //создаем символную запись 1234.15 и кладем в переменную f, будет оброшена дробная часть(0 на ее месте)
        long d = (int) (a + f / c + b); //здесь будет NaN(Not a Number) т.к 1234/0 -максимальные значения для типа в скобках
        System.out.println(d);
        System.out.println(f);


        System.out.println((char) 1234.15);
         /*
        long a = 10000000;
        short c = (short) a;
        System.out.println(a);
        System.out.println(c);
        */
    }
}

