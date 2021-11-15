package JavaRushCiclLevel4;

/*работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
Пример для числа 2.5:
зелёный
Пример для числа 3:
жёлтый
Пример для числа 4:
красный
Пример для числа 5:
зелёный
*/
public class TrafficLigts {


    public static void main(String[] args) throws Exception {

double i2=  56.2%5;
double i1=56.0/5;
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a1 = bf.readLine();
        double a = Double.parseDouble(a1);

        int green=3;
        int yellow=1;
        int red=1;

        if (a<3)  {
            System.out.println("зеленый");
        }
*/
        System.out.println(i2);
        System.out.println(i1);


        double f = 0.0;
        for (int i=1; i <= 10; i++) {
            f += 0.1;
        }

        System.out.println(f);
    }
}
