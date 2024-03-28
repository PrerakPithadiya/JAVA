package OOPS.Inheritance;

public class Multi_Level {
    static class Demo1 {
        void printInfo() {
            System.out.println("This Method is in Demo1 Class!");
        }
    }

    static class Demo2 extends Demo1 {

    }

    static class Demo3 extends Demo2 {

    }

    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.printInfo();

        Demo3 d2 = new Demo3();
        d2.printInfo();
    }
}
