package OOPS.Exercises;

class VehicleDrivingDemo {
    static class Vehicle {
        public void drive() {
            System.out.println("Vehicle is Running on the Vehicle!");
        }
    }

    static class Car {
        public void drive() {
            System.out.println("Repairing a Car!");
        }
    }

    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();
        obj1.drive();

        Car obj2 = new Car();
        obj2.drive();
    }
}