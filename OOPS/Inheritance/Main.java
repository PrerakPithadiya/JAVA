package OOPS.Inheritance;

public class Main {
    static class Parent {
        Parent() {
            System.out.println("parent class constructor!");
        }
    }

    static class Child extends Parent {
        void display() {
            System.out.println("Hello, My name is prerak!");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}