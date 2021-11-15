package JavaRushLevel16;
/*Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().*/
public class MThread_interruptTest {
    public static void main(String[] args) throws InterruptedException {
       TestThread testThread=new TestThread();

       testThread.start();
      testThread.interrupt();

       //Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        @Override
        public void run() {

        }
    }
}
