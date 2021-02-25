package DataLinkLayer;

import java.sql.*;
public class Database {
    String connectionUrl =
    "jdbc:sqlserver://DESKTOP-Q58KIN3.database.windows.net:1433;"
            + "database=Catering;"
            + "user=DESKTOP-Q58KIN3\\Nicol@DESKTOP-Q58KIN3;"
            + "password=u9581abc;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "loginTimeout=30;";
    try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
        }
        // Handle any errors that may have occurred.
    catch (SQLException e) {
        e.printStackTrace();

}
