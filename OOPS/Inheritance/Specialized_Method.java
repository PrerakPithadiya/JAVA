package OOPS.Inheritance;

public class Specialized_Method {
    static class Parent {

    }

    static class Child extends Parent {
        // this is specialized method, because it's present only in child class (not in parent class)
        void display() {
            System.out.println("This is Specialized Method!");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}