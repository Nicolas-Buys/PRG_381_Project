import java.sql.Date;

public class Event {

public String eventType,address,veneuName,cellNumber,foodSelection,decorations;
 public String dateT;
 public int numberOfpeople,numberOfkids,numberOfAdults;// Number of people = number of kids + number of adults 
 
                                 
 
 

    public Event(String EventType, String Address,String VeneuName,String CellNumber,String FoodSelection,String Decorations,String DateT,int NumberOfpeople,int NumberOfkids,int NumberOfAdults )
    {

        eventType = EventType;
        address = Address;
        veneuName = VeneuName;
        cellNumber = CellNumber;
        foodSelection = FoodSelection;
        decorations = Decorations;                       //  Constructor for event
        dateT = DateT;
        numberOfpeople = NumberOfpeople;
        numberOfkids = NumberOfkids;
        numberOfAdults = NumberOfAdults;



    }


 



    
}