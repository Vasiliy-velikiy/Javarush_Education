package JavaRushLevel23;
/*Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions*/
public class InnerClassTest2_medium {

    public InnerClass[] innerClasses = new InnerClass[2];

    public  class InnerClass {
    }

    public static  InnerClassTest2_medium[] getTwoSolutions() {

InnerClassTest2_medium solution1=new InnerClassTest2_medium();
InnerClassTest2_medium solution2=new InnerClassTest2_medium();
solution1.innerClasses[0]=solution1.new InnerClass();
solution1.innerClasses[1]=solution1.new InnerClass();

solution2.innerClasses[0]=solution1.new InnerClass();
solution2.innerClasses[1]=solution1.new InnerClass();

InnerClassTest2_medium[] masssolution=new InnerClassTest2_medium[2];
masssolution[0]=solution1;
masssolution[1]=solution2;
        return  masssolution ;
    }

    public static void main(String[] args) {

    }
}
