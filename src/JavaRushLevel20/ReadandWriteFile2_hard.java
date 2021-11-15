package JavaRushLevel20;

import JavaRushLevel15.CorrectMistakes5_Debag;

import java.io.*;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*Реализуй логику записи в файл и чтения из файла для класса JavaRush.
Пустых полей у объекта User быть не может. Дату в файле удобно хранить в формате long.
Метод main реализован только для тебя и не участвует в тестировании.*/
public class ReadandWriteFile2_hard {

    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
           // File yourFile = File.createTempFile("your_file_name", null);
            File yourFile = File.createTempFile("your_file_name", ".txt",new File("C:/Users/vamoskalev/Documents/java/newfolder"));
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);


            JavaRush javaRush = new JavaRush();


            javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Vania");
            javaRush.users.get(0).setLastName("Ivanov");
            javaRush.users.get(0).setBirthDate(new Date(100, 11, 2));
            javaRush.users.get(0).setMale(true);
            javaRush.users.get(0).setCountry(User.Country.UKRAINE);





            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer=new PrintWriter(outputStream);
            if (users.size()>0){
                for (User user:users){
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate().getTime());
                    writer.println(user.isMale());
                    writer.println(user.getCountry().getDisplayName());// благодоря методу getDisplayName()-город пишется маленькими буквами

                }
            }
            writer.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));

            while (reader.ready()){
                User user=new User();

                String fn=reader.readLine();//имя
                String ln=reader.readLine();//фамилия
                long bd= Long.parseLong(reader.readLine());//день рождения
                boolean p= Boolean.parseBoolean(reader.readLine());//пол
                String c=reader.readLine();//город

                user.setFirstName(fn);
                user.setLastName(ln);
                user.setBirthDate(new Date(bd));
                user.setMale(p);

                if (c.equals("Ukraine")){//тк в файл город пишется маленькими буквами
                    user.setCountry(User.Country.UKRAINE);
                }
                if(c.equals("Russia")){
                    user.setCountry(User.Country.RUSSIA);
                }
                if(c.equals("Other")){
                    user.setCountry(User.Country.OTHER);
                }

                users.add(user);


            }
            reader.close();
            //implement this method - реализуйте этот метод
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}


class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private boolean isMale;
    private Country country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public static enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        OTHER("Other");

        private String name;

        private Country(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return this.name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isMale != user.isMale) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(user.birthDate) : user.birthDate != null) return false;
        return country == user.country;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (isMale ? 1 : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}