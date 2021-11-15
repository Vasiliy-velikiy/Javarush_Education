package JavaRushLevel18;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*CrUD Batch - multiple Creation, Updates, Deletion.

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u - обновляет соответствующие данные людей с заданными id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке.
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople.
Порядок вывода данных соответствует вводу данных.
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997
-i id1 id2 id3 id4 ...
args[0] -i
args[1] id1
args[2] id2
args[3] id3
args[4] id4

*/
public class Crud_hard {


    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {



        //1 решение через swich

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);// формат вида 15/04/1990
        SimpleDateFormat vivoddate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);//формат вида 15-Apr-1990
        Person person;
        switch (args[0]) {
            //1условие -c name1 sex1 bd1 name2 sex2 bd2 ...
            case "-c":
                synchronized (allPeople) {
                    for (int name = 1, sex = 2, bd = 3; name < args.length; name = name + 3, bd = bd + 3, sex =sex +3) {//индексы, соответсвующие позиции вводимых args[n] 1го условия

                        if (args[sex].equals("м")) {
                            person= Person.createMale(args[name], simpleDateFormat.parse(args[bd]));

                        } else
                            person= Person.createFemale(args[name], simpleDateFormat.parse(args[bd]));

                        allPeople.add(person);//здесь не надо указывать индекс allPeople.size()-1-добавление и так идет в конец списка
                        System.out.println(allPeople.size()-1);

                    }
                }
                break;

            //2условие -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
            case"-u":
                synchronized (allPeople) {
                    for (int name = 2, sex = 3, bd = 4, id = 1; name < args.length; name = name + 4, bd = bd + 4, sex =sex +4, id = id + 4) {//индексы 2го условия
                        if (args[sex].equals("м")) {
                            allPeople.set(Integer.parseInt(args[id]), Person.createMale(args[name], simpleDateFormat.parse(args[bd])));
                        } else if (args[sex].equals("ж")) {
                            allPeople.set(Integer.parseInt(args[id]), Person.createFemale(args[name], simpleDateFormat.parse(args[bd])));
                        }

                    }
                }
                break;




            //3условие -d id1 id2 id3 id4 ...
            case"-d":
                synchronized (allPeople) {
                    for (int id = 1; id < args.length; id++) {
                        allPeople.get(Integer.parseInt(args[id])).setName(null);
                        allPeople.get(Integer.parseInt(args[id])).setSex(null);
                        allPeople.get(Integer.parseInt(args[id])).setBirthDate(null);

                    }
                }
                break;



            //4 условие  -i id1 id2 id3 id4 ...

            case"-i":
                synchronized (allPeople) {
                    for (int id = 1; id < args.length; id++) {

                        String date = vivoddate.format(allPeople.get(Integer.parseInt(args[id])).getBirthDate());
                        if (allPeople.get(Integer.parseInt(args[id])).getSex().equals(Sex.MALE)) {
                            System.out.println(allPeople.get(Integer.parseInt(args[id])).getName() + " " + "м" + " " + date);
                        } else if (allPeople.get(Integer.parseInt(args[id])).getSex().equals(Sex.FEMALE)) {
                            System.out.println(allPeople.get(Integer.parseInt(args[id])).getName() + " " + "ж" + " " + date);
                        }


                    }
                }
                break;


        }


      //2 решение через if
      /*


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);// формат вида 15/04/1990
        SimpleDateFormat vivoddate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);//формат вида 15-Apr-1990


        //1условие -c name1 sex1 bd1 name2 sex2 bd2 ...
        if (args[0].equals("-c")) {
            for (int name = 1,sex=2,bd=3;name <args.length; name=name+3,bd=bd+3,sex=sex+3) {//индексы, соответсвующие позиции вводимых args[n] 1го условия

                if (args[sex].equals("м")) {
                    allPeople.add( Person.createMale(args[name], simpleDateFormat.parse(args[bd])));
                    System.out.println(allPeople.size()-1);
                } else if (args[sex].equals("ж")) {
                    allPeople.add( Person.createFemale(args[name], simpleDateFormat.parse(args[bd])));
                    System.out.println(allPeople.size()-1);
                }

            }
        }



        //2условие -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
        if (args[0].equals("-u")) {

            for (int name = 2,sex=3,bd=4,id=1;name <args.length; name=name+4,bd=bd+4,sex=sex+4,id=id+4){//индексы 2го условия
                if (args[sex].equals("м")) {
                    allPeople.set(Integer.parseInt(args[id]), Person.createMale(args[name], simpleDateFormat.parse(args[bd])));
                } else if (args[sex].equals("ж")) {
                    allPeople.set(Integer.parseInt(args[id]), Person.createFemale(args[name], simpleDateFormat.parse(args[bd])));
                }

            }

        }


        //3условие -d id1 id2 id3 id4 ...
        if (args[0].equals("-d")){
            for (int id=1;id<args.length; id++){
                allPeople.get(Integer.parseInt(args[id])).setName(null);
                allPeople.get(Integer.parseInt(args[id])).setSex(null);
                allPeople.get(Integer.parseInt(args[id])).setBirthDate(null);

            }

        }

        //4 условие  -i id1 id2 id3 id4 ...

        if (args[0].equals("-i")){
            for (int id=1;id<args.length; id++){

                String date=simpleDateFormat.format(allPeople.get(Integer.parseInt(args[id])).getBirthDate());
                if(allPeople.get(Integer.parseInt(args[id])).getSex().equals(Sex.MALE)){
                    System.out.println(allPeople.get(Integer.parseInt(args[id])).getName()+" "+"м"+" "+date);
                }
                else if (allPeople.get(Integer.parseInt(args[id])).getSex().equals(Sex.FEMALE)){
                    System.out.println(allPeople.get(Integer.parseInt(args[id])).getName()+" "+"ж"+" "+date);
                }


            }





        //start here - начни тут





 */



        //start here - начни тут
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