package JavaRushLevel25.Refactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private List<Human> children = new ArrayList<>();//подняли это поле (и соотетсвенно гетеры и сетеры) из Student и Teacher(это поле
                                        //  там не нужно потому что классы все равно наследуются от Human

    public List<Human> getChildren() {  //инкапсуляция коллекции- Метод getChildren должен возвращать не модифицируемое представление списка children.
        return Collections.unmodifiableList(children);            //убираем сеттер и вместо него добавляем addChild(Human) и removeChild(Human)
    }

    public void addChild(Human child) {
        children.add(child);
    }
    public void removeChild(Human child) {
        children.remove(child);
    }


    public static int nextId = 0;
    private int id;
    protected int age;
    protected String name;





    protected int[] size;



    public static final int FIRST = 1;
    public static final int SECOND = 2;
    public static final int THIRD = 3;
    public static final int FOURTH = 4;
    private int bloodGroup;

    public void setBloodGroup(int code) {
        bloodGroup = code;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }


   public Human(String name, int age) {
      // this.isSoldier = isSoldier;
       this.id = nextId;
       nextId++;
       this.age=age;
       this.name=name;
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printSize() {
        System.out.println("Рост: " + size[0] + " Вес: " + size[1]);
    }


    public void live() {

    }


    //  protected boolean isSoldier;

     /* public Human(boolean isSoldier) {
        this.isSoldier = isSoldier;
        this.id = nextId;
        nextId++;
    }*/

    /*public void live() {
        if (isSoldier)
            fight();
    }*/

   /* public void fight() {
    }

    protected int course;




    */
}