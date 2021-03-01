package PresentationLayer;

import java.util.List;
import java.util.Scanner;

import BusinessLogicLayer.*;
public class mainfile{
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Methods method = new Methods();

        System.out.println("====================| Delicious Catering |====================");
        System.out.println("To login! Please provide the information for the following fields:");
        
        System.out.println("Please provide your name:");
        String name = input.nextLine();
        
        System.out.println("Please provide your surname:");
        String surname = input.nextLine();
        
        System.out.println("Please provide your cellphone number");
        String cellnum = input.nextLine();

        List<Client> cList = new ArrayList<Client>();
        if (method.ClientValidate(name, surname, cellnum) == true) {
            cList.add(new Client(name, surname, cellnum));
        } else {
            System.out.println("Empty fields or incorrect cellphone number format");
        }
        
        
        
        System.out.println("===============| Welcome |===============");
        System.out.println("Do you want to place a booking? (yes/no)");
        
        String option = input.nextLine();

        if(option.toUpperCase() == "YES"){
            System.out.println("===============| Booking |===============");

        }
        else{
            System.out.println("Thank you for the response!");
            System.out.println("Enjoy the rest of your day!");
        }

        

        Database database = new Database();
        database.Databasetest();
            
    
}
}