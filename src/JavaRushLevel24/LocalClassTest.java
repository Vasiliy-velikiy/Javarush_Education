package JavaRushLevel24;
/*В классе Rectangle:
1. Измени методы getHeight и getWidth, чтобы они возвращали объекты типов HasHeight и HasWidth соответственно.
2. Для этого внутри методов getHeight и getWidth создай локальные классы - реализации интерфейсов.
3. Переименуй getHeight в castToHasHeight, getWidth в castToHasWidth (на имени метода нажми Shift+F6).
4. Убери наследование интерфейсов в классе Rectangle.

P.S. Ожидается, что после внесения требуемых изменений, закомментированный код в методе станет рабочим и должен быть раскомментирован.*/
public class LocalClassTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        //System.out.println(getHeight(rectangle));
       // System.out.println(getWidth(rectangle));
        /////////////////////expected//////////////////
        System.out.println(getHeight(rectangle.castToHasHeight()));
        System.out.println(getWidth(rectangle.castToHasWidth()));
    }

    public static double getHeight(HasHeight rectangle) {
        return rectangle.getHeight();
    }

    public static double getWidth(HasWidth rectangle) {
        return rectangle.getWidth();
    }


    public static class Rectangle {//implements HasHeight, HasWidth
        private Point point1;
        private Point point2;

        public Rectangle(double x1, double y1, double x2, double y2) {
            point1 = new Point(x1, y1);
            point2 = new Point(x2, y2);
        }

        public HasHeight castToHasHeight() {
            //return Math.abs(point1.getY() - point2.getY());
            return new HasHeight() {

                @Override
                public double getHeight() {
                    return  Math.abs(point1.getY() - point2.getY());
                }
            };
        }

        public HasWidth castToHasWidth() {
           // return Math.abs(point1.getX() - point2.getX());  //Math.abs-дает модуль числа

            return new HasWidth(){

                @Override
                public double getWidth() {
                    return Math.abs(point1.getX() - point2.getX());
                }
            };
        }
    }
}

interface HasHeight {
    double getHeight();
}

interface HasWidth {
    double getWidth();
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}