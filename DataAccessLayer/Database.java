package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public void clientAdd(String n, String s, String c){ //method to add client in database
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement();){
            String selectSql = "INSERT INTO [dbo].[Client] (Name, Surname, Phone) VALUES (\'"+n+"\', \'"+s+"\', \'"+c+"\');";
            int res = statement.executeUpdate(selectSql);
            System.out.println("Client added. "+res+" rows updated");
            connection.close();
        }
            catch (SQLException e){
                System.out.println("its not working");
                e.printStackTrace();
            }     
    }
    public void eventAdd(String eventtype,double price,String foodeselection,String decor,String date,String numberofpeople,String numberOfkids,boolean confirmed){
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement();){
            String selectSql = "INSERT INTO [dbo].[Bookings] () VALUES ();";
            int res = statement.executeUpdate(selectSql);
            System.out.println("Booking added. "+res+" row(s) updated");
            connection.close();
        }
            catch (SQLException e){
                System.out.println("its not working");
                e.printStackTrace();
            }     
    }    

    
    
}


