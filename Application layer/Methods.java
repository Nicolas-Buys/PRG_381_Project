import java.util.*;

public class Methods {
   //TODO enter processing methods here 

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

   public List<Client> getClient(String n, String s, String c){
      List<Client> cList = new ArrayList<Client>();

      cList.add(new Client(n, s, c));

      return cList;
   }

}
