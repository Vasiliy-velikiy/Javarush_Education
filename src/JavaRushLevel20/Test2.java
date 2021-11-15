package JavaRushLevel20;

import java.io.*;

public class Test2 {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Apartment apartment1 = new Apartment("shishina street", 1930);
        Apartment  apartment12=new Apartment();
        File file1 = new File("C:/Users/vamoskalev/Documents/java/newfolder/file1.txt");
        File file2 = new File("C:/Users/vamoskalev/Documents/java/newfolder/file2.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);



oos.writeObject(apartment1);
        apartment1.writeExternal(oos);
        oos.close();





FileInputStream fileInputStream=new FileInputStream(file1);
//возникает ошибка StreamCorruptedException: invalid stream header: 73686973 и ругается на эут строку
ObjectInputStream oon=new ObjectInputStream(fileInputStream);


        apartment1.readExternal(oon);
           System.out.println(apartment1.toString());
           oon.close();
    }




        public static class Apartment implements Externalizable {

            private String address;
            private int year;

            /**
             * Mandatory public no-arg constructor.
             */
            public Apartment() {
                super();
            }

            public Apartment(String addr, int y) {
                address = addr;
                year = y;
            }

            /**
             * Prints out the fields used for testing!
             */
            public String toString() {
                return ("Address: " + address + "\n" + "Year: " + year);
            }

            @Override
            public void writeExternal(ObjectOutput out) throws IOException {
                out.writeObject(address);
                out.writeInt(year);
            }

            @Override
            public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
                address = in.readLine();
                year = in.readInt();
            }
        }


    }

