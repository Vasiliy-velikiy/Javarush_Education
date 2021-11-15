package JavaRushLevel18;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
/*
* */
public class WrapperTesr {
    public static void main(String[] args) {

        Developer developer=new SeniorDeveloper(new JavaDeveloper());
developer.printsomething();
        System.out.println();

Developer developer1=new TeamLead(new SeniorDeveloper(new JavaDeveloper()));
        developer1.printsomething();
    }



}

interface Developer{

   public void   printsomething();
}

class  JavaDeveloper implements Developer{
    @Override
    public void printsomething() {
        System.out.println("I java Developer");
    }
}


class DecoratorDevelope implements Developer{
    Developer developer;
    public  DecoratorDevelope(Developer developer){
        this.developer=developer;

    }

    @Override
    public void printsomething() {
        developer.printsomething();
        System.out.println("weri well");
    }
}

class SeniorDeveloper extends DecoratorDevelope  {
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }


    public void codeReview() {
        System.out.println("code review from senior developer ");

    }

    @Override
    public void printsomething() {
        super.printsomething();
        codeReview();
    }
}

class TeamLead extends DecoratorDevelope{
    public TeamLead(Developer developer) {
        super(developer);
    }

   public void somemethodfromteamlead(){

        System.out.println("iam teamlead and i send weekreport to customer");
    }

    @Override
    public void printsomething() {

        somemethodfromteamlead();
    }
}