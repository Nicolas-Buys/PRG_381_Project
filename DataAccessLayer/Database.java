package DataAccessLayer;

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
            String selectSql = "SELECT * from dbo.AdultMeals";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
        }
        // Handle any errors that may have occurred.
    catch (SQLException e) {
        e.printStackTrace();

}
