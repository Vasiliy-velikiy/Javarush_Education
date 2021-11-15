package Stream;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;

/*Сериализуй класс Person стандартным способом. При необходимости добавь некоторым полям модификатор transient.*/
public class SerialazebleTest7 {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        String fullName;//здесь же transien требуется по условию задачи
       transient final  String greeting;//эта константа, она будет автоматически инициализирована в конструьоре при десериализации. поэтому зачем ее
                                       //сериализировать если она константа
        String country;
        Sex sex;
       transient PrintStream outputStream; //нельзя сериализовать потоки
       transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}
