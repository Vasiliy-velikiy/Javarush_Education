package JavaRushLevel10;
/*Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0.
double d = (short) 2.50256e2d;
char c = (short) 'd';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (d * s) - 500e-3;*/
public class CorrectlyCastType5 {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;//(short) //=250.256
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = (int) 150000;//был short
        float f = (float) 0.50f;//был short
        double result = f + (i / c) - (d * s) - 500e-3;
        //System.out.println("result: " + result);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(result);

    }

}
