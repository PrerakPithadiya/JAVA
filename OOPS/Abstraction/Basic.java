package OOPS.Abstraction;

public class Basic {
    abstract static class Aeroplane {
        abstract public void takeOff();
    }

    static class CargoPlane extends Aeroplane {
        public void takeOff() {
            System.out.println("Hello, It's takeOff - Overridden Method!");
        }
    }

    public static void main(String[] args) {
        Aeroplane obj = new CargoPlane();
        obj.takeOff();
    }
}