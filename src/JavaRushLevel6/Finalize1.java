package JavaRushLevel6;
/*1) В классе Cat создать метод protected void finalize() throws Throwable.
  2) В каждом классе Cat и Dog написать метод finalize, который выводит на экран
  текст о том, что такой-то объект уничтожен.
  3) Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать
   неиспользуемые, и метод finalize хоть раз да вызовется).



  */
public class Finalize1 {

    public static void main(String[] args) throws Throwable {
        for (int i = 1; i <=50000 ; i++) {
           Cat1 cat=new Cat1();
           cat.finalize();
           Dog1 dog1=new Dog1();
           dog1.finalize();
        }


    }




    static class Dog1{
        protected void finalize() throws Throwable{
            super.finalize();
            System.out.println("A Dog was destroyed");
        }
    }
     static class Cat1{
        protected void finalize() throws Throwable{
            super.finalize();
            System.out.println("A Cat was destroyed");
        }
    }
}
