import java.util.*;
import java.io.*;
import java.text.NumberFormat;
/**
 * Class representing a dealership object
 * a dealership has vehicles
 * 
 * @author Maxime Sotsky 3637964
 */
public class Dealership {

    /**name of dealership */
    private String name;
    /**dealership vehicle list */
    private Vehicle[] inventory;
    /** correct price formatting */
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    /**dealership constructor
     * @param file - the input file where dealership info is stored
     * @throws FileNotFoundException - if the file is not found
     */
    public Dealership(File file) throws FileNotFoundException{

        Scanner sc = new Scanner(file);
        this.name = sc.nextLine();
        int size = sc.nextInt();
        this.inventory = new Vehicle[size];

        for(int i = 0; sc.hasNextLine() && i < size; i++){

            String code = sc.next();
            if(code.charAt(0) == 'C' && sc.hasNextInt()){
                this.inventory[i] = new Car(code, sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
            }
                
            else if(code.charAt(0)== 'T' && sc.hasNextInt()){
                this.inventory[i] = new Truck(code, sc.nextInt(), sc.next());
            }
                
            else if(code.charAt(0)== 'V' && sc.hasNextInt()){
                this.inventory[i] = new Van(code, sc.nextInt(), sc.nextBoolean());  
            }                  
        }
        sc.close();
    }
    /**
     * method to clone a dealerships vehicle list
     * this method is used along with sorting algorithms in sorter class
     * @rethrn the vehicle list clone
     */
    public Vehicle[] copyInventory(){
        return this.inventory.clone();
    }
    /**
     * method to search for a given vehicle in dealership vehicle list
     * @param code - the code the the vehicle that is searched for
     * @return the vehicle if it is found
     */
    public Vehicle searchVehicle(String code){ //java.lang.String code ?
        for(int i = 0; i < this.inventory.length; i++){
            if(this.inventory[i].getCode().equals(code)){
                return this.inventory[i];
            }
        }
        return null;
    }
    /**
     * method helper for displaying whether or not the vehicle is found when searching
     * @param x - the vehicle (oject since we are only testing whether it is null)
     * @return string representing whether vehicle is found or not
     */
    public String isFound(Object x){
        if(x == null){
            return "Vehicle not found";
        }else{
            return "Vehicle found";
        }
    }

    /**
     * method to print inventory list of a dealerships
     * @return a string representing a dealership list information
     */
    public String toString(){
        String str = this.name + '\n';
        for(int i = 0; i < this.inventory.length; i++){
            str = str + this.inventory[i].toString() + '\n';
        }
        return str;
    }
    /**
     * method to print sorted dealership list (the sorted clone list)
     * @return a string representing a the contents of the sorted clone list
     */
    public String toString(Vehicle[] list){
        String str = this.name + '\n';
        for(int i = 0; i < list.length; i++){
            str = str + list[i].getCode() + '\t' + fmt.format(list[i].getPrice()) + "\n\n";
        }
        return str;
    }

}
