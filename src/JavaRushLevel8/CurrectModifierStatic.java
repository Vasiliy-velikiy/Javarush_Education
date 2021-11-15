package JavaRushLevel8;

public class CurrectModifierStatic {
    public static int A = 5;//переставили сюда
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public  int getValue() {//static был тут
        return D;
    }

    public int getValue2() {
        return C;

    }
}
