package JavaRush;

import java.io.IOException;

import java.rmi.RemoteException;

/*Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и
любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
*/
public class TestExceptionCreate {
    public static void main(String[] args) {

    }
    public static void method1() throws Exception {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new IOException();
        } else if (i == 1) {
            throw new RemoteException();

        } else if (i == 2) {
            throw new NullPointerException();

        } else if (i == 3) {
            throw new IndexOutOfBoundsException();
        }
    }

     class MyException extends IOException {
    }

    class MyException2 extends RemoteException {
    }


     class MyException3 extends NullPointerException {
    }

     class MyException4 extends  IndexOutOfBoundsException{
    }

}
