import java.sql.Connection;

public class AccommodationApp {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection("jdbc:postgresql://local:5432/national10", "pgadmin4", "12345");
        AccommodationService accommodationService = new AccommodationService(connection);

        String type = "hotel";
        String bedType = "king size";
        int maxGuests = 2;
        String description = "high quality of furnishings, decorations and equipment";

    }
}
