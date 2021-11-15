package Stream;

import java.io.*;

/*Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найди проблему и исправь ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
В сигнатуре класса В ошибки нет :).
В методе main ошибок нет.*/
public class SerialazebleTest10_hard implements Serializable{//потому что внутренние классы не могут сущестовать без внешнего отдельно,
                                              // а т.к. для сериализации нужно чтобы все эелементы реализовывали интрефейс Serialazable

    public static class A {  //класс А не поддерживает сериализацию, это  значит что при сериализации класса В все унаследованные
                            // его поля сериализованы не будут, но т.к поле name обьявлено как protected -мы в read/writeObject можем насильно дописать сериализацию поля nameA

     protected String nameA = "A";
        public A(String nameA) {
            this.nameA += nameA;
        }
        public A(){//Добавляем конструтор бкз параметров
/* при восстановлении сначала будет создан объект с помощью конструктора в точке объявления,
 а затем в него будут записаны значения его полей из байтов, полученных при сериализации. */
        }

    }

    public class B extends A implements Serializable {

      private   String nameB;

        public B(String nameA) {
            super(nameA);
        }


        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }



        private void writeObject(ObjectOutputStream stream) throws IOException {//благодоря этим методам можем сериализовать вручную(эти методы в Serialazable вызываются неявно
           stream.defaultWriteObject();//сериализация всех дефолтных значений
            stream.writeObject(this.nameA);//ручная сериализация нужного поля т.к по условию задачи класс А не должен реализовывать никакие интерфейсы
        /*можно было бы все вруяную сериализовать/десериализовать но тогда валидор не принял бы решение
        stream.writeObject(this.nameA);
        stream.writeObject(this.nameB);
        nameA= (String)stream.readObject();
        nameB= (String)stream.readObject();


         */


        }
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
         stream.defaultReadObject();
          nameA= (String)stream.readObject();
        }






    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        SerialazebleTest10_hard solution = new SerialazebleTest10_hard();
        B b = solution.new B("B2", "C33");
                                            /*B - это внутренний класс, принадлежащий контексту класса Solution.
                                            Это означает, что объект типа B не может быть создан сам по себе; перед этим должен быть создан объект объемлющего типа,
                                           т. е. объект Solution.
                                              Синтаксис   B b = solution.new B("B2", "C33");
                                            означает, что доступ к конструктору класса B осуществляется через объект объемлющего типа Solution
                                             */
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
