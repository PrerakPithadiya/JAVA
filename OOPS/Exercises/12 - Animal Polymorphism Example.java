package OOPS.Exercises;

// Entry point of the program
class SoundMaker {
    public static void main(String[] args) {
        // Create Animal object
        Animal animal = new Animal();
        // Make the animal sound
        animal.produceSound();

        // Create Cat object
        Cat cat = new Cat();
        // Make the cat sound
        cat.produceSound();
    }
}

// Base class representing an animal
class Animal {
    // Method to produce sound of the animal
    public void produceSound() {
        System.out.println("Generic animal sound.");
    }
}

// Class representing a specific type of animal: Cat
class Cat extends Animal {
    // Method to produce sound of a cat
    public void produceSound() {
        System.out.println("Meow!");
    }
}