package OOPS.Polymorphism;

// Main class
public class PolymorphismDemo {
    // Parent class
    static class Animal {
        public void makeSound() {
            System.out.println("Some sound");
        }
    }

    // Subclass 1
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    // Subclass 2
    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        // Creating objects of different subclasses
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling the overridden method
        animal1.makeSound();
        animal2.makeSound();
    }
}
