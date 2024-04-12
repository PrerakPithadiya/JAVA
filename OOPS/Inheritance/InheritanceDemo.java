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