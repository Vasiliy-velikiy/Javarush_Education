package JavaRushLevel21;
/*В классе FakeConnection реализуй интерфейс AutoCloseable,
чтобы объекты этого типа можно было использовать в try-with-resources.
Метод close() должен выводить на экран фразу "Closing database connection..."
В блоке try последовательно вызови методы usefulOperation() и unsupportedOperation().

Вывод на экран должен быть следующим:
Establishing database connection...
Entering body of try block.
Executing useful operation.
Operation is not supported yet!
Closing database connection...

Обрати внимание на то, что ресурсы были освобождены автоматически несмотря на исключение брошенное методом unsupportedOperation.*/
/*исходный вариант
* public class FakeConnection {

    public FakeConnection() {
        System.out.println("Establishing database connection...");
    }

    public void unsupportedOperation() {
        System.out.println("Operation is not supported yet!");
        throw new RuntimeException("UnsupportedOperation!");
    }

    public void usefulOperation() {
        System.out.println("Executing useful operation.");
    }
}
*
*
* public class Solution {
    public static void main(String[] args) {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
            System.out.println("Entering body of try block.");
        } catch (Exception e) {
        }
    }
}
*
* public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}*/


public class AutoclosableTest {
    public static void main(String[] args) {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
            System.out.println("Entering body of try block.");

            fakeConnection.usefulOperation();
            fakeConnection.unsupportedOperation();//здесь выбросится исключение- затем закроется поток и лишь потом передастся
            //управление в блок catch

        } catch (Exception e) {
        }
    }
}



class FakeConnection  implements  AutoCloseable{

    public FakeConnection() {
        System.out.println("Establishing database connection...");//создание соединения к базе данных
    }

    public void unsupportedOperation() {
        System.out.println("Operation is not supported yet!");//операция пока не поддерживается
        throw new RuntimeException("UnsupportedOperation!");//неподдерживаемая операция
    }

    public void usefulOperation() {
        System.out.println("Executing useful operation.");//выполнение полезной операции
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing database connection...");//закрытие подключения к базе данных
    }
}


class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}