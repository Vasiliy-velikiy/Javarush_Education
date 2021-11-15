public class Ydalenie_simvola_iz_stroki {
//ZADANIE- Given a non-empty string and an int n, return a new string where the char at index
// n has been removed. The value of n will be a valid index
// of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    // ЗАДАНИЕ- Учитывая непустую строку и int n, вернуть новую строку, где char по индексу
// n был удален. Значение n будет действительным индексом
// символа в исходной строке (т.е. n будет в диапазоне 0..str.length () - 1 включительно).
    //1 СПОСОБ- чтобы удалить символ мы пользуемся методом deleteCharAt и он возвращает строку без
    // без указанного символа, но нужно создать объект StringBuilder
    public StringBuilder missingChar(String str, int n) {
        StringBuilder bulid = new StringBuilder(str);
       return bulid.deleteCharAt(n);

    }
//2СПОСОБ= делим строку на 2 части и пользуемся substring,а так как substring возвращает символы
    //первый индекс-включительно а второй не включительно. То он нам он идеально подходит
    public static String missingChar1(String str, int n) {

        // The part of the String before the index:
        String str1 = str.substring(0,n);

        // The part of the String after the index:
        String str2 = str.substring(n+1,str.length());

        // These two parts together gives the String without the specified index
        return str1+str2;

    }



    public static void main(String[] args) {
        Ydalenie_simvola_iz_stroki test2=new Ydalenie_simvola_iz_stroki();
        //пример как работает CharAt из StringBuilder
        String str = "M1y java8 Progr5am";
        StringBuilder bulid = new StringBuilder(str);
        bulid.deleteCharAt(1);  // Shift the positions front. //удаляет букву с соответсвующим индексом
        bulid.deleteCharAt(8-1);
        bulid.deleteCharAt(15-2);
        System.out.println("Builder : "+bulid);
//вывод информации( проверка)
        System.out.println(test2.missingChar("жопа",2));
        System.out.println(test2.missingChar("мышь",3));
        System.out.println(test2.missingChar1("dropp",2));

    }
}
