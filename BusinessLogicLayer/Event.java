package BusinessLogicLayer;

import java.sql.*;
import java.util.*;
import DataAccessLayer.*;
public class Event {

 private String eventType,address,venueName,cellNumber,decorations;
 private String dateT;
 private boolean confirm;
 private double price;
 private int numberOfPeople;// Number of people = number of kids + number of adults 
 

    //Properties

     public String geteventType()
     {
        return eventType;
     }   
     public void seteventType(String eventType)
     {
         this.eventType = eventType;
     }
    
     public double getprice()
     {
        return price;
     }   
     public void setPrice(double price)
     {
         this.price = price;
     }
     
     public String address()
     {
        return address;
     }   
     public void address(String address)
     {
         this.address = address;
     }


     public String decorations()
     {
        return decorations;
     }   
     public void decorations(String decorations)
     {
         this.decorations = decorations;
     }

     public String dateT()
     {
        return dateT;
     }   
     public void dateT(String dateT)
     {
         this.dateT = dateT;
     }

     public int numberOfPeople()
     {
        return numberOfPeople;
     }   
     public void numberOfPeople(int numberOfPeople)
     {
         this.numberOfPeople = numberOfPeople;
     }

     public boolean confirm()
     {
        return confirm;
     }   
     public void confirm(boolean eventType)    // Confirm Bookings
     {
         this.confirm = confirm;
     }
     

    public Event(String EventType,double Price, String Address,String FoodSelection,String Decorations,String DateT,int NumberOfpeople,boolean Confirm )
    {
        eventType = EventType;
        address = Address;
        decorations = Decorations;                       //  Constructor for event
        dateT = DateT;
        numberOfPeople = NumberOfpeople;
        confirm = Confirm;
    }
}