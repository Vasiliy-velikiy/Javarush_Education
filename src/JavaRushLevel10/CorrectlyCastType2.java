package JavaRushLevel10;

import org.w3c.dom.ls.LSOutput;

/*Правильно расставь операторы приведения типа, чтобы получился ответ: d=3.765.
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;*/
public class CorrectlyCastType2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c =(float) a / b;// выдает целое число 3.0( потому что переменные int) если скобку привести к (float) будет =3.75
        double d = a * 1e-3 + c;//1e-3 -умножение на 10 в степени -3 =0.001

        System.out.println(d);
        System.out.println(c);
    }
}
