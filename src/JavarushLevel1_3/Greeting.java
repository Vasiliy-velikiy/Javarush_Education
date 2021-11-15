import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class  Greeting {


    public void gotofuture( int currentYear){
        currentYear= currentYear+10;
        System.out.println(currentYear);
    }

    public void sayHi(String...names){
        for(String name:names) System.out.println(name+ " hello my little friend");
    }


    public static void main(String[] args) {
        Greeting greeting=new Greeting();
        greeting.sayHi("Frank","Mops","Cat");

        greeting.gotofuture(10);

// тестовые варианты escape-последовтаельностей
        String test="    \t";
        String test1="1";
        String s1="\"people\", \\human\\, \'word\'";
        String s= "hello\tjava  ,I am humann\b.\n How do you do?  I am fine";


        System.out.println(test+test1);
        System.out.println(s1);
        System.out.println(s);

        System.out.print("3*6=13");
        System.out.print("\b\b");// \b-Символ возврата в тексте на один шаг назад или удаление
        // одного символа в строке (backspace) --в даннос случ удаляются 2 символа
        System.out.println("12");

        System.out.print("Следующий вывод будет с новой строки\n");
        System.out.println("Следующий вывод будет с новой строки");
        System.out.print("это вывыод. а вот след вывод будет со старой строки---> ");
        System.out.print("nnnn");
        System.out.println();

        /*Символ возврата каретки \r позволяет нам вернуть курсор к началу строки вывода и
        отображать новую информацию так, как будто ранее в этой строке ничего не было.
        -т.е он удаляет все что было на этой строке
         */
        System.out.print("Текст который необходимо переписать.");//На экране отображается "Текст который необходимо переписать."
        System.out.print('\r');//На экране пусто
        System.out.println("Новый текст.");//На экране отображается "Новый текст."
        System.out.println("kek");
        //здесь удаления строки не будет так как мы уже в println переходим на чистую строку(нечего удалять)
        System.out.println('\r');
// 'экранирование юникод символа
        System.out.println("\u00A9");

        System.out.println("\u041c\u0430\u0301\u043e " +
                "\u0426\u0437\u044d\u0434\u0443\u0301\u043d " +
                "\u0028\u043a\u0438\u0442\u002e \u0442\u0440\u0430\u0434\u002e " +
                "\u6bdb\u6fa4\u6771\u002c \u0443\u043f\u0440\u002e " +
                "\u6bdb\u6cfd\u4e1c\u002c \u043f\u0438\u043d\u044c\u0438\u043d\u044c\u003a " +
                "\u004d\u00e1\u006f \u005a\u00e9\u0064\u014d\u006e\u0067\u0029 " +
                "\u2014 \u043a\u0438\u0442\u0430\u0439\u0441\u043a\u0438\u0439 " +
                "\u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0439 " +
                "\u0438 \u043f\u043e\u043b\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 " +
                "\u0434\u0435\u044f\u0442\u0435\u043b\u044c \u0058\u0058 \u0432\u0435\u043a\u0430\u002c " +
                "\u0433\u043b\u0430\u0432\u043d\u044b\u0439 \u0442\u0435\u043e\u0440\u0435\u0442\u0438\u043a " +
                "\u043c\u0430\u043e\u0438\u0437\u043c\u0430\u002e");
      //экранировать запись 1строка: It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        //2 строка: It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"

        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\n" +
                "It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
