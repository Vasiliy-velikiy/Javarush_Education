package JavaRush;
/*В методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch*/
public class TestExceptionUncheked {
    public static void main(String[] args) throws Exception {


    handleExceptions(new TestExceptionUncheked());
}

    public static void handleExceptions(TestExceptionUncheked obj) throws Exception  {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        //будет отловлен только 1ое исключение потому что после 1го метода методы2 и 3 не будут выполняться
        catch(NullPointerException|IndexOutOfBoundsException e){
            printStack(e);

        }
        catch (NumberFormatException e){
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }

}
