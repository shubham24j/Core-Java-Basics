class Z_Vehicle {
    void start() {
        System.out.println("\nVehicle is starting");
    }
}

class Z_Car extends Z_Vehicle {
    void start() {
        System.out.println("Car is starting");
    }

    void openSunroof() {
        System.out.println("Car's sunroof is opened");
    }
}

class Z_Bike extends Z_Vehicle {
    void start() {
        System.out.println("Bike is starting");
    }

    int wheels = 2;  // This is specific to Bike
}

public class A09_DynamicMethodDispatch {
    public static void main(String[] args) {
        // Creating Vehicle object and calling its start method
        Z_Vehicle vehicle = new Z_Vehicle();
        vehicle.start();  // Calls Vehicle's start method

        // Demonstrating Dynamic Method Dispatch with Car and Bike
        vehicle = new Z_Car(); // Vehicle reference, Car object
        vehicle.start(); // Calls Car's start method because of dynamic dispatch
        
        vehicle = new Z_Bike(); // Vehicle reference, Bike object
        vehicle.start(); // Calls Bike's start method because of dynamic dispatch

        // Demonstrating reference of parent class and object of child class
        Z_Vehicle vehicle2 = new Z_Car(); // Vehicle reference, Car object
        vehicle2.start(); // Valid, calls Car's start method

        // Attempting to call a method not present in Vehicle
        // vehicle2.openSunroof(); // This will cause a compile-time error!
        
        // Attempting to access a variable not present in Vehicle
        // System.out.println(vehicle2.wheels);  // This will also cause a compile-time error!
        
        // Correct way: Create reference of child class to access child-specific methods
        Z_Bike bike = new Z_Bike(); // Create a Bike object
        bike.start();  // Valid, calls Bike's start method
        System.out.println("Bike's wheels: " + bike.wheels); // Correctly access 'wheels' in Bike
    }
}
