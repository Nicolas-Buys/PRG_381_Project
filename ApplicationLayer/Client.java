<<<<<<< HEAD:Application layer/Client.java
 import java.util.*;
=======
package ApplicationLayer;

import java.util.*;
>>>>>>> bb2c5440c6d9c8fc9ef16b61d9f0413930a4d11c:ApplicationLayer/Client.java

public class Client {
    String name, surname, cellNumber;

    // Property for name field
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    // property for surname field
    public String getSurname(){
        return surname;
    }
    public void setSurname(String s){
        this.surname = s;
    }

    // porperty for cell number
    public String getCellNumber(){
        return cellNumber;
    }
    public void setCellNumber(String c){
        this.cellNumber = c;
    }

    //constructor for client class
    public Client(String n, String s, String c){
        this.name = n;
        this.surname = s;
        this.cellNumber = c;
    }

    // Empty constructor for creating objects of this class without having parameters
    public Client(){

    }
}
