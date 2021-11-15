package JavaRushLevel13;
/*Исправь код так, чтобы программа выполнялась и выводила фразу: "Я переводчик с английского".
Метод main менять нельзя!*/
public class InheritanceTest2 {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {//здесь был abstract class
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}
