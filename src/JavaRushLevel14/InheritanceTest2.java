package JavaRushLevel14;
/*Давай напишем программу, которая создает мышонка.
Для этого инициализируй объект obj таким классом, чтобы метод main() выполнился без ошибок.*/
public class InheritanceTest2 {
    public static void main(String[] args) {
        Object obj =new Jerry(); //Add your code here

                Mouse mouse = (Mouse) obj;//Если в результате присваивания мы двигаемся по цепочке наследования
        //вниз, к типу объекта, то это — сужение типа (оно же — нисходящее преобразование или downcasting).
        //При сужении типа, нужно использовать оператор преобразования типа, то есть мы выполняем явное преобразование.
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
