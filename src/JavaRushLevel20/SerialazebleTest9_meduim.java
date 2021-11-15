package Stream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуй объект в методе getOriginalObject так, чтобы в случае возникновения исключения было
 выведено сообщение на экран и возвращен null.
Реализуй интерфейс Serializable где необходимо.
*/
public class SerialazebleTest9_meduim {

    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {
        A a =new A();
       try {
           a = (A) objectStream.readObject();
       }
       catch (Exception e) {
           System.out.println("this is massege");
            a=null;
       }

       return a;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }

}
