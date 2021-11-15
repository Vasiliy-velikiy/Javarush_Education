package JavaRushLevel24.PatternMVC.view;

import JavaRushLevel24.PatternMVC.controller.Controller;
import JavaRushLevel24.PatternMVC.model.ModelData;
//import com.javarush.task.task36.task3608.controller.Controller;
//import com.javarush.task.task36.task3608.model.ModelData;
public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
