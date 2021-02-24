import java.util.*;

public class Methods {
   //TODO enter processing methods here 

   Client client;
   public void ClientValidate(String name, String surname, String CNumber){
      if (name.isEmpty() || surname.isEmpty()) {
         System.out.println("Name or Surname is empty");
      } else {
         System.out.println("Name and Surname recorded");
      } 
   }
 
   public int numberOfpeople(int NOK, int NOA){
      int numberOfpeople = NOK + NOA;

      return numberOfpeople;
   }
}
