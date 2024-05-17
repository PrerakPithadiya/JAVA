package OOPS.Exercises;

class ParentChildExample {
    public static void main(String[] args) {
        // Create an instance of BaseClass class and call its methods
        BaseClass BaseClassInstance = new BaseClass();
        BaseClassInstance.displayBaseClassMessage();
        BaseClassInstance.haveFun();

        // Create an instance of DerivedClass class and call its methods
        DerivedClass DerivedClassInstance = new DerivedClass();
        DerivedClassInstance.displayDerivedClassMessage();
        DerivedClassInstance.displayBaseClassMessage();
    }
}

// BaseClass class definition
class BaseClass {
    // Method to display a message from the BaseClass class
    public void displayBaseClassMessage() {
        System.out.println("BaseClass Class: Welcome to the BaseClass class!");
    }

    // Protected method to allow access by subclasses
    void haveFun() {
        System.out.println("Let's have Fun..!");
    }
}

// DerivedClass class extending the BaseClass class
class DerivedClass extends BaseClass {
    // Method to display a message from the DerivedClass class
    public void displayDerivedClassMessage() {
        System.out.println("DerivedClass Class: Welcome to the DerivedClass class!");
    }
}