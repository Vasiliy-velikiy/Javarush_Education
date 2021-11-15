import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*В этой задаче тебе нужно:
В статическом блоке считать с консоли А и В — две переменные с типом int.
Обработать IOException в блоке catch.
Закрыть поток ввода методом close()*/
public class ReaderTest {

    public static int A;
    public static int B;

        static {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            try {

                A=Integer.parseInt(bf.readLine());
                B=Integer.parseInt(bf.readLine());
                bf.close();
            }
            catch (IOException ioException){

            }


        }
    public static final int MIN = min(A, B);//если эту строчку поставить на место 13 строки то ответ будет
    //всегда 0 тк инициализация в методе происходит раньше чем ввод начений с консоли

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
