package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import BusinessLogicLayer.Client;
import BusinessLogicLayer.Event;
public class Database {
    String connectionUrl = "jdbc:sqlserver://105.186.136.224:1433;"
    + "instanceName=mssqlserver;"
    + "user=sa;"
    + "password=PRG381Project;"
    + "databaseName=Catering";
    ResultSet resultSet = null;
    public void Databasetest() {
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement();) {
            // Code here.
            String selectSql = "SELECT TOP 10 * from [dbo].[AdultMeals]";
            resultSet = statement.executeQuery(selectSql);
            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }   
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.out.println("its not working");
            e.printStackTrace();
        }
    }

    public void getListofCliet(List<Client> cl){
        List<Client> clientList = new ArrayList<>();

        clientList = cl;
    }

    public void getListofEvent(List<Event> el){
        
        List<Event> eventList = new ArrayList<>();
        eventList =el;
    }
    
}


