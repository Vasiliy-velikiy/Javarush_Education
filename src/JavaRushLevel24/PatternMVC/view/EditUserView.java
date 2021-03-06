package JavaRushLevel24.PatternMVC.view;

import JavaRushLevel24.PatternMVC.controller.Controller;
import JavaRushLevel24.PatternMVC.model.ModelData;


//import com.javarush.task.task36.task3608.controller.Controller;
//import com.javarush.task.task36.task3608.model.ModelData;
public class EditUserView implements View{
    private Controller controller;
    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t"+modelData.getActiveUser());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller=controller;
    }
    public   void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
}
