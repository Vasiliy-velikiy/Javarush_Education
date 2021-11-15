package JavaRushLevel20;

import java.io.*;
import java.util.List;
/*Класс Person должен сериализовываться с помощью интерфейса Externalizable.
Исправь ошибку сериализации.
Сигнатуры методов менять нельзя.*/
public class ExternalizableTest3 {
    public static class Person implements Externalizable {
    private String firstName;
    private String lastName;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> children;


    public Person(){
/*
Пустой конструктор необходим для восстановления объекта. Всякий раз когда вы определяете хотя бы
один конструктор с параметрами (т.е. по дефолту не создается пустой конструктор.

Это позволяет восстанавливать сериализованный объект из потока, т.е. начать не дожидаясь
 получения всего объекта. Сериализованный объект начинается с описания класса. Читается описание и создается пустой объект. Для этого класс и должен иметь пустой конструктор. Потом идут параметры, если есть. Они последовательно читаются и вставляются в созданный объект (через сеттеры, ведь наверное речь идет о javabean).

Вторая причина - при сериализации пустые параметры (параметр = null) просто не пишутся в поток, т.е.
 минимизируется размер сериализованного обьекта
 */
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+age+" "+mother;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(firstName);
        out.writeObject(lastName);
        out.writeObject(father);
        out.writeObject(mother);
        out.writeObject(age);
        out.writeObject(children);

    }
    //порядок записи и чтения должен быть одинаковым
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName =(String) in.readObject();
        lastName =(String) in.readObject();
        father = (Person) in.readObject();
        mother = (Person) in.readObject();
        age =(int) in.readObject();
        children = (List<Person>) in.readObject();
    }
}

    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*
        File file1 = new File("C:/Users/vamoskalev/Documents/java/newfolder/file1.txt");
        Person person=new Person("vasia", "pupkin",21);
        person.mother=new Person("mama", "familia", 46);


        FileOutputStream fos=new FileOutputStream(file1);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
        person.writeExternal(oos);
        oos.close();


FileInputStream fis=new FileInputStream(file1);
ObjectInputStream oon=new ObjectInputStream(fis);

        Person person1=new Person();
        person1.readExternal(oon);
        System.out.println(person1.toString());



        oon.close();





 */
    }
}











