/*В этой задаче тебе нужно:
Создать 7 public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()*/
public class StaticTetsL2_medium {

    //если поляне сделать статичными то их не сможет увидеть метод main
    //дефолтные значения(по умолчанию) могут получать перменные класса-поля класса(не метода) при их обьявлении
    // т.е. их инициализация не обязательна
    /*При объявлении переменной в некотором классе, этой переменной присваиваются значения по умолчанию. Ниже приведены значения по умолчанию, которые присваиваются переменным разных типов

int      => 0
boolean  => false
double   => 0.0
float    => 0.0
char     => ' ' - нуль-символ
long     => 0
byte     => 0*/
//1 способ-сделать переменные статичными, тогда не нужно создавать объект и выводить каждую переменную с точ натацией

    //2 вариант-создать объект
      public  int intVar;
       public double doubleVar;
       public Double DoubleVar;
       public boolean booleanVar;
       public Object ObjectVar;
       public Exception ExceptionVar;
       public String StringVar;

            public static void main(String[] args) {
              StaticTetsL2_medium solution=new StaticTetsL2_medium();
                System.out.println(solution.intVar);
                System.out.println(solution.doubleVar);
                System.out.println(solution.DoubleVar);
                System.out.println(solution.booleanVar);
                System.out.println(solution.ObjectVar);
                System.out.println(solution.ExceptionVar);
                System.out.println(solution.StringVar);


    }

}
