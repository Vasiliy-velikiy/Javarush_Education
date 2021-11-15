package JavaRushLevel22;
/*
1. Метод getPartOfString должен возвращать подстроку между первой и последней табуляцией.
2. На некорректные данные getPartOfString должен бросить исключение:
а) StringForFirstThreadTooShortException, если имя трэда FIRST_THREAD_NAME.
б) StringForSecondThreadTooShortException, если имя трэда SECOND_THREAD_NAME.
в) RuntimeException в других случаях.
3. Реализуй логику трех protected методов в OurUncaughtExceptionHandler используя вызовы соответствующих методов согласно
следующим шаблонам:
a) 1# : StringForFirstThreadTooShortException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
б) java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#
в) RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3# */
public class StringTest_hard {
    public static void main(String[] args) {
        new StringTest_hard();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public StringTest_hard() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    public synchronized String getPartOfString(String string, String threadName) {
        //1
        try {


            int firsttab = string.indexOf('\t');
            int lasttab = string.lastIndexOf("\t");
            return string.substring(firsttab + 1, lasttab);
        }
        //2
        catch (Exception e){
            if (threadName.equals(FIRST_THREAD_NAME)) throw new StringForFirstThreadTooShortException();
            else if (threadName.equals(SECOND_THREAD_NAME)) throw new StringForSecondThreadTooShortException();
            else throw new RuntimeException(e);
        }


    }
}

 class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (StringTest_hard.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else if (StringTest_hard.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    /*public Throwable getCause()
Возвращает причину этого throwable или null если причина является несуществующей или неизвестной. (Причиной является throwable, который заставил этот throwable быть брошенным.)
Эта реализация возвращает причину, которая была предоставлена через одного из конструкторов, требующих a Throwable, или это было установлено после создания с initCause(Throwable) метод. В то время как является обычно ненужным переопределить этот метод, подкласс может переопределить это, чтобы возвратить причину, установленную некоторыми другими средствами. Это является подходящим для "наследства объединенный в цепочку throwable", который предшествует добавлению цепочечных исключений к Throwable. Отметьте, что не необходимо переопределить любой из PrintStackTrace методы, все из которых вызывают getCause метод, чтобы определить причину throwable.

Возвраты:
причина этого throwable или null если причина является несуществующей или неизвестной.*/


//RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#
    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        //return "RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#";
    return String.format(string,e.getClass().getSimpleName(),e.getCause(),t.getName());
    }

//java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#
    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {

       // return "java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#";
    return String.format(string,e.getCause(),e.getClass().getSimpleName(),t.getName());
    }

//1# : StringForFirstThreadTooShortException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {

        return String.format(string,t.getName(),e.getClass().getSimpleName(),e.getCause());
    }
}




class StringForSecondThreadTooShortException extends RuntimeException {

}

 class StringForFirstThreadTooShortException extends RuntimeException {

}





class Task implements Runnable {
    private String initialString;
    private StringTest_hard solution;

    public Task(StringTest_hard solution, String initialString) {
        this.solution = solution;
        this.initialString = initialString;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        String str = this.initialString;
        do {
            System.out.println(name + str);
        } while ((str = solution.getPartOfString(str, name)) != null || !str.isEmpty());
    }
}