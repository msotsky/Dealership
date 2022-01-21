import java.text.NumberFormat;
/**
 * This class represents a vehicle object
 * 
 * @author Maxime Sotsky 3637964
 */
public abstract class Vehicle extends java.lang.Object implements java.lang.Comparable<Vehicle>{

    /**vehicle code */
    private java.lang.String code;
    /** vehicle mileage */
    private int mileage;
    /** corrent currency format */
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    /**Construct for vehicle object
     * @param code - vehicle  code represented as a String
     * @param mileage - vehicle past mileage
     */
    public Vehicle(java.lang.String code, int mileage){
        this.code = code;
        this.mileage = mileage;
    }
    /**Abstract method to calcualte price of a vehicle
     * @return double representing the vehicle price
     */
    abstract double calculatePrice();
    /**Overriden compare method tailored to vehicle objects
     * @param other - represents the vehicle that is being comparaed with this Vehicle
     * @return integer representing whether the vehicles differ
     */
    @Override
    public int compareTo(Vehicle other){
        if(this.calculatePrice() > 0)

        if(Character.compare(this.code.charAt(0),other.code.charAt(0)) > 0){
            return 1;
        }
        else if(Character.compare(this.code.charAt(0),other.code.charAt(0)) < 0){
            return -1;
        }
        else if(this.calculatePrice() > other.calculatePrice()){
            return 1;
        }
        else if (this.calculatePrice() < other.calculatePrice()){
            return -1;
        }
        return 0;

    }  
    /**Accessor method for vehicle code
     * @return string representing vehicle code
     */
    public java.lang.String getCode(){
        return this.code;
    }
    /**Accessor method for vehicle Mileage
     * @return integer representing vehicle mileage
    */
    public int getMileage(){
        return this.mileage;
    }
    /**
     * method that updates vehicle mileage when taken out for a test drive
     * @param distance - the distance driven during test drive
     */
    public void testDrive(int distance){
        this.mileage += distance;
    }
    /**
     * Abstract method Accessor for vehicle price
     * @return the price of the specified vehicle
     */
    public abstract double getPrice();
    /**
     * toString method for vehicles
     * displaying mileage with the calculated costs of each vehicle
     * @return string representing mileage and calculated prince of each vehicle
     */
    public java.lang.String toString(){
        return this.code + " Mileage: " + this.mileage +
         "\n      Cost: " + fmt.format(this.calculatePrice());
    }
}
