package OOPS.Interface;

// Define an interface
interface Animal2 {
    void eat();

    void sleep();
}

// Implement the interface in a class
class Dog implements Animal2 {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Another class implementing the same interface
class Cat implements Animal2 {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

// Main class to test the interface
class InterfaceDemo {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call methods defined in the interface
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
