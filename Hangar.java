import java.util.*;


public class Hangar {

    public static void main(String[] args) {
		
      
       	Vehicule[] myVehicules = {new Car("Seat", 310000),new Car("Volkswagen", 312000), new Boat("Zodiac", 12500), new Boat("Decathlon", 12500)};
       
      	for (Vehicule myVehicule : myVehicules){
        	System.out.println(myVehicule.doStuff());
		}
        
    }
 
}