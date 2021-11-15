package Stream;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*Сериализуй класс Solution.
Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
2) создать экземпляр класса Solution - savedObject;
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
4) создать другой экземпляр класса Solution с другим параметром;
5) загрузить из потока на чтение объект - loadedObject;
6) проверить, что savedObject.string равна loadedObject.string;
7) обработать исключения.*/
public class SerialazebleTest6 implements Serializable  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // System.out.println(new Solution(4));

        //File file1=new File("C:/Users/Василий/Documents/тестовые_документы/1.txt");
        File file2=new File("C:/Users/Василий/Documents/тестовые_документы/2.txt");

        FileInputStream fis=new FileInputStream(file2);
        ObjectInputStream ois=new ObjectInputStream(fis);

        FileOutputStream fos=new FileOutputStream(file2);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        SerialazebleTest6 savedobject=new SerialazebleTest6(34);
       //Solution loadobject=new Solution();

        oos.writeObject(savedobject);  //записываю в файл объект стемпературой 34

        SerialazebleTest6 loadobject= (SerialazebleTest6)ois.readObject();//считываю тот же самый объект и сужаю до нужного класса

        System.out.println(savedobject);
        System.out.println(loadobject.toString());
        System.out.println(savedobject.string.equals(loadobject.string));
        oos.close();
        ois.close();
    }


    private final transient String pattern = "dd MMMM yyyy, EEEE";//  его состояние не будет ни сохраняться, ни восстанавливаться
    private transient Date currentDate;//эти данные не имеют значения тк например текущая дата будет создаваться конструктором на момент сохдания объекта
    private transient int temperature;//тут тоже самое- у нас может быть коснтруктор бех температура
    String string;//а эта строка нужна тк она будет выводить состояние объекта

    public SerialazebleTest6(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }
    public SerialazebleTest6() {
    }


    @Override
    public String toString() {
        return this.string;
    }
}
