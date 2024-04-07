package OOPS.Inheritance;

public class InheritanceExample {
    static class Vehicle {
        public void move() {
            System.out.println("Vehicle is moving");
        }
    }

    static class Car extends Vehicle {
        public void move() {
            System.out.println("Car is moving");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.move();
        car.move();
    }
}
