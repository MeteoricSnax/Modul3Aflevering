package DBAccess;

import static DBAccess.Connector.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class Connector {

    //private static final String URL = "jdbc:mysql://46.101.253.149:3306/useradmin";
    private static final String URL = "jdbc:mysql://localhost:3306/useradmin?serverTimezone=UTC";
//    private static final String USERNAME = "doorkeeper";
    private static final String USERNAME = "root";
//    private static final String PASSWORD = "bank3*andyouarein";
    private static final String PASSWORD = "Ch3c42a1311!";

    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        }
        return singleton;
    }

}
