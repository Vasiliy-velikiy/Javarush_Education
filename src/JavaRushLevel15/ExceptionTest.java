import java.util.concurrent.Callable;

/*В статическом блоке выбрось Exception.
Нужно, чтобы класс не загрузился, и вместо значения переменной B появилось сообщение об ошибке:
Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement*/
public class ExceptionTest {
    public static int A = 0;
 //ответ прос- нужно чтобы задача выполнила любую ошибку,неважно какую и ее НЕНАДО ОТЛАВЛИВАТЬ, текст ошибки зависит от
 // того в каком пакете находится класс
    static {

        System.out.println(10/A);



        }
        //throw an exception here - выбросьте эксепшн тут

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }

}
