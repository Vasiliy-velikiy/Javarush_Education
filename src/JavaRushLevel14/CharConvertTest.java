package JavaRushLevel14;

public class CharConvertTest {
    public static void main(String[] args) {
//? КАК кодирается тип чар
        //Хранение чисел (для вычислений) в символе почти всегда является плохой идеей.
        char A = 49;//это код, каждый код соотвествует определенному символу по таблицу ACSII.Код 49 соответствует цифре 1
        char B = '1';//тип чар хронит в одинарных ковычках лишь один символ. В данном случае это символ 1
        char C = '\u0031';//юникод числа 1
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println(A +B+C);//операцция значит что складываются три кода 49 49 и 49 и их результат выводитсчя
        System.out.println(A+""+B+""+C);//склеиваются символы

        int bigNumber = 10000000;
        short smallNumber = (short) bigNumber;//т.к  допустимы диапазон short меньше чем int, то при кодировании часть байтов отбросится и в результате получим -27008
        System.out.println(smallNumber);
    }

}
