import java.util.*;

public abstract class Vehicule {

    // attributes
    private String brand;
    private int kilometers;
  
  	// constructors
    public Vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }
  
  	
     // getters
    public String getBrand() {
        return this.brand;
    } 
         
    public int getKilometers() {
        return this.kilometers;
    } 
      
    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }


    
    // Méthodes abstraites
    public abstract String doStuff(); 
     

  
}