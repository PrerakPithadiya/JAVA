// Define a package for the classes
package OOPS.Interface;

// Define a class A
class Container {
    // Define a method named 'show' in class A
    public void show() {
        System.out.println("It's Show method");
    }

    // Define a non-static nested class B within class A
    class InnerClass {
        // Define a method named 'display' in class B
        public void display() {
            System.out.println("It's Display method");
        }
    }
}

// Define a class to demonstrate nested classes
class NestedClassDemo {
    // Main method
    public static void main(String[] args) {
        // Create an instance of the outer class A
        Container outerObj = new Container();
        // Call the show method of the outer class
        outerObj.show();

        // Create an instance of the non-static nested class B using the outer object
        Container.InnerClass innerObj = outerObj.new InnerClass();
        // Call the display method of the non-static nested class
        innerObj.display();
    }
}
