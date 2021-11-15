package JavaRushLevelTest;
/*Исправь классы Fox и BigFox так, чтобы программа компилировалась.
В решении этой задачи не нужно создавать экземпляры базового класса.
Метод main не изменяй.*/
public class InterfaceTestL8 {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
       default Color getColor(){
           return null;
       }
    }

    public abstract static class Fox  implements Animal {
        public String getName() {
            return "Fox";
        }


    }

    public  static class BigFox extends Fox  {

    }
    public  enum Color{

    }
}
