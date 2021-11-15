package JavaRushLevel21.Game_Ippodrom;

public class Horse {
    String name;
    double speed;
    double distance;

     Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    void move(){
        //int diapazon_clych_chisla = (int) (Math.random()*2);
       // distance+=speed*diapazon_clych_chisla;
        distance+=(speed*(Math.random()));


    }
    void print(){
            StringBuilder stringBuilder=new StringBuilder();
            int dist=(int)distance;
        for (int i = 0; i <dist ; i++) {
            System.out.print(".");
        }
        System.out.print(name);
        System.out.println();


    }

}
