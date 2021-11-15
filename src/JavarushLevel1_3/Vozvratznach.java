import org.w3c.dom.ls.LSOutput;

public class Vozvratznach {
    int a;
    int b;
        Vozvratznach(int a,int b){
            this.a=a;
            this.b=b;
        }

//метод для решения задачи:на луне сила тяжесть 17% от земной. реализовать метод которыц принимает вес тела в ньютонах
// и возвращает скольок это будет весить на луне
   public static double getWeight(int i){
            double g=i*0.17;
       return g;
   }





public static void str(String s){
    System.out.print(s+" ");
}

    public int min() {
        int d = a;
        int f = b;

        int c;
        if (d < f) return c = d;
        else return c = f;
    }




    public static int min1(int a, int b) {
        int m;
        if (a < b) return m = a;
        else return m = b;
    }



        public static int min2(int a, int b,int c) {
        int m2;
        if(a<=b&a<c) return m2=a;//добавлено не строгое неравенство, потому что если будут цифры 1,1,2 то логика нарушится и мин значение выдаст 2
        else if (b<a&b<c) return m2=b;
        else return m2=c;
    }

// найти мин значение из 4 чисел, и этот метод min(a,b,c,d) должен использовать метод min(a,b);
public static int min3(int a, int b,int c,int d) {
    int m3;
    //вариант для 4 отдельных значений
    //if (a <= b & a < c & a < d) return m3 = a;
   // else if (b < a & b < c & b < d) return m3 = b;
    //else if (c <= a & c <= b & c < d) return m3 = c;
    //else return m3 = d;
//вариант когда используется метод min1(a,b);

    if(min1(a,b)<=c & min1(a,b)<d) return m3=min1(a,b);
    else if (c<=min1(a,b) & c<d) return m3=c;
    else return m3=d;


}


    public static void main(String[] args) {


        Vozvratznach vozvratznach=new Vozvratznach(78,45);
        System.out.println(vozvratznach.min());

        //см выше как можно было сделать(2способ)
        int j=31,l=1,k=1;//эти значения передаются в параметры метода
        int m=min2(j,l,k);
        System.out.println("min2-->"+m);
        int m3=min3(1,3,1,2);
        System.out.println("min3-->"+m3);

        int a=5,b=4;
        int m1=min1(a,b);
        System.out.println("min1-->"+m1);

        str("cat");
        str("dog");
        System.out.println();
        System.out.println("weigt on moon: "+getWeight(888));
    }
}
