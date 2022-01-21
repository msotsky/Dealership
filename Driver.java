import java.io.*;
/**
 * driver class for testing Vehicle, Dealership, Car, Van, Truck, and Sorter classes
 * @author Maxime Sotsky 3637964
 */
public class Driver{

    /**
     * main method testing Vehicle, Dealership, Car, Van, Truck, and Sorter classes
     * @throws FileNotFoundException - file not found
     * @param args - list of input, in this case, one inventory.dat file
     */
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File(args[0]);
        Dealership dealer = new Dealership(file);
        System.out.println(dealer.toString());

        Vehicle[] cloneList = dealer.copyInventory();
        Sorter<Vehicle> sorter = new Sorter<>();
        sorter.selectionSort(cloneList);
        System.out.print(dealer.toString(cloneList));

        //3 test cases (inventory.dat , inventory2.dat , inventory3.dat)

        /*
        System.out.println(dealer.isFound(dealer.searchVehicle("V5532")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C3917")));
        System.out.println(dealer.isFound(dealer.searchVehicle("T4908")));
        */
        /*
        System.out.println(dealer.isFound(dealer.searchVehicle("C3913")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C3910")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C1111")));
        */
        ///*
        System.out.println(dealer.isFound(dealer.searchVehicle("T3321")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C1234")));
        System.out.println(dealer.isFound(dealer.searchVehicle("V8000")));
        System.out.println(dealer.isFound(dealer.searchVehicle("V2222")));
        System.out.println(dealer.isFound(dealer.searchVehicle("T2222")));
        System.out.println(dealer.isFound(dealer.searchVehicle("T0000")));
        System.out.println(dealer.isFound(dealer.searchVehicle("V0000")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C0000")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C4321")));
        System.out.println(dealer.isFound(dealer.searchVehicle("C1111")));
        //*/
        

    }

}