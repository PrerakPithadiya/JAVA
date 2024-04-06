package OOPS.Polymorphism;

public class Intro {
    static class Aeroplane {
        void takeOff() {
            System.out.println("this is aeroplane takeoff");
        }

        void fly() {
            System.out.println("this is aeroplane fly");
        }
    }

    static class Cargoplane extends Aeroplane {
        void takeOff() {
            System.out.println("this is cargoplane takeoff");
        }

        void fly() {
            System.out.println("this is cargoplane fly");
        }
    }

    static class Passengerplane extends Aeroplane {
        void takeOff() {
            System.out.println("this is passengerplane takeoff");
        }

        void fly() {
            System.out.println("this is passengerplane fly");
        }
    }

    static class Fighterplane extends Aeroplane {
        void takeOff() {
            System.out.println("this is fighterplane takeoff");
        }

        void fly() {
            System.out.println("this is fighterplane fly");
        }
    }

    static class Airport extends Aeroplane {
        void poly(Aeroplane ref) {
            ref.takeOff();
            ref.fly();
            System.out.println("--------------------------------------");
        }
    }

    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        Fighterplane fp = new Fighterplane();
        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
        a.poly(a);
    }
}