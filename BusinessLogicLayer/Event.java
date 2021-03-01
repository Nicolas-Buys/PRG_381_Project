package BusinessLogicLayer;

import java.sql.*;
import java.util.*;
import DataAccessLayer.*;
public class Event {

 private String eventType,address,venueName,cellNumber,foodSelection,decorations;
 private String dateT;
 private boolean confirm;
 private int numberOfpeople,numberOfkids,numberOfAdults;// Number of people = number of kids + number of adults 
 

    //Properties

     public String geteventType()
     {
        return eventType;
     }   
     public void seteventType(String eventType)
     {
         this.eventType = eventType;
     }

     public String address()
     {
        return address;
     }   
     public void address(String address)
     {
         this.address = address;
     }

     public String venueName()
     {
        return venueName;
     }   
     public void veneuName(String venueName)
     {
         this.venueName = venueName;
     }

     public String cellNumber()
     {
        return cellNumber;
     }   
     public void cellNumber(String cellNumber)
     {
         this.cellNumber = cellNumber;
     }

     public String foodSelection()
     {
        return foodSelection;
     }   
     public void foodSelection(String foodSelection)
     {
         this.foodSelection = foodSelection;
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

     public int numberOfpeople()
     {
        return numberOfpeople;
     }   
     public void numberOfpeople(int numberOfpeople)
     {
         this.numberOfpeople = numberOfpeople;
     }

     public int numberOfkids()
     {
        return numberOfkids;
     }   
     public void numberOfkids(int numberOfkids)
     {
         this.numberOfkids = numberOfkids;
     }

     public int numberOfAdults()
     {
        return numberOfAdults;
     }   
     public void numberOfAdults(int numberOfAdults)
     {
         this.numberOfAdults = numberOfAdults;
     }

     public boolean confirm()
     {
        return confirm;
     }   
     public void confirm(boolean eventType)    // Confirm Bookings
     {
         this.confirm = confirm;
     }
     
     

    
 

    public Event(String EventType, String Address,String VenueName,String CellNumber,String FoodSelection,String Decorations,String DateT,int NumberOfpeople,int NumberOfkids,int NumberOfAdults,boolean Confirm )
    {

        eventType = EventType;
        address = Address;
        venueName = VenueName;
        cellNumber = CellNumber;
        foodSelection = FoodSelection;
        decorations = Decorations;                       //  Constructor for event
        dateT = DateT;
        numberOfpeople = NumberOfpeople;
        numberOfkids = NumberOfkids;
        numberOfAdults = NumberOfAdults;
        confirm = Confirm;



    }

  

   
    

 



    
}