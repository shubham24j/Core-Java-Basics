class Z_Vehicle {
    void showVehicle() {
        System.out.println("\nIn Vehicle show");
    }
}

class Z_Car extends Z_Vehicle {
    void showCar() {
        System.out.println("In Car show");
    }
}

class Z_Bike extends Z_Vehicle {
    void showBike() {
        System.out.println("In Bike show");
    }
}

public class A10_UpcastingDowncasting {
    public static void main(String[] args) {
        // Upcasting: Creating a reference of Vehicle type and assigning a Car object
        Z_Vehicle obj = new Z_Car();  
        System.out.println("\nUpcasting with Car object:");
        obj.showVehicle();  // Vehicle's method works fine
        
        // obj.showCar(); // Error: Cannot call showCar() on a reference of type Z_Vehicle
        System.out.println("Cannot call showCar() on reference of type Z_Vehicle\n");

        // Now let's downcast to access methods from Car class
        Z_Car obj1 = (Z_Car) obj;  // Downcasting
        System.out.println("Downcasting to Car object:");
        obj1.showCar();  // Works fine since obj1 is now of type Z_Car

        // Upcasting again with Bike
        obj = new Z_Bike();  
        System.out.println("\nUpcasting with Bike object:");
        obj.showVehicle();  // Vehicle's method works fine
        
        // obj.showBike(); // Error: Cannot call showBike() on a reference of type Z_Vehicle
        System.out.println("Cannot call showBike() on reference of type Z_Vehicle\n");

        // Downcasting to Bike class
        Z_Bike obj2 = (Z_Bike) obj;  // Downcasting
        System.out.println("Downcasting to Bike object:");
        obj2.showBike();  // Works fine since obj2 is now of type Z_Bike
    }
}
