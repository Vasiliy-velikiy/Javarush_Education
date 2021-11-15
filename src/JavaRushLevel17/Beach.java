package JavaRushLevel17;
/*Реализуй интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями,
поэтому позаботься, чтобы все методы были синхронизированы.
Реализуй метод compareTo так, чтобы при сравнении двух пляжей он выдавал:
– положительное число, если первый пляж лучше;
– отрицательное число, если второй пляж лучше;
– ноль, если пляжи одинаковые.
Сравни каждый критерий по отдельности, чтобы победителем был пляж с лучшими показателями по
большинству критериев. Учти при сравнении, чем меньше расстояние к пляжу (distance), тем пляж лучше.*/

    public class Beach implements Comparable<Beach> {
        private String name;      //название
        private float distance;   //расстояние
        private int quality;    //качество

        public Beach(String name, float distance, int quality) {
            this.name = name;
            this.distance = distance;
            this.quality = quality;
        }

        public synchronized String getName() {
            return name;
        }

        public synchronized void setName(String name) {
            this.name = name;
        }

        public synchronized float getDistance() {
            return distance;
        }

        public synchronized void setDistance(float distance) {
            this.distance = distance;
        }

         public synchronized int getQuality() {
            return quality;
        }

        public synchronized void setQuality(int quality) {
            this.quality = quality;
        }




        public static void main(String[] args) {
            Beach beach1=new Beach("maimi", 400, 7);
            Beach beach2=new Beach("floride", 500, 6);
            Beach beach3=new Beach("colifornia", 500, 6);
            System.out.println(beach1.compareTo(beach2));
            System.out.println(beach3.compareTo(beach2));

        }






        @Override
        public synchronized int compareTo(Beach o) {
            //1 способ решения
            /*
           if(getDistance()>o.getDistance()&&getQuality()<o.getQuality())return -1;
           else if (getDistance()==o.getDistance()&&getQuality()==o.getQuality())return 0;
           else
               return 1;

*/
            int count1=0;
            int count2=0;
            int result=0;

            if (getDistance()<o.getDistance())count1++;
            if (getDistance()>o.getDistance())count2++;

            if(getQuality()>o.getQuality()) count1++;
            if(getQuality()<o.getQuality()) count2++;



            result=count1-count2;
            return result;
        }
    }
