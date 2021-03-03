package PresentationLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.DocumentEvent.EventType;

import BusinessLogicLayer.*;
public class mainfile{
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Methods method = new Methods();

        System.out.println("====================| Delicious Catering |====================");
        System.out.println("To login! Please provide the information for the following fields:");
        
        //Gather client information to log in
        System.out.println("Please provide your name:");
        String name = input.nextLine();
        
        System.out.println("Please provide your surname:");
        String surname = input.nextLine();
        
        System.out.println("Please provide your cellphone number");
        String cellnum = input.nextLine();
        
        System.out.println("===============| Welcome |===============");
        System.out.println("Do you want to place a booking? (yes/no)");
        
        String option = input.nextLine();
        //option.toUpperCase();
        //gathering information from the user if they want to place a booking
        if(option.equalsIgnoreCase("YES")){
            System.out.println("===============| Booking |===============");

            System.out.println("Type of event? Wedding/ birthday parties etc.");
            String eventtype = input.nextLine();

            System.out.println("Event date and time? (The system must check the availability of the date.)");
            String date = input.nextLine();

            System.out.println("Event venue address? Capture details including phone number");
            String address = input.nextLine();

            System.out.println("How many Adults attending?");
            int numOfAdult = input.nextInt();

            System.out.println("How many Kids attending?");
            int numOfKids = input.nextInt();

            int numberOfpeople = method.numberOfpeople(numOfKids, numOfAdult);

            System.out.println("Food- selection from the menu (Adults Meal- Kids Meal- Drinks- Dessert etc.");
            String foodselection = input.nextLine();

            //if the user wants to add decoration or not with the appropriate responses
            System.out.println("Any decorations?(yes/no)");
            String decor = input.nextLine();
            String decorAdded;
            if (decor.equalsIgnoreCase("YES")) {
                System.out.println("What decorations do you want to add?");
                decorAdded = input.nextLine();
            } else {
                decorAdded = "none";
            }

            System.out.println("Do you want to confirm your booking?(yes/no)");
            String confirmAns= input.nextLine();
            if (confirmAns.equalsIgnoreCase("yes"))
            {
                double price = 1000.00;
                boolean confirmed = true;
                //Validating if the user provided adequete information and adding it to a list
                if (method.ClientValidate(name, surname, cellnum) == true) {
                    method.getClient(name, surname, cellnum); //Calling Method in business logic layer
                } else {
                    System.out.println("Empty fields or incorrect cellphone number format");
                }
                
                method.getEvent(eventtype, price, address, foodselection, decor, date, numberOfpeople,numOfKids, numOfAdult, confirmed, name);

                
            }
           
            //calling a method to calculate if the user gets a discount
            double discount = method.calculateDiscount(numberOfpeople);
            System.out.println("Your discount is: " + discount + "%");

        }
        else{
            System.out.println("Thank you for the response!");
            System.out.println("Enjoy the rest of your day!");
        }
    
    }

}