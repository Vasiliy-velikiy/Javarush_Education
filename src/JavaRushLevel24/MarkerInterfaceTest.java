package JavaRushLevel24;

import java.lang.reflect.Method;

/*1. Создай интерфейс-маркер SelfInterfaceMarker.
2. Создай класс SelfInterfaceMarkerImpl, который реализует SelfInterfaceMarker.
3. Добавь в SelfInterfaceMarkerImpl минимум 2 любых public метода.
4. Создай исключение UnsupportedInterfaceMarkerException, унаследуй его от класса Exception.
5. В методе testClass класса Util: если параметр == null, то выбросьте UnsupportedInterfaceMarkerException.*/
public class MarkerInterfaceTest {

    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl();
        Util1.testClass(obj);
    }
}
class Util1 {
    // Пример того, как можно использовать интерфейс-маркер
    // Этот метод подходит только для классов, реализующих SelfInterfaceMarker
    public static void testClass(SelfInterfaceMarker interfaceMarker) throws UnsupportedInterfaceMarkerException {
        if(interfaceMarker==null) throw new UnsupportedInterfaceMarkerException();
        for (Method method : interfaceMarker.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }

    }
}
interface SelfInterfaceMarker  {

}
class SelfInterfaceMarkerImpl implements SelfInterfaceMarker{
    public void  method1(){

    }
    public  void  method2(){

    }
}
class UnsupportedInterfaceMarkerException extends Exception{

}