package JavaRushLevel17;
/*Singleton паттерн - синхронизация в методе.
Класс IMF - это Международный Валютный Фонд.
Внутри метода getFund создай синхронизированный блок.
Внутри синхронизированного блока инициализируй поле imf так, чтобы метод getFund всегда возвращал один и тот же объект.*/
public class SingletonThreadTest5 {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund);
    }
}
class IMF {

    private static IMF imf;

    public  static IMF getFund() {
        try {


            synchronized (imf) {
                if (imf == null) {
                    imf = new IMF();
                }

                //add your code here - добавь код тут

            }
        }
        catch (Exception e){

        }
        return imf;
    }

    private IMF() {
    }
}