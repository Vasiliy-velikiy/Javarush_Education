package примеры;

import JavaRushLevel22.StringbuilderTest2_hard;
import kotlin.Pair;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3  {
    public static void main(String[] args) {
        List <String> items = new ArrayList<>();
        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");

     /* items.forEach(new Consumer<String>() {
          @Override
          public void accept(String s) {

          }
      });*/

        //Чтобы передать ссылку на статический метод, нужно записать код вида класс::метод. Этот код будет преобразован к коду вида x -> класс.метод(x);


        for (String item : items) {
            StringBuilder stringBuilder = new StringBuilder(item);
          stringBuilder.reverse();
        }
       // items.forEach(s -> System.out.println(new StringBuilder(s).reverse()));//
    }

}
