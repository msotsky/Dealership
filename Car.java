/**
 * class representing a Car
 * @extends abstract class Vehicle
 * 
 * @author Maxime Sotsky 3637964
 */
public class Car extends Vehicle {

    /**number of doors the car has either 2 or 4 */
    private int numDoors;
    /** the type of car, whether it is a hatchback or trunk */
    private char type;
    /** the price of the car*/
    private double price;
    
    /**
     * The car constructor
     * @param code - represents the vehicle code
     * @param mileage -represents the vehicle Mileage
     * @param numDoors -represents the number of doors the car has 2 or 4
     * @param type - represents the type of of car, wheter it is a hatchback or trunk
     */
    public Car(String code, int mileage, int numDoors, char type){
        super(code,mileage);
        this.numDoors = numDoors;
        this.type = type;
        this.price = calculatePrice();
    }
    /**
     * method to calculate the car price
     * @return car prince represented as double
     */
    public double calculatePrice(){
        price = 10000;
        if(this.numDoors == 4){
            price = price * 1.05;
        }
        if(this.type == 'H'){
            price = price + + 1000;
        }
        return price;
    }
    /**
     * accessor method for car price
     * @return car price as double
     */
    public double getPrice(){
        return this.price;
    }
}
