import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccommodationService {
    private Connection connection;

    public AccommodationService(Connection connection) {
        this.connection = connection;
    }

    public void addAccommodationService(Accommodation accommodation){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation VALUES (? ? ? ? ? ");
            preparedStatement.setObject(1, accommodation.getId());
            preparedStatement.setObject(2, accommodation.getType());
            preparedStatement.setObject(3, accommodation.getBedType());
            preparedStatement.setObject(4, accommodation.getMaxGuests());
            preparedStatement.setObject(5, accommodation.getDescription());
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
