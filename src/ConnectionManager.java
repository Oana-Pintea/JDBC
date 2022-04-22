import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public ConnectionManager(){
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(String url, String user, String password){
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
