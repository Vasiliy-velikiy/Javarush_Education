package JavaRushLevel23;
import java.util.*;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/*1. В пакете vo создай public классы User, Location, Server, Subject, Subscription, которые наследуются от NamedItem
2. В классе Solution для каждого класса создай свой метод, который возвращает список экземпляров класса.

Например, для класса User это будет - public List<User> getUsers()
Для класса Location это будет - public List<Location> getLocations()

3. Внутри каждого такого метода создай анонимный класс от AbstractDbSelectExecutor и вызови его нужный метод.

Подсказка:
тело метода должно начинаться так: return new AbstractDbSelectExecutor

4. Пример вывода для User и Location:
Id=5, name='User-5', description=Received from executing 'SELECT * FROM USER'
Id=1, name='Location-1', description=Received from executing 'SELECT * FROM LOCATION'

5. Проанализируй пример вывода и сформируй правильный query для всех классов.*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
       print(solution.getUsers());
       print(solution.getLocations());

    }

    public static void print(List list) {               //метод вывода
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;//сужаем объект до класса NamedItem- тк интересуюшие нас классы наследуются от NamedItem
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }


    public  List<User> getUsers(){
        return new AbstractDbSelectExecutor<User>() {//abstract class AbstractDbSelectExecutor<T extends NamedItem> -значит в параметрах абстр класса можно прописать классы которые наследуются от  NamedItem
            @Override
            public String getQuery() {

                return "SELECT * FROM USER";                //'эта строка пердается в метод execute()-этот метод отвечает за вывод
            }
        }.execute();

    }



    public List<AnonymousClassTest_hard> getLocations(){
        return new AbstractDbSelectExecutor<AnonymousClassTest_hard>(){

            @Override
            public String getQuery() {
                return "SELECT * FROM LOCATION";
            }
        }.execute();
    }


public List<Server> getServers(){
        return new AbstractDbSelectExecutor<Server>(){

            @Override
            public String getQuery() {
                return "SELECT * FROM SERVER";
            }
        }.execute();
    }

 public List<Subject> getSubjects(){
        return new AbstractDbSelectExecutor<Subject>(){

            @Override
            public String getQuery() {
                return "SELECT * FROM SUBJECT";
            }
        }.execute();
    }

public List<Subscription> getSubscriptions(){
        return new AbstractDbSelectExecutor<Subscription>(){

            @Override
            public String getQuery() {
                return "SELECT * FROM SUBSCRIPTION";
            }
        }.execute();
    }
}

 class User extends NamedItem{

}



class AnonymousClassTest_hard extends NamedItem{


}
class  Server extends NamedItem{

}
class Subject extends NamedItem{

}
class Subscription extends NamedItem{

}


abstract class AbstractDbSelectExecutor<T extends NamedItem> {

    public abstract String getQuery();

    /**
     * This is a fake method
     *
     * @return a list of 5 fake items
     */
    public List<T> execute() {
        List<T> result = new ArrayList<>();     //список объекта который передается в параметрах к абстрактному классу
        //check that the query is not null
        String query = getQuery();              //строке query передается результат метода getQuery()-(для каждого объекта он свой)
        if (query == null) return result;       //если getQuery() пустой то возварщается не проинициализированный список

        try {
            //generate 5 fake items
            for (int i = 1; i <= 5; i++) {
                T newItem = getNewInstanceOfGenericType();//создается новый объект типа Т(тот объект который передается в параметрах к абстрактному методу
                newItem.setId(i);                         //имеется метод setId, setName,setDescription- т.к класс наследуется от NamedItem
                newItem.setName(newItem.getClass().getSimpleName() + "-" + i);
                newItem.setDescription("Received from executing '" + query + "'");
                result.add(newItem);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    //reflection
    //you need to know that it is possible to create a new instance of the T (generic type) class using its default constructor
    //есть возможность создавать новый экземпляр объекта Т (не зная что это за конкретный класс) используя его конструктор по умолчанию
    private T getNewInstanceOfGenericType() throws InstantiationException, IllegalAccessException {
        return (T) ((Class) ((ParameterizedType) this.getClass().
                getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
    }
}

    class NamedItem {
        private int id;
        private String name;
        private String description;

        public NamedItem() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }