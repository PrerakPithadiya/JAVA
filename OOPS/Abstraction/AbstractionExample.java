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

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();
        
        // Calling the makeSound method on the Dog object
        myDog.makeSound();
    }
}
