package JavaRushLevel13;
/*В этой задаче нужно:
Создать класс EnglishTranslator, который наследуется от Translator.
Реализовать все абстрактные методы.
Подумай, что должен возвращать метод getLanguage.
Сделать так, чтобы программа выводила: "Я переводчик с английского"
 путем вызова метода translate у объекта типа EnglishTranslator.*/
public class InheritanceTest {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public  String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    static class EnglishTranslator extends Translator{
        @Override
        public String translate() {
            return super.translate();
        }

        @Override
        public String getLanguage() {
            return "английского";
        }
    }

}
