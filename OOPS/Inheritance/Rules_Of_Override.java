package OOPS.Inheritance;

public class Rules_Of_Override {
    static class Parent {
        public static void display(float a) {
            System.out.println("Rohan is Running!");
        }
    }

    static class Child extends Parent {
        public static void display(int a) {
            System.out.println("Rahul is Running!"); 
        }
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display(1.1f);
        Child obj = new Child();
        obj.display(1);
    }
}
