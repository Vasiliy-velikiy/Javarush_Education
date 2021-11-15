package JavaRushLevel5;
/*Создать класс Dog (собака) с тремя инициализаторами(конструкторами методов):
- Имя
- Имя, рост
- Имя, рост, цвет
*/
/*Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет*/
public class Dog {
    String name;
    int height;
    String color;

    public Dog(String name){
        this.name=name;

    }
public  Dog(String name, int height){
        this.name=name;
        this.height=height;

    }
public Dog(String name, int height,String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }









    public void initialize(String name){
        this.name=name;
    }

    public void initialize(String name, int height){
        this.name=name;
        this.height=height;
    }

    public void initialize(String name,int height, String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }
    public static void main(String[] args) {



    }
}
