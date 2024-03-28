package OOPS.Inheritance;

public class Overriding_Method {
    // Superclass
    static class Animal {
        void makeSound() {
            System.out.println("Some generic sound");
        }
    }

    // Subclass
    static class Dog extends Animal {
        // Override makeSound method
        void makeSound() {
            System.out.println("Woof");
        }
    }

    // Another subclass
    static class Cat extends Animal {
        // Override makeSound method
        void makeSound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); // Create a Dog object but hold it in an Animal reference
        Cat cat = new Cat(); // Create a Cat object but hold it in an Animal reference

        dog.makeSound(); // This will call Dog's makeSound method
        cat.makeSound(); // This will call Cat's makeSound method
    }
}
