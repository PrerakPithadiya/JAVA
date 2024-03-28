package OOPS.Inheritance;

public class Inherited_Method {
    // Parent class
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class inheriting from Animal
    static class Dog extends Animal {
        // This class inherits the sound() method from Animal
        public void breed() {
            System.out.println("I am a dog");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // inherited method
        myDog.breed(); // method defined in Dog class
    }
}
