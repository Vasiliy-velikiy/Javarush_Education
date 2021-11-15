package JavaRush;
/*В методе handleExceptions обработайте все checked исключения.
    Нужно вывести на экран возникшее checked исключение.
    Можно использовать только один блок try..catch*/

import java.io.IOException;
import java.rmi.RemoteException;

public class TestExceptionCheked {

    public static void main(String[] args) throws Exception {

        handleExceptions(new TestExceptionCheked());


    }

    public static void handleExceptions(TestExceptionCheked obj) throws Exception {
        try {

            obj.method1();
            obj.method2();
            obj.method3();
        }
// при вызове 1го метода будет возникать ошибка-и методы2 и 3 не буду вызываться. catch же ловит это
        //исключение и завершает программу
        catch (IOException e){
            System.out.println(e.fillInStackTrace());
        }
        /*
        catch(NoSuchFieldException e){
            System.out.println(e.fillInStackTrace());
        }




         */
    }



    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
