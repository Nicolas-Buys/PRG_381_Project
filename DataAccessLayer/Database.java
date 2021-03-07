package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class Database {
    String connectionUrl = "jdbc:sqlserver://105.224.108.126:1433;"
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
    public void eventAdd(String eventtype,double price,String address,String foodeselection,String decor,String date,int numberofpeople,int numberOfkids,int numberOfAdults,char confirmed, String name){
        try (Connection connection = DriverManager.getConnection(connectionUrl);
        Statement statement = connection.createStatement();){
            String selectSql = "SELECT AdultMealID FROM [dbo].[AdultMeals] WHERE Description = \'"+foodeselection+"\';";
            ResultSet resAdultFood = statement.executeQuery(selectSql);
            Integer AdultMealID = null, KiddiesMealID = null, client = null, DecorID = null, EventID = null;
            if (!resAdultFood.isBeforeFirst() ) {
                AdultMealID = null;
            } 
            else{
                while(resAdultFood.next()){
                    AdultMealID = resAdultFood.getInt(1);
                }  
            }
            selectSql = "SELECT KiddiesMealID FROM [dbo].[KiddiesMeal] WHERE Description = \'"+foodeselection+"\';";
            ResultSet resKidFood = statement.executeQuery(selectSql);
            if (!resKidFood.isBeforeFirst() ) {
                KiddiesMealID = null;
            } 
            else{
                while(resKidFood.next()){
                    KiddiesMealID = resKidFood.getInt(1);
                }
            }
            selectSql = "SELECT ClientID FROM [dbo].[Client] WHERE Name = \'"+name+"\';";
            ResultSet resClient = statement.executeQuery(selectSql);
            if (!resClient.isBeforeFirst() ) {
                client = null;
            } 
            else{
                while(resClient.next()){
                    client = resClient.getInt(1);
                }
            }
            selectSql = "SELECT DecorID FROM [dbo].[Decorations] WHERE Description = \'"+decor+"\';";
            ResultSet resDecor = statement.executeQuery(selectSql);
            if (!resDecor.isBeforeFirst() ) {
                DecorID = null;
            } 
            else{
                while(resDecor.next()){
                    DecorID = resDecor.getInt(1);
                }
            }
            String updateSQL = "INSERT INTO [dbo].[Event] (Description, UnitPrice) VALUES (\'"+eventtype+"\', "+price+");";
            statement.executeUpdate(updateSQL);
            selectSql = "SELECT EventID FROM [dbo].[Event] WHERE Description = \'"+eventtype+"\' AND Unitprice = "+price+";";
            ResultSet resEventID = statement.executeQuery(selectSql);
            if (!resEventID.isBeforeFirst() ) {
                EventID = null;
            } 
            else{
                while(resEventID.next()){
                    EventID = resEventID.getInt(1);
                }
            }
            updateSQL = "INSERT INTO [dbo].[Bookings] (ClientID, Confirmation, DateTime, VenueAddress, TotalAdults, TotalKids, AdultMealID, KiddiesMealID, DecorID, EventID)"
            +" VALUES ("+client+", \'"+confirmed+"\', \'"+date+"\', \'"+address+"\', "+numberOfAdults+", "+numberOfkids+", "+AdultMealID+", "+KiddiesMealID+", "+DecorID+", "+EventID+");";
            statement.executeUpdate(updateSQL);
            connection.close();
            System.out.println("Event and Booking Added");
        }
            catch (SQLException e){
                System.out.println("its not working");
                e.printStackTrace();
            }     
    }    

    
    
}


