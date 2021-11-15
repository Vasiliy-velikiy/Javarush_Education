package JavaRushLevel7;
/*переставь один модификатор static, чтобы пример скомпилировался.*/
public class OneModifierStatic {
    public final static int A = 5;
    public final static int B = 2;
    public final static   int C = A * B;

    public static void main(String[] args) {

    }

    public int getValue() {//в примере static был здесь
        //статические переменные/методы/блоки не могут использоваться не статические элементы, если у кого то
        // static -то должно сохраняться приведение элементов.(Они должны быть все статик) -тоже самое
        // для блоков классвои методов
        return C;
    }
}
