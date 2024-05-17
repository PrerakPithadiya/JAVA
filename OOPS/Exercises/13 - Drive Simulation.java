package OOPS.Exercises;

// Entry point of the program
class DriveSimulation {
    public static void main(String[] args) {
        // Create Vehicle object
        Vehicle vehicle = new Vehicle();
        // Simulate driving the vehicle
        vehicle.drive();

        // Create Bus object
        Bus Bus = new Bus();
        // Simulate driving the Bus
        Bus.drive();
    }
}

// Base class representing a vehicle
class Vehicle {
    // Method to simulate driving the vehicle
    public void drive() {
        System.out.println("Vehicle is running on the road.");
    }
}

// Class representing a specific type of vehicle: Bus
class Bus extends Vehicle {
    // Override method to simulate driving a Bus
    @Override
    public void drive() {
        System.out.println("Bus is being driven.");
    }
}
