package JavaRushLevel23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Inner 3
*/
/*Внутри класса Solution:
1) реализуй private class TaskDataProvider используя Task и MockDB, цель которого - обновить поле tasks.
2) реализуй private class NameDataProvider используя String и MockDB, цель которого - обновить поле names.*/
public class NestedClassTest {

    private List<Task> tasks;
    private List<String> names;

    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task {
    }


    private class TaskDataProvider implements DbDataProvider{
        @Override
        public void refreshAllData(Map criteria) {

            //я не могу написать так tasks.addAll(MockDB.getFakeTasks(criteria));-потому что переменная класса не инициализирована
            //у таких переменных нельзя вызывать методы
            tasks=MockDB.getFakeTasks(criteria);

        }
    }

    private class NameDataProvider implements DbDataProvider{
        @Override
        public void refreshAllData(Map criteria) {
            names=MockDB.getFakeNames(criteria);
        }
    }


    public static void main(String[] args) {

    }
}




class MockDB {
    private static final List<NestedClassTest.Task> FAKE_TASKS = new ArrayList<>();
    private static final List<String> FAKE_NAMES = new ArrayList<>();

    public static List<NestedClassTest.Task> getFakeTasks(Map criteria) {
        return MockView.getFakeTaskCriteria().equals(criteria) ? FAKE_TASKS : null;
    }

    public static List<String> getFakeNames(Map criteria) {
        return MockView.getFakeNameCriteria().equals(criteria) ? FAKE_NAMES : null;
    }
}

class MockView {
    private static final Map FAKE_TASK_CRITERIA = new HashMap();
    private static final Map FAKE_NAME_CRITERIA = new HashMap();

    public static Map getFakeTaskCriteria() {
        return FAKE_TASK_CRITERIA;
    }

    public static Map getFakeNameCriteria() {
        return FAKE_NAME_CRITERIA;
    }
}