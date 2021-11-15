package JavaRushLevel22;
/*Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
    Параметры должны меняться местами.

    Должен быть вывод:
    МНЕ нравится курс JavaRush*/
public class FormattedTest2 {

    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }

    public static String getFormattedString() {
        return "%3$S %4$s %2$s %1$s";  //ЗАглавная буква %S-переводит строку в верхний регистр
    }
}
