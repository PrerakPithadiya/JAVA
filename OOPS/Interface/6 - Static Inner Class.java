// Define a package for the classes
package OOPS.Interface;

// Define a class A
class OuterClass {
    // Define a method named 'show' in class A
    public void show() {
        System.out.println("It's Show Method");
    }

    // Define a static nested class B within class A
    static class InnerClass {
        // Define a method named 'display' in class B
        public void display() {
            System.out.println("It's Display Method");
        }
    }
}

// Define a class to demonstrate static inner classes
class StaticInnerClassDemo {
    // Main method
    public static void main(String[] args) {
        // Create an instance of the outer class A
        OuterClass outerObj = new OuterClass();
        // Call the show method of the outer class
        outerObj.show();

        // Create an instance of the static nested class B
        OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
        // Call the display method of the static nested class
        innerObj.display();
    }
}