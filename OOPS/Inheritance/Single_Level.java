package OOPS.Inheritance;

public class Single_Level {
    static class Parent {
        String name;

        void printInfo() {
            System.out.println("The Properties and Members has been Inherited!");
        }
    }

    static class Child extends Parent {

    }

    public static void main(String[] args) {
        Child c = new Child();
        c.name = "Rahul";
        System.out.println("The Name is : " + c.name);
        c.printInfo();
    }
}
