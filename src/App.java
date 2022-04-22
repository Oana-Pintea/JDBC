import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection("jdbc:postgresql://localhost:5432/national10", "postgres", "12345");

        try(Statement query = connection.createStatement()) {
            ResultSet response = query.executeQuery("select * FROM accommodation");
            while(response.next()){
                Accommodation accommodation = new Accommodation(
                        response.getInt("id"),
                        response.getString("type"),
                        response.getString("bed_type"),
                        response.getInt("max_guests"),
                        response.getString("description"));
                System.out.println(accommodation);
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }

}
