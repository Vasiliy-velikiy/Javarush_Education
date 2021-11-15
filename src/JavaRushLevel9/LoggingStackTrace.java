package JavaRushLevel9;
/*Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log),
а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution: main: In main method*/
public class LoggingStackTrace {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        //нужно  взять имя класса и метода из которого вызван сам этот метод(массив-там сидят все стеки в этом потоке,а нам нужен тот,который все вызывает(т.е источник)

            System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()+": "+Thread.currentThread().getStackTrace()[2].getMethodName()+": "+text);

        for(StackTraceElement s:stackTraceElements){
            System.out.println(s.getClassName()+": "+s.getMethodName()+": "+text);

        }
    }
        //напишите тут ваш код
    }

