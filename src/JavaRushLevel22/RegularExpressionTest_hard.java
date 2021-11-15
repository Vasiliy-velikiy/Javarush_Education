package JavaRushLevel22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Метод checkTelNumber должен проверять, является ли аргумент telNumber валидным номером телефона.

Критерии валидности:
1) если номер начинается с '+', то он содержит 12 цифр
2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 1 пару скобок '(' и ')'
4) скобки (если они есть) внутри содержат четко 3 цифры
5) номер может содержать только цифры, '+', '(' и ')'
6) номер заканчивается на цифру

Примеры:
+380501234567 - true
+38(050)1234567 - true
(050)1234567 - true
0(501)234567 - true
+38)050(1234567 - false
+38(050)123-45-67 - false
050ххх4567 - false
050123456 - false
(0)501234567 - false


+380501234567
+38(050)1234567
(050)1234567
0(501)234567
+38)050(1234567
+38(050)123-45-67
050ххх4567
050123456
(0)501234567
+00(999555-55-55
+00999)555-55-55



*/
public class RegularExpressionTest_hard {

    public static boolean checkTelNumber(String telNumber) {

        if (telNumber == null || telNumber.isEmpty())
            return false;
        if (telNumber.matches("[a-zA-Z]"))return false;
        //1способ
        //  Pattern pattern=Pattern.compile("(\\+[0-9]{12})|(\\+\\d+[(]+\\d+[)]\\d{7})|\\d?[(]+\\d\\d\\d[)]\\d{6,}");

        //2 способ с критериями валидности
        //Pattern pattern=Pattern.compile("\\+?(\\d{2})\\(?(\\d{3})\\)?\\d-?(\\d{2})-?(\\d{2})-?(\\d{2})?");
        //Pattern pattern=Pattern.compile("^((\\+\\d{12})|([\\+]\\d{2}([\\(]([0-9]{3})[\\)]\\d{7}))|([\\+][0-9]{8}([\\-]\\d{2}){2})|(([0-9]{6})-\\d{4})|(\\d{10}))$");

      // Pattern pattern=Pattern.compile("^\\+?\\d{12}$|^\\+?\\d+[(]\\d{3}[)]\\d{7}$|[(]\\d{3}[)]\\d{7}$|\\d[(]\\d{3}[)]\\d{6}$");
       //Pattern pattern=Pattern.compile("(^\\+\\d{12})|([\\+]\\d{2}[(]\\d{3}[\\)]\\d{7})|([\\+]\\d*[(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2})|^\\d?[(]\\d{3}[)]\\d{6}\\d?");
       Pattern pattern=Pattern.compile("(^\\+\\d{12})|([\\+]\\d{2}[(]\\d{3}[\\)]\\d{7})|([\\+]\\d*[(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2})|^\\d?[(]\\d{3}[)]\\d{6}\\d?");


        Matcher matcher=pattern.matcher(telNumber);
if(matcher.find())
        return true;
else return false;
        //return telNumber.matches("^((\\+\\d{12})|([\\+]\\d{2}([\\(]([0-9]{3})[\\)]\\d{7}))|([\\+][0-9]{8}([\\-]\\d{2}){2})|(([0-9]{6})-\\d{4})|(\\d{10}))$")



    }


    public static int digitsCount(String s)
    {
        int count = 0;
        for (int i = 0, len = s.length(); i < len; i++)
        {
            if (Character.isDigit(s.charAt(i))) count++;
        }
        return count;

    }


    public static void main(String[] args) {


        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("(050)1234567"));
        System.out.println(checkTelNumber("0(501)234567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)123-45-67"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
        System.out.println(checkTelNumber("+00(999555-55-55"));
        System.out.println(checkTelNumber("+00999)555-55-55"));
    }


}
