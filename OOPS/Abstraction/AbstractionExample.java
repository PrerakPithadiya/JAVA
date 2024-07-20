abstract class Animal {
    // Abstract method for making a sound
    abstract void makeSound();
}

class Dog extends Animal {
    // Providing implementation for the abstract method makeSound()
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Calling the makeSound method on the Dog object
        myDog.makeSound();
    }
}

// - The Animal class is declared as abstract, containing an abstract method
// makeSound(). Abstract methods are defined without implementation and must be
// overridden by concrete subclasses.
// - The Dog class extends the Animal class and provides an implementation for
// the makeSound() method by overriding it.
// - In the main() method, an object of the Dog class is created.
// - The makeSound() method is called on the Dog object, which prints "Woof
// Woof!" demonstrating the polymorphic behavior where the appropriate method
// implementation is selected at runtime based on the actual object type.
