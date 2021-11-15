package JavaRushLevel15;

import java.util.HashMap;
import java.util.Map;

/*В статическом блоке инициализируй labels пятью различными парами ключ-значение.*/
public class CollectoinTest {

    public static Map<Double, String> labels = new HashMap<Double, String>();
static {
    labels.put(1.0, "Baraca");
    labels.put(2.0, "Subzero");
    labels.put(3.0, "Lucan");
    labels.put(4.0, "Kunlao");
    labels.put(5.0, "Scorpion");

}
    public static void main(String[] args) {







       // for(Map.Entry entry:labels.entrySet()){
          //  System.out.println(entry);
       // }
        System.out.println(labels);
    }
}