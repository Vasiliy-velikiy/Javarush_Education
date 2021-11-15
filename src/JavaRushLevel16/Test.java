package JavaRushLevel16;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Clock clock=new Clock();
        Thread thread=new Thread(clock);
        thread.start();
        Thread.sleep(10000);//создается ожидание 10секунд, как только прохоидт 10 секунд вызывается метод
        // прекращения вывода
        clock.cansel();

    }
}


class Clock implements Runnable  {
    private  boolean iscansel=false;

    public void cansel(){
        this.iscansel=true;
    }

    @Override
    public void run() {
        while (!iscansel) {
            try {
                Thread.sleep(1000);//задержка для вывода текста(раз в  секунду выводиться надпись)
                System.out.println("tik");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
