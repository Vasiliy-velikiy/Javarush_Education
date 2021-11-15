package JavaRushLevel24.PatternMVC.model;

import JavaRushLevel24.PatternMVC.bean.User;
import JavaRushLevel24.PatternMVC.model.service.UserService;
import JavaRushLevel24.PatternMVC.model.service.UserServiceImpl;

//import com.javarush.task.task36.task3608.bean.User;
//import com.javarush.task.task36.task3608.model.service.UserService;
//import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    private ModelData modelData=new ModelData();
    private UserService userService=new UserServiceImpl();

    public ModelData getModelData() {
        return modelData;
    }

    public void loadUsers() {
      List<User> list=  userService.getUsersBetweenLevels(1, 100);
        modelData.setUsers(list);
        modelData.setDisplayDeletedUserList(false);
    }

//?
    public void loadDeletedUsers() {
            List<User> users = userService.getAllDeletedUsers();
            modelData.setUsers(users);
            modelData.setDisplayDeletedUserList(true);
    }

}
