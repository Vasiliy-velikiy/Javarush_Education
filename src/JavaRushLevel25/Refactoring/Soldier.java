package JavaRushLevel25.Refactoring;

public class Soldier extends Human {
    protected  boolean isSoldier;


    public Soldier(String name, int age) {
        super(name, age);
        this.isSoldier = isSoldier;
    }

    public void live() {
        //if (isSoldier)
            fight();
    }


     public void fight() {
    }
}
