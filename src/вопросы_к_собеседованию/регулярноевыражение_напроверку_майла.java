package вопросы_к_собеседованию;

import java.util.regex.Pattern;

/*	Регулярное выражение для проверки email?*/
public class регулярноевыражение_напроверку_майла {
    //    .+@.+\..+  или достаточно поставить  /@/
    // .+@.+  мой вариант-  любой символ который встречается 1 и более затем символ собаки затем любой символ который встречается 1 и более раз
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(".+@.+");
;
        System.out.println("test@mail.ru".matches(".+@.+"));
        System.out.println("employee1@mydomain.by".matches(".+@.+"));
        System.out.println("employee3@mydomain.by".matches(".+@.+"));
        System.out.println("ivan.petrov@mydomain.by".matches(".+@.+"));
        System.out.println("marketing.department@mydomain.by".matches(".+@.+"));
        System.out.println("fgdgdgdf1".matches(".+@.+"));





    }
}
