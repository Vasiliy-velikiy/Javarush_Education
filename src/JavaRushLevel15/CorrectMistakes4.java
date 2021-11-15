package JavaRushLevel15;
/*Убери в методе main() лишние строки, для которых метод add() не реализован.*/
public class CorrectMistakes4 {
    //исходный вариант
    /*public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        add("1", 2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }*/

    public static void main(String[] args) {
//Что с типизацией?
//Любое число с плавающей точкой создает тип double. Если необходимо использовать тип float, следует добавить в конце символ f
// или F. В этом случае double будет сведен к типу float. Автоматически этого не происходит:
        //без f все литералы с плавающей точкой double
        add((short) 1, 2f);//
        add(1, 2);
        add(2d, 2);
        //add("1", 2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}
