package Stream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*После десериализации объекта класса Solution обнаружили, что данных в словаре [m] нет :(

Исправить 1 ошибку*/
public class ChangeMistakes implements Serializable {

    public static void main(String args[]) throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("your.file.name");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        ChangeMistakes solution = new ChangeMistakes();
        outputStream.writeObject(solution);

        fileOutput.close();
        outputStream.close();

        //load
        FileInputStream fiStream = new FileInputStream("your.file.name");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        ChangeMistakes loadedObject = (ChangeMistakes) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public ChangeMistakes() { //здесь после public было слово void-и это был уже метод , а стал конструктор без параметров. Поэтому данные и не записывались потому что метод не вызывался
        getMap().put("Mickey", "Mouse");
        getMap().put("Mickey", "Mantle");
    }

    public int size() {
        return getMap().size();
    }
}