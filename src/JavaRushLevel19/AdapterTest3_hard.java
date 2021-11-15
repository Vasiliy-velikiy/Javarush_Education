package JavaRushLevel19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner.
Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
 Метод read() должен читать данные только одного человека.*/
public class AdapterTest3_hard {


    public static void main(String[] args) {

    }




    public static class PersonScannerAdapter  implements PersonScanner {
     private    Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner=fileScanner;
        }

        @Override
        public Person read() throws IOException {
/*здесь мы работаем не с текущем объектом PersonScanerAdapter, а лишь создаем его для использования

//1 вариант
            //все данные делим между собой пробелами и помещаем в массив
            String[] strings=fileScanner.nextLine().split(" ");
            Date date=new GregorianCalendar(Integer.parseInt(strings[3]),Integer.parseInt(strings[4]),//слздаем объект даты где 1 парметр день 2-месяц и 3 год
                    Integer.parseInt(strings[5])).getGregorianChange();

        return new Person(strings[0],strings[1],strings[2],date);//создаем объект на основе параметров


 */
            //2вариант
            String[] strings = fileScanner.nextLine().split(" ");
            Date date=null;
            try {
                 date = new SimpleDateFormat("dd MM yyyy").parse(strings[3] + " " + strings[4] + " " + strings[5]);
            }catch (Exception e){

            }

            return new Person(strings[1],strings[2],strings[0],date);
        }

        @Override
        public void close() throws IOException {
        this.fileScanner.close();
        }
    }
}
interface PersonScanner {
    Person read() throws IOException, ParseException;

    void close() throws IOException;
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}