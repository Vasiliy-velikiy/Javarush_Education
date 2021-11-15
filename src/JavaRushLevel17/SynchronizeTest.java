package JavaRushLevel17;
/*Установить модификатор synchronized только тем методам, которым необходимо.
Объект класса Solution будет использоваться нитями.*/
public class SynchronizeTest {

    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private  void method0() { //здесь ненужна synchronized, так как операция присваивания атомарна
        Double d = method3();
    }

    protected  void method1(String param1) {//здесь ненужна synchronized method1 не меняет общие ресуры,(т.к  method0 атомарный)
        SynchronizeTest solution = new SynchronizeTest();
        solution.method0();
    }

    public void method2(int param1) {
        param1++;
    }

   synchronized double  method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected  void method5(String param2) {//здесь ненужна synchronized, method5 не меняет общие ресуры и к тому же
        //StringBuffer имеет встроенную синхронизацию
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }
}