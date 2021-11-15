package JavaRush;
import java.util.concurrent.*;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.RunnableFuture;

/*1. Почитать в инете про Socket, ThreadPoolExecutor, RunnableFuture, Callable.
2. Реализуй логику метода cancel в классе SocketTask.
3. Реализуй логику метода cancel для локального класса внутри метода newTask в классе SocketTask.*/
public class SoketsTest_hard extends ThreadPoolExecutor {
    public SoketsTest_hard(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        if (callable instanceof CancellableTask) {
            return ((CancellableTask<T>) callable).newTask();
        } else {
            return super.newTaskFor(callable);
        }
    }

    public static void main(String[] args) {
    }
}


 interface CancellableTask<T> extends Callable<T> {
    void cancel() throws IOException;

    RunnableFuture<T> newTask();
}




 abstract class SocketTask<T> implements CancellableTask<T> {
    private Socket socket;  //r

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        try {
            socket.close();
           // socket.getInputStream().close();
           // socket.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //close all resources here
    }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {
                try {
                    if(mayInterruptIfRunning==true) {
                        SocketTask.this.cancel();// вызваем переменную класса в локальном классе и вызывается cancel() класса SocketTask

                    }

                } finally {
                    super.cancel(true);//вызывается метод родителя, т. метод FutureTask-так как наш анонимный класс без имени  наследуется  от него
                }

                //close all resources here by using proper SocketTask method
                //call super-class method in finally block
                return false;
            }
        };
    }
}