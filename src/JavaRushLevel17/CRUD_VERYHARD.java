package JavaRushLevel17;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-i id
-u id name sex bd
-d id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:-c Миронов м 15/04/1990

Пример вывода для параметра -і: Миронов м 15-Apr-1990

Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main -
String[] args).
Например, при запуске программы c параметрами:
-c name sex bd
получим в методе main
args[0] = "-c"
args[1] = "name"
args[2] = "sex"
args[3] = "bd"
//я их прописал в параметре конфигурации так : -c name sex bd
Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments в
меню Run -> Edit Configurations.
* */
public class CRUD_VERYHARD {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args)  throws ParseException {

//1 параметр -c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        if (args[0].equals("-c")){
            if(args[2].equals("м")){

            allPeople.add(Person.createMale(args[1],new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[3])));  //args[3]-день рождения в списке параметров

        } else if(args[2].equals("ж")) {
            allPeople.add(Person.createFemale(args[1],new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[3])));  //args[3]-день рождения в списке параметров

        }
            System.out.println(allPeople.size()-1);
        }



        //2 условие -i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

        if(args[0].equals("-i")) {
            DateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date=dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
                if(allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)){
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" "+"м"+" "+date);
                }
                else if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.FEMALE)){
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" "+"ж"+" "+date);
                }
        }


        /*
        if(args[0].equals("-i")&&args[3].equals("м")) {
            DateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date=dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" "+"м"+" "+date);
        }
        if(args[0].equals("-i")&&args[3].equals("ж")) {
            DateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date=dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" "+"ж"+" "+date);
        }

         */

//3 условие -u - обновляет данные человека с данным id
        //args[1]-почему показывает id ?
        //args[2]-почему показывает name  ?
        if (args[0].equals("-u")&&args[3].equals("м")){
            allPeople.set(Integer.parseInt(args[1]),Person.createMale(args[2],new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])));

        }
        if (args[0].equals("-u")&&args[3].equals("ж")){
            allPeople.set(Integer.parseInt(args[1]),Person.createFemale(args[2],new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])));

        }

        //4 условие  -d - производит логическое удаление человека с id,-тоесть заменяет все его данные на null
        if(args[0].equals("-d")){
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);

        }


    }
}


enum Sex {
        MALE,
        FEMALE
    }


class Person {
        private String name;
        private Sex sex;
        private Date birthDate;

        private Person(String name, Sex sex, Date birthDate) {
            this.name = name;
            this.sex = sex;
            this.birthDate = birthDate;
        }

        public static Person createMale(String name, Date birthDate) {
            return new Person(name, Sex.MALE, birthDate);
        }

        public static Person createFemale(String name, Date birthDate) {
            return new Person(name, Sex.FEMALE, birthDate);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Sex getSex() {
            return sex;
        }

        public void setSex(Sex sex) {
            this.sex = sex;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }
    }
