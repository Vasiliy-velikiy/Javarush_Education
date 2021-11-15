package JavaRushLevel6;
/*. В классе DescriptionNewIdea создать public static класс Idea.
2. В классе Idea создать метод public String getDescription(),
который будет возвращать любую строку.
3. В классе DescriptionNewIdea создай статический метод public void printIdea(Idea idea),
который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().*/
public class DescriptionNewIdea {


    public static void main(String[] args) {
      printIdea(new Idea());
    }
    static String s="test string";

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());//если здесь я введу new Idea().getDescription()-значит
        //программа создает новый объект класса Idea и выводит ее описание. а нам нужно исп исходную Idea
        //(ее мы передали в метод)
    }



    public static class Idea{
        public String getDescription(){
            return s;
        }
    }
}
