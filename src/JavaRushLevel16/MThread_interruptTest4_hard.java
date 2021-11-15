package JavaRushLevel16;
/*1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для numSeconds=4 :
"4 3 2 1 Прервано!"

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для numSeconds=3 :
"3 2 1 Марш!"

PS: метод sleep выбрасывает InterruptedException*/
public class MThread_interruptTest4_hard {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        int a=numSeconds;
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();//boolean-флаг  interrupt меняет значение в строке 34 isInterrupted() на true блогодоря чему цикл
        // останавливается и тем самым останавливается метод run
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (!isInterrupted()) {
                    int a=numSeconds;
                    Thread.sleep(1000);
                    System.out.print(numSeconds+" ");
                    numSeconds--;



                }

            }
            catch (InterruptedException e){
                if (numSeconds==0){
                    System.out.println("Марш!");
                    return;}

                else{
                    System.out.print(numSeconds--);
                System.out.print(" Прервано!");
                return;}


            }
            finally {

            }

            //add your code here - добавь код тут
        }
    }
}
