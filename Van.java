/**
 * class representing a Van
 * @extends abstract class Vehicle
 * 
 * @author Maxime Sotsky 3637964
 */
public class Van extends Vehicle{

    /** the price of the van represented as a double */
    private double price;
    /** boolean value representing whether the van has or has not electric door closures*/
    private boolean electricDoorClosure;

    /**
     * van constructor
     * @param code - represents the Vehicle code
     * @param mileage -represents the vehicle mileage
     * @param electricDoorClosure -boolean whether the van has electric doors or not
     */
    public Van(String code, int mileage, boolean electricDoorClosure){
        super(code,mileage);
        this.electricDoorClosure = electricDoorClosure;
        this.price = calculatePrice();
    }
    /**
     * method to calculate van price
     * @return double representing van price
     */
    public double calculatePrice(){
        price = 25000;
        if(this.electricDoorClosure){
            price = price * 1.15;
        }
        return price;
    }
    /**
     * accessor method for van price
     * @return double representing van price
     */
    public double getPrice(){
        return price;
    }
}
