package JavaRushLevel10;
/*Добавь одну операцию по преобразованию типа, чтобы на экран вывелось 9.
short number = 9;
char zero = '0';
int nine = (zero + number)*/
public class CorrectlyCastType7Middle {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine =  (zero+ number );
        System.out.println((char)nine);
    }
}
