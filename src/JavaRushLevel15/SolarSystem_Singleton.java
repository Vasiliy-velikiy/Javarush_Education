/*Для решения этой задачи тебе нужно:
Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
Реализовать интерфейс Planet в классах Sun, Moon, Earth.
В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
для этого считай с консоли один параметр типа String.
если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet
thePlanet, иначе — обнули Planet thePlanet.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolarSystem_Singleton {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
static {
    try {
        readKeyFromConsoleAndInitPlanet();
    } catch (IOException ioException) {
        ioException.printStackTrace();
    }
    //add static block here - добавьте статический блок тут
}
    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        if (s.equals(Planet.EARTH)){
          thePlanet= Earth.getInstance();
        }
        else if(s.equals(Planet.MOON)){
            thePlanet=Moon.getInstance();
        }
        else if(s.equals(Planet.SUN)){
            thePlanet=Sun.getInstance();
        }
        else  thePlanet=null;

        // implement step #5 here - реализуйте задание №5 тут
    }
}

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}

class Sun implements Planet {
    private static Sun instance;

    private Sun() {

    }
    public  static Sun getInstance(){
        if(instance==null){
            instance= new Sun();
        }
        return instance;
    }
}

class Moon implements Planet {
    private static Moon instance;

    private Moon() {

    }
    public  static Moon getInstance(){
        if(instance==null){
            instance= new Moon();
        }
        return instance;
    }
}
class Earth implements Planet {
    private static Earth instance;

    private Earth() {

    }
    public  static Earth getInstance(){
        if(instance==null){
            instance= new Earth();
        }
        return instance;
    }

}