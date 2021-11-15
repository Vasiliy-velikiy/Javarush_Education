package JavaRush;
/*Обеспечь переуступку кванта времени (переход хода для текущей нити) для последовательных выводов текста в консоль.*/
public class Solution {
    public static class YieldRunnable implements Runnable {
        private int index;

        public YieldRunnable(int index) {
            this.index = index;
        }

        public void run() {
            //если вообще не ставить yield - то вывод будет постоянно хаотичным
            System.out.println("begin-" + index);
           Thread.yield(); //"уступить" в этом месте-дает нам вывод begin сначала 1ой нити потому она уступает, и сартует begin второй нити, потом она уступает и дальше вывод  end 1 и end 2
            System.out.println("end-" + index);
        }
    }

    public static void main(String[] args) {
        YieldRunnable yieldRunnable1=new YieldRunnable(12);
        YieldRunnable yieldRunnable2=new YieldRunnable(2);

        Thread thread1=new Thread(yieldRunnable1);
        Thread thread2=new Thread(yieldRunnable2);
        thread1.start();
      //  thread1.yield(); если здесь поставить "уступить"-то нить  thread1 ничего не выведет-а даст возможность поочередно вывести  thread2 и лишь потом начент выводить
        thread2.start();


    }
}
