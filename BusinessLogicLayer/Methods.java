package BusinessLogicLayer;

import java.util.*;
import DataAccessLayer.*;

public class Methods {
   //TODO enter processing methods here 

   Database database = new Database();
   public Methods(){}

   
   public boolean ClientValidate(String name, String surname, String cellnum){
      if (name.isEmpty() || surname.isEmpty() || cellnum.isEmpty() || validatePhoneNumber(cellnum) == false) {
         return false;
      }
      else{
         return true;  
      }
   }
 
   //NOK = Number of kids
   //NOA = Number of adults
   public int numberOfpeople(int NOK, int NOA){
      int numberOfpeople = NOK + NOA;

      return numberOfpeople;
   }
   public boolean validatePhoneNumber(String phoneNumber){
    String patterns 
    = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
    + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
    + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";
    if(phoneNumber.matches(patterns))
        return true;
    else
        return false;
   }

   public void getClient(String n, String s, String c){//method called in mainfile
      database.clientAdd(n, s, c);//calling method in data link layer
   }

  public  List<Event> eventList = new ArrayList<Event>();  // Puts the event into a list 
   public List<Event> getevetn(Event event)
   {
      eventList.add(event);
      return eventList;
   }

   public double discount;      
 
   public double calculateDiscount(int numberOfpeople) 
   {
     if (numberOfpeople > 40 )
     {
        discount = 15;
        return discount;
     }
     else
     {
      discount = 0;
        return discount;
     }
   }


   Database db = new Database();
   public void getclientList(List<Client> cList){
      db.getListofCliet(cList);
   }


   public void geteventList(List<Event> eList)
   {
      db.getListofEvent(eList);
   }

}
