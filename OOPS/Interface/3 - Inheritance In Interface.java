package OOPS.Interface;

interface Bike {
    void displayInfo();
}

interface Car {
    void showDetails();
}

class Vehicle implements Bike, Car {
    public void displayInfo() {
        System.out.println("The Bike have 2 Wheels.");
    }

    public void showDetails() {
        System.out.println("The Car have 4 Wheels.");
    }
}

class InheritanceInInterface {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.displayInfo();
        obj.showDetails();
    }
}