package JavaRushLevel15;
/*Разберись, что и в какой последовательности инициализируется в этой программе, а затем:
Поставь брейкпойнты и используй дебаггер.
Исправь порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0 ----на первой инизиализации переменной присваивается значение 0
null ---на первой инизиализации переменной присваивается значение null
Solution constructor
static void printAllFields
6
First name*/
//интересная задача
//исходный вариант
/*static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.name);
        System.out.println(obj.i);
    }*/


/*Здесь нужно просто сделать правильный порядок вывода в консоль. Для этого нужно знать порядок инициализации блоков и переменных.
1. Сначала инициализируются статические блоки и статические переменные класса-родителя.
2. Затем статические блоки и статические переменные наследника.
3. Далее нестатические блоки и переменные родителя.
4. После этого, конструктор родителя.
5. Далее нестатические блоки и переменные наследника.
6. И наконец конструктор наследника.
Класса-родителя тут нет, поэтому задача упрощается. Статические блоки инициализируются в том порядке, в котором они расположены в коде. Обрати на это внимание в этой задаче.
А также обрати внимание на порядок в котором вызываются переменные в методе printAllFields.
Просто расставь все в правильном порядке и будет тебе решение.*/

//по сути breakpoint - это точка откуда будет пошагово показано движение программы
public class Solution2 {
    static {
        init();
    }
   static   {
        System.out.println("Static block");
    }

     {
        System.out.println("Non-static block");
      printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";



    public Solution2() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");

        Solution2 s = new Solution2();
    }

    public static void printAllFields(Solution2 obj) {
        System.out.println("static void printAllFields");

       System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
