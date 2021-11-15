package JavaRushLevel20;
/*Сериализация/десериализация Solution не работает.
Исправь ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные - writeObject
3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5*/

import java.io.*;

public class SerialazebleTest12_hard implements Serializable, AutoCloseable {
        private transient FileOutputStream stream;
        private String filename;

        public SerialazebleTest12_hard(String fileName) throws FileNotFoundException {
            this.stream = new FileOutputStream(fileName);
            this.filename=fileName;
        }
        public SerialazebleTest12_hard(){

        }

        public void writeObject(String string) throws IOException {
            stream.write(string.getBytes());//в поток пишется строка переведенная в массив байт
            stream.write("\n".getBytes());
            stream.flush();
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            //out.defaultWriteObject();
            out.writeObject(filename);//сериализуется путь к файлу
           // out.close();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            //in.defaultReadObject();
            this.filename=filename;//присваиваем переменной класса Solution значение  filename при создании объекта
            stream=new FileOutputStream(filename,true);//десериализуется новый поток на осное пути к файлу
            //in.close();
        }

        @Override
        public void close() throws Exception {
            System.out.println("Closing everything!");
            stream.close();
        }

        public static void main(String[] args) throws IOException, ClassNotFoundException {

            FileOutputStream fos=new FileOutputStream(new File("C:/Users/vamoskalev/Documents/java/newfolder/file1.txt"));
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            SerialazebleTest12_hard solution=new SerialazebleTest12_hard("C:/Users/vamoskalev/Documents/java/newfolder/file1.txt");

          oos.writeObject(solution);
          oos.close();


          FileInputStream fis=new FileInputStream(new File("C:/Users/vamoskalev/Documents/java/newfolder/file1.txt") );
        ObjectInputStream ois=new ObjectInputStream(fis);
      //Solution solution1=(Solution) ois.readObject();
            SerialazebleTest12_hard solution1=(SerialazebleTest12_hard)     ois.readObject();

        ois.close();
        }
    }


