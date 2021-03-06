package JavaRushLevel24.PatternMVC;

import JavaRushLevel24.PatternMVC.controller.Controller;
import JavaRushLevel24.PatternMVC.model.FakeModel;
import JavaRushLevel24.PatternMVC.model.MainModel;
import JavaRushLevel24.PatternMVC.model.Model;
import JavaRushLevel24.PatternMVC.view.UsersView;


//import com.javarush.task.task36.task3608.controller.Controller;
//import com.javarush.task.task36.task3608.model.MainModel;
//import com.javarush.task.task36.task3608.model.FakeModel;
//import com.javarush.task.task36.task3608.model.Model;
//import com.javarush.task.task36.task3608.view.UsersView;
//import com.javarush.task.task36.task3608.model.MainModel;
public class Solution {
    public static void main(String[] args) {
       // Model model = new FakeModel();
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();
    }
}
