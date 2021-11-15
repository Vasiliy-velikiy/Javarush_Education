package JavaRushLevel20;

import java.io.*;

/*Сделайте (переопределите метод readObject) так, чтобы после инициализации объекта типа
Solution посредством десериализации нить runner запускалась автоматически.
Ключевые слова объекта runner менять нельзя.

Подсказка: конструктор не вызывается при десериализации, только инициализируются все поля.*/
public class SerializeTest5 implements Serializable,Runnable {
    private transient Thread runner;
    private int speed;

    public SerializeTest5(int speed) {//при десериализации конструктор не вызвается, только инициализируются все поля
        this.speed = speed;
        runner = new Thread(this);//без интерфейса Runnable-не пропишется new Thread(this)
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
  in.defaultReadObject();//метод readObject()-читает объект.
        runner =new Thread(this);
        runner.start();
        /*откуда возникает объект this?
this не объект, а  ссылка на текущий экземпляр класса, для которого вызывается метод.
Ведь когда мы вызываем дефолтную десериализацию, мы создаем ссылку на восстановленный объект:
создается объект методом ObjectInputStream.ReadObject(), после чего вызывается метод readObject()
 созданного экземпляра, где уже и происходит вызов defaultReadObject.*/
    }

    public static void main(String[] args) {

    }
}
