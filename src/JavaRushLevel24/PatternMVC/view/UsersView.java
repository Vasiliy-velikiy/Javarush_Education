package JavaRushLevel24.PatternMVC.view;

import JavaRushLevel24.MarkerInterfaceTest3;
import JavaRushLevel24.PatternMVC.bean.User;
import JavaRushLevel24.PatternMVC.controller.Controller;
import JavaRushLevel24.PatternMVC.model.ModelData;
//import com.javarush.task.task36.task3608.controller.Controller;
//import com.javarush.task.task36.task3608.model.ModelData;
//import com.javarush.task.task36.task3608.bean.User;
public class UsersView implements View{
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        if (modelData.isDisplayDeletedUserList()==true){
            System.out.println("All deleted users:");
            /*for (User user: modelData.getUsers()) {
                System.out.println("\t"+user);
            }
            System.out.println("===================================================");*/
        }
        else {
                System.out.println("All users:");
        }
                    for (User user: modelData.getUsers()) {
                     System.out.println("\t"+user);
                     }
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
