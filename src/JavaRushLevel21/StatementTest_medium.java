package JavaRushLevel21;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
/*Реализуй метод finalize, предварительно обдумав, что именно в нем должно быть.
Проведи рефакторинг метода getUsers в соответствии с java7 try-with-resources.
*/
public class StatementTest_medium {
    private Connection connection; //Connection -объект  установления соединения  с базой данных,
                                   //можети создаваться так Connection conn = DriverManager.getConnection(url, username, password);
    public StatementTest_medium(Connection connection) {
        this.connection = connection;
    }

    public List<User> getUsers() throws SQLException {
        String query = "select ID, DISPLAYED_NAME, LEVEL, LESSON from USER";
        List<User> result = new LinkedList();

        //Statement stmt = null;//класс используется для выполнения sql запросов
        //ResultSet rs = null;  //Класс ResultSet представляет результирующий набор данных и обеспечивает
                             // приложению построчный доступ к результатам запросов. При обработке запроса
                             // ResultSet поддерживает указатель на текущую обрабатываемую строку.

        try(Statement stmt= connection.createStatement();
        ResultSet rs = stmt.executeQuery(query))
        {
            //stmt = connection.createStatement(); // Объект Statement создается методом Connection.createStatement.   установление сединения Connection с базой данных
           // rs = stmt.executeQuery(query); //Метод executeQuery используется в запросах, результатом которых является один единственный набор значений, таких как запросов типа SELECT.
                                           //Для отправки серверу БД SQL-выражения для выполнения необходимо вызвать метод executeQuery объекта Statement и в качестве аргумента передать скрипт запроса :
                                           //ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");


            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("DISPLAYED_NAME");
                int level = rs.getInt("LEVEL");
                int lesson = rs.getInt("LESSON");

                result.add(new User(id, name, level, lesson));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (getConnection()!=null){
            getConnection().close();
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public static class User {
        private int id;
        private String name;
        private int level;
        private int lesson;

        public User(int id, String name, int level, int lesson) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", level=" + level +
                    ", lesson=" + lesson +
                    '}';
        }
    }

    public static void main(String[] args) {

    }
}
