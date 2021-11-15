package JavaRushLevel9;
/*Расставь модификаторы static так, чтобы пример скомпилировался.*/
public class Solution {

    public  static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;//остается прежним, так как нестатич переменные может вызывать что угодно. метод getA аналогичен
    public static int D = A * B;// п2:-так как статичная перменная может использовать у себя тольок статичный переменные
    //выставляем static на А и В

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;

        Solution.D = 5;// п.1:эта запись равносильна записи D=5(а обращаться к переменным/методам без точ натации через объект могут статики);
        // И main хочет напряму обратьться к D,
        // ПОЭТОМУ ее помечаем как static. Далее смотрим на декларацию переменной
    }

    public int getA() {
        return A;
    }

}
