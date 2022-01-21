/**
 * class representing a Truck
 * @extends abstract class Vehicle
 * 
 * @author Maxime Sotsky 3637964
 */
public class Truck extends Vehicle {
    
    /**string representation of truck's bedSize either standard, short, long */
    private String bedSize;
    /** truck prince represented as a double */
    private double price;

    /**
     * truck constructor
     * @param code represents the Vehicle
     * @param mileage represents the vehicle mileage
     * @param bedSize represents the size of the bed on the truck
     */
    public Truck (String code, int mileage, String bedSize){
        super(code,mileage);
        this.bedSize = bedSize;
        this.price = calculatePrice();
    }

    /**
     * method to calculate the truck value
     * @return the calculated price as a double
     */
    public double calculatePrice(){
        price = 50000;
        if (this.bedSize.equals("short")){
            price = price * 0.9;
        }
        else if (this.bedSize.equals("long")){
            price = price * 1.1;
        }
        else{
            return price;
        }
        return price;
    }
    /**
     * accessor method for price
     * @return double value representing truck price
     */
    public double getPrice(){
        return this.price;
    }
}
