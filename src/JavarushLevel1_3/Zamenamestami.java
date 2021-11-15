public class Zamenamestami {
boolean is=(6>5);
    //Given a string, return a new string where the first and last chars have been exchanged.

    public String frontBack(String str) {
        String firstChar, lastChar;
        firstChar = str.substring(0, 1);
        lastChar = str.substring(str.length() - 1, str.length());
        String yourInBetweenString = str.substring(1, str.length() - 1);
        String yourNewString;
        if (str.length()>= 1) {
            return str;
            //return lastChar+ yourInBetweenString+ firstChar;
        } else {
            return lastChar + yourInBetweenString + firstChar;

        }
    }






    public static void main(String[] args) {
        Zamenamestami zamenamestami=new Zamenamestami();
        System.out.println(zamenamestami.frontBack("back"));
        System.out.println(zamenamestami.frontBack("abc"));
        System.out.println(zamenamestami.is);

    }
}
