package OOPS.Inheritance;


public class InheritanceDemo {
    static class Parent {
        int parentVariable;

        Parent(int parentVariable) {
            this.parentVariable = parentVariable;
            System.out.println("Parent constructor called");
        }
    }

    static class Child extends Parent {
        int childVariable;

        Child(int parentVariable, int childVariable) {
            super(parentVariable);
            this.childVariable = childVariable;
            System.out.println("Child constructor called");
        }
    }

    public static void main(String[] args) {
        Child child = new Child(10, 20);
        System.out.println("Parent variable: " + child.parentVariable);
        System.out.println("Child variable: " + child.childVariable);
    }
}

// Explanation

// - We have a `Parent` class with a constructor that initializes an instance variable.
// - The `Child` class extends `Parent` and adds its instance variable.
// - The `Child` constructor uses `super()` to call the constructor of the `Parent` class and `this()` to initialize its instance variable.
// - In the `main` method, we create an object of `Child`, which triggers the constructors of both classes.
// - Output displays the values of both parent and child variables.
