package JavaRushLevel9;
/*Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать
Thread.sleep(100);
Обернуть вызов sleep в try..catch.*/
public class Tread_sleep {
    public static void main(String[] args)  {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(100);
                System.out.println(i);
            }
            catch (Exception e) {

            }
            //напишите тут ваш код
        }
    }
}
