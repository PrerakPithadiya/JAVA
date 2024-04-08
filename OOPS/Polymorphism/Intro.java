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

// Explanation of the given code

// 1. The code defines a package `OOPS.Polymorphism`.

// 2. Inside this package, there's a class named `Intro`, which contains several nested static classes representing different types of airplanes: `Aeroplane`, `Cargoplane`, `Passengerplane`, `Fighterplane`, and `Airport`.

// 3. Each type of airplane (subclasses of `Aeroplane`) has two methods: `takeOff()` and `fly()`. These methods are overridden in the subclasses to provide specific implementations.

// 4. The `Airport` class also contains a method named `poly(Aeroplane ref)`. This method takes an object of type `Aeroplane` as a parameter and demonstrates polymorphic behavior by calling the `takeOff()` and `fly()` methods on the passed object.

// 5. In the `main` method:

//    - Objects of type `Cargoplane`, `Passengerplane`, `Fighterplane`, and `Airport` are instantiated.
//    - The `poly` method of the `Airport` object `a` is called multiple times with different types of airplanes (`Cargoplane`, `Passengerplane`, `Fighterplane`) and with itself (`Airport`). This demonstrates polymorphism, where the method behaves differently based on the type of object passed to it.

// 6. When `poly` is called with a `Cargoplane` object, it prints "this is cargoplane takeoff" and "this is cargoplane fly".
   
// 7. When `poly` is called with a `Passengerplane` object, it prints "this is passengerplane takeoff" and "this is passengerplane fly".

// 8. When `poly` is called with a `Fighterplane` object, it prints "this is fighterplane takeoff" and "this is fighterplane fly".

// 9. When `poly` is called with an `Airport` object, it prints "this is aeroplane takeoff" and "this is aeroplane fly". This happens because `Airport` is a subclass of `Aeroplane` and it inherits the `takeOff()` and `fly()` methods from `Aeroplane`. However, it's not typically a good practice to include an `Airport` in the hierarchy of airplanes as it's not an airplane itself, but for the sake of demonstrating polymorphism, it serves the purpose.
