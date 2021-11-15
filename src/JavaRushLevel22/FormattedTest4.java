package JavaRushLevel22;
/*Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
 Для перевода каретки не используй \n.

 Должен быть вывод:
 20 / 7 = 2,86
 Exp = 3,33e+00*/
public class FormattedTest4 {

    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %.2e";//так нельзя "20 / 7 = %.2f\nExp = %.2e"
    }
}
