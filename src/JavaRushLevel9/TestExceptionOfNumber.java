package JavaRush;
/*Перехватить исключение (и вывести его на экран), указав его тип,
возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);*/
public class TestExceptionOfNumber {
    public static void main(String[] args) {
        //напишите тут ваш код
try {
    int num = Integer.parseInt("XYZ");
    System.out.println(num);
}
catch (NumberFormatException e){
    System.out.println(e.fillInStackTrace());
}
        //напишите тут ваш код
    }

}
