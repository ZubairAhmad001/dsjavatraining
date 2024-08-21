package oops;
// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Regular method
    void fuelUp() {
        System.out.println("Filling up the tank.");
    }
}

// Subclass (inheriting from Vehicle)
class Car extends Vehicle {
    // Implementing the abstract method
    void start() {
        System.out.println("Car is starting with a key.");
    }
}

// Subclass (inheriting from Vehicle)
class Motorcycle extends Vehicle {
    // Implementing the abstract method
    void start() {
        System.out.println("Motorcycle is starting with a button.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // Creating objects of Car and Motorcycle
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        // Calling methods
        myCar.start(); // Outputs: Car is starting with a key.
        myMotorcycle.start(); // Outputs: Motorcycle is starting with a button.
        myCar.fuelUp(); // Outputs: Filling up the tank.
    }
}

