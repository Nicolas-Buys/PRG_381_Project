package DataAccessLayer;

import java.sql.*;
public class Database {
    String connectionUrl =
    "jdbc:sqlserver://105.186.136.224:1433;"
            + "databaseName=Catering;"
            + "integratedSecurity=true;" ; 
    ResultSet resultSet = null;
    public void Databasetest() {
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement();) {
            // Code here.
            String selectSql = "SELECT * from dbo.AdultMeals";
            resultSet = statement.executeQuery(selectSql);
            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
        }
    }
        // Handle any errors that may have occurred.
    catch (SQLException e) {
        System.out.println("its not working");
    }
    }
    
}


