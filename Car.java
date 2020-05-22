public class Car extends Vehicule {

    // constructors
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

     // Méthodes abstraites
    @Override
    public String doStuff(){
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
 
}