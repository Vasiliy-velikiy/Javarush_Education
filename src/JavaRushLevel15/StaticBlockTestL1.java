import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*В этой задаче тебе нужно:
Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
В статическом методе reset() класса Solution:
считать с консоли параметр типа String;
если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
если параметр равен "plane", считать второй параметр типа int (количество пассажиров),
статическому объекту CanFly result присвоить объект класса Plane.
В статическом блоке инициализировать CanFly result, вызвав метод reset().
Закрыть поток ввода методом close().*/
public class StaticBlockTestL1 {

    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in));
        String parametr= bf.readLine();
        if (parametr.equals("helicopter")){
            result=new Helicopter();
        }
        if(parametr.equals("plane")){
            int passanger=Integer.parseInt(bf.readLine());
            result=new Plane(passanger);

        }
        bf.close();
        //add your code here - добавьте код тут
    }
}
class Plane implements  CanFly{
    int passanger;
    Plane(int passanger){
        this.passanger=passanger;

    }
    @Override
    public void fly() {

    }
}
class Helicopter implements CanFly{
    @Override
    public void fly() {

    }
}
interface  CanFly{
    void fly();
}