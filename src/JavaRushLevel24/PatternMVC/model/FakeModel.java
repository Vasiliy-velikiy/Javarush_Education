package JavaRushLevel24.PatternMVC.model;

import JavaRushLevel24.MarkerInterfaceTest3;
import JavaRushLevel24.PatternMVC.bean.User;

//import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model{
   private ModelData modelData=new ModelData();
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
      /*List arrayList= modelData.getUsers();
        arrayList.add(new User("A", 1, 1));
        arrayList.add(new User("B", 2, 1));*/
        List<User>list=new ArrayList<>();
        list.add(new User("A", 1, 1));
        list.add(new User("B", 2, 1));
        modelData.setUsers(list);
    }

    @Override
    public void loadDeletedUsers() {
       throw  new UnsupportedOperationException();
    }
}
