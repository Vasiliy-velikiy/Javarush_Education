package JavaRushLevel17;
/*И снова Singleton паттерн - синхронизация в статическом блоке.
Внутри класса OurPresident в статическом блоке создай синхронизированный блок.
Внутри синхронизированного блока инициализируй president.*/
public class SingletonThreadTest6 {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}

/*SingletonThreadTest6 вариант, объект инициализируется сразу при загрузке класса, он потокобезопасный. вариант с блоком static
 может пригодится только тогда, когда тебе кроме инициализации этого поля, надо будет ещё какую - то логику провернуть.
private static OurPresident president;

иначе можно сразу так написать, ведь всё равно нельзя работать с методами класса, пока не загрузятся все static
поля и не выполнятся static блоки.
private static OurPresident president = new OurPresident();


не реализует паттерн Singleton, потому что есть возможность создать другой объект
и как ты создашь другой объект? ))

SingletonThreadTest5 вариант, это lazy initialization
объект не будет создан до тех пор, пока не будет запрошен хотя бы один раз. используется для "тяжелых" объектов.*/
/*нет, немного некорректно рассуждение.

статические переменные всегда блокируются по классу (так как принадлежат классу). а поля объекта блокируются по объекту.
 если сумбурно.

например public static synchronized будет равняется блокировке по классу
например public synchronized будет равняться блокировке по объекту. (this)

неважно сколько объектов может быть. важно привязанность полей.*/
//этот класс реализует синглтон-потому что нельзя создать объект, т.к объект инициализируется сразу при загрузке класса
 class OurPresident {


     private static OurPresident president;

     private OurPresident() {
     }

     public static OurPresident getOurPresident() {

 return president;

     }

     static {
         synchronized (OurPresident.class) {

            president=new OurPresident();



         }
     }
 }
