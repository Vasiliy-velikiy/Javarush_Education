package JavaRush;
/*Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.*/
public class TestException {
    public static void main(String[] args) {
        //напишите тут ваш код
try {
    int a = 42 / 0;
}
catch (ArithmeticException e){
    System.out.println(e.fillInStackTrace());
}
        //напишите тут ваш код
    }
}
