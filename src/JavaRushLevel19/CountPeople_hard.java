package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013 */
public class CountPeople_hard {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

       // String filename="C:/Users/Василий/Documents/тестовые_документы/1.txt";
        //BufferedReader reader=new BufferedReader(new FileReader(filename));
       BufferedReader reader=new BufferedReader(new FileReader(args[0]));

            while (reader.ready()){
                String s=reader.readLine();

                String[]strings=s.split(" ");
                String namepeople="";
                String daybd="";
                String month="";
                String year="";
                for (int i = 0; i <strings.length ; i++) {
                    if(strings[i].matches(".*\\d+.*") == true){
                        daybd=strings[i];
                         month=strings[i+1];
                         year=strings[i+2];
                        break;
                    }
                    else {namepeople+=strings[i]+" ";

                    }
                }

                SimpleDateFormat date = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
                String s1 = daybd + " " + month + " " + year;
                Date date1 = date.parse(s1);
               namepeople= namepeople.trim();//обрезаю лишний пробел в конце если этого не сделать, валидатор не примет
               System.out.println(namepeople);
               System.out.println(namepeople+" "+date1);

                PEOPLE.add(new Person(namepeople, date1));
                namepeople="";
                date1=null;
            }

        reader.close();



    }
}
        class Person {
            private String name;
            private Date birthDate;

            public Person(String name, Date birthDate) {
                this.name = name;
                this.birthDate = birthDate;
            }

            public String getName() {
                return name;
            }

            public Date getBirthDate() {
                return birthDate;
            }
        }




         /*
        String s = "Иванов Иван Иванович 31 12 1987";

        String[] strings = s.split(" ");
        String namepeople = "";
        String daybd = null;
        String month = null;
        String year = null;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].matches(".*\\d+.*") == true) {
                daybd = strings[i];
                month = strings[i + 1];
                year = strings[i + 2];
                break;

            } else namepeople += strings[i] + " ";
        }


        SimpleDateFormat date = new SimpleDateFormat("dd MM yyyy");
        String s1 = daybd + " " + month + " " + year;
        Date date1 = date.parse(s1);
        //System.out.println(date1);
        //System.out.println(namepeople);
       // System.out.println(daybd);

        Person person1 = new Person(namepeople, date1);
        PEOPLE.add(person1);
        System.out.println(PEOPLE.toString());

         */