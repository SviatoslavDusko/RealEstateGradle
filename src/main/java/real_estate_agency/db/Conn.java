package real_estate_agency.db;

import real_estate_agency.сonstants.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static Connection connection = null;

    private Conn() {
    }

    public static Connection get() {
        String connectionString = "jdbc:mysql://" + DB.HOST + ":" + DB.PORT + "/" + DB.NAME + DB.TIMEZONE;

        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionString, DB.USER, DB.PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
