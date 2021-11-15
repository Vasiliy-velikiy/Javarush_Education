package JavaRushLevel10;
/*Добавь одну операцию по преобразованию типа, чтобы получился ответ: b = 0.
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);*/
public class CorrectlyCastType3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f);//здесь был int
        System.out.println(b);
    }


}
