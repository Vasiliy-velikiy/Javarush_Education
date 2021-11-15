package JavaRush;
/*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;*/
public class TestExceptionOfArray {
    public static void main(String[] args) {
        //напишите тут ваш код

        int[] m = new int[2];
        try {
            m[8] = 5;
        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());

        }
        //напишите тут ваш код
    }

}
