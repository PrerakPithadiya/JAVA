// Define a package for the classes
package OOPS.Interface;

// Define a Car interface
interface Transportation {
    // Declare a method signature for driving
    void drive();

    // Declare a method signature for parking
    void park();
}

// Define a class to demonstrate anonymous inner classes
class AnonymousInnerClass {
    // Main method
    public static void main(String[] args) {
        // Create an instance of the Transportation interface using an anonymous inner class
        Transportation car = new Transportation() {
            // Implement the drive method
            public void drive() {
                System.out.println("Driver is Driving the Car.");
            }

            // Implement the park method
            public void park() {
                System.out.println("Car is parked.");
                // Implement parking functionality
            }
        };

        // Invoke the drive method of the anonymous inner class instance
        car.drive();

        // Invoke the park method of the anonymous inner class instance
        car.park();
    }
}