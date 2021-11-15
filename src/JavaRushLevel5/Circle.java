package JavaRushLevel5;
/*Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color*/

/*Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color*/
class Circle1 {
  int  centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public Circle1(){

    }

    public Circle1(int centerX){
        this.centerX=centerX;


    }
    public Circle1(int centerX,int centerY) {
        this.centerX=centerX;
        this.centerY=centerY;


    }
    public Circle1(int centerX,int centerY,int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;

    }
    public Circle1(int centerX,int centerY,int radius,int width){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;

    }
    public Circle1(int centerX,int centerY,int radius,int width,int color){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }











    public void initialize(int centerX, int centerY,int  radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }
        public void initialize(int centerX, int centerY,int  radius ,int width ){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    } public void initialize(int centerX, int centerY,int  radius ,int width, int color ){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }






    public static void main(String[] args) {

    }
}


public class Circle {
    public double x;
    public double y;
    public double r;



    public  Circle(){


    }public  Circle(double x){
        this.x=x;

    }
    public  Circle(double x,double y){
        this.x=x;
        this.y=y;


    }
    public  Circle(double x,double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;

    }





}


/*Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle3. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.*/
 class Circle3 {


    public Color color; //? переменная color типа Сolor (такой класс у нас) которая имеет переменную  String description

    public static void main(String[] args) {
        Circle3 circle = new Circle3(); //мы создаем объект  circle который имеет переменную color
        circle.color.setDescription("Red"); //color в свою очередь имеет в себе метод setDescription(String description)
        System.out.println(circle.color.getDescription()); //
    }
//ошибка скорее всего в этом методе,который должен быть конструктором. он будет создавать новый объект типа Сolor который в свою очередь будет привязан к
    //создаваемому объекту типа Сircle3. Потому что я не могу по сути использовать переменную  color типа Color, не создав объект
    public void Circle3() { // при вызове этого метода ,color создает новый объект типа Color
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
