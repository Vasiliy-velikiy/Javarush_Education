package JavaRushLevel20;

import java.io.*;
/*Два десериализованных объекта singleton и singleton1 имеют разные ссылки в памяти,
а должны иметь одинаковые.
Синглтоном (Singleton) называют класс, у которого экземпляр создаётся только
один раз. Немного больше информации про синглтон можешь найти в статье.
В класс Singleton добавь приватный метод Object readResolve(), чтобы после
 десериализации ссылки на объекты были равны. Метод main не участвует в тестировании*/
public class SerializeTestSingleton_middle  implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();//создаю синглтон через метод getInstance()-метод возвращает new Singlton т.к ранее он не был ссоздан

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance); //создается массив байтов и в его записывается

        Singleton singleton = deserializeSingletonInstance(byteArrayOutputStream);    //создаем singleton-и ему присваиваем ссылку считываемого экземпляра из массива байтов byteArrayOutputStream
        Singleton singleton1 = deserializeSingletonInstance(byteArrayOutputStream);   //создаем singleton1-и ему присваиваем ссылку считываемого экземпляра из массива байтов byteArrayOutputStream

        System.out.println("Проверка ourInstance : " + singleton.getInstance());
        System.out.println("Проверка ourInstance : " + singleton1.getInstance());
        System.out.println("=========================================================");
        System.out.println("Проверка singleton : " + singleton);
        System.out.println("Проверка singleton1 : " + singleton1);
    }

    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//cоздается массив байтов

        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);//создается объект записи на основе массива байтов-Класс ByteArrayOutputStream представляет
                                                                              // поток вывода, использующий массив байтов в качестве места вывода.
        oos.writeObject(instance);   //здесь вызывается метод   oos.writeObject(instance.readResolve())     //записываем в массив байтов экземляр instance класса Singleton
        oos.close();                                                          //закрываем поток

        return byteArrayOutputStream;                                        //вовзращаем записанный массив с экземпляром
    }

    public static Singleton deserializeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();

        return singleton;
    }

    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }

        private Singleton() {
        }

       private Object readResolve(){//метод отвечает за выгрузку, он вызвается когда  ObjectInputStream cчитал из файла данные и готов к загрузке в программу
            if (ourInstance==null)//если у нас  не создан экземпляр ourInstance-то мы его создаем через getInstance
                ourInstance=getInstance();//в противном случае просто возвращаем уже созданный объект

            return ourInstance;

            /*
            Метод readResolve вызывается, когда ObjectInputStream читает объект из потока и готовится
            вернуть его вызывающему. ObjectInputStream проверяет, определяет ли класс объекта метод readResolve.
             Если метод определен, вызывается метод readResolve, чтобы позволить объекту в потоке назначать
             возвращаемый объект. Возвращаемый объект должен быть типа, совместимого со всеми видами использования.
              Если он несовместим, при обнаружении несоответствия типов будет выбрано ClassCastException.
             */
       }
    }
}