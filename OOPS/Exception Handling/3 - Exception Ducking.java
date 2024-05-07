package OOPS.Exception_Handling;

class ExceptionDucking {
    public static void main(String[] args) throws ArithmeticException {
        try {
            a();
        } catch (ArithmeticException e) {
            System.out.println("We have divided by zero.");
        }
//        a();
    }

    public static void a() throws ArithmeticException {
        // try {
        //     b();
        // } catch (ArithmeticException e) {
        //     System.out.println("We have divided by zero.");
        // }
        b();
    }

    public static void b() throws ArithmeticException {
        // try {
        //     System.out.println(5 / 0);
        // } catch (ArithmeticException e) {
        //     System.out.println("We have divided by zero.");
        // }
        System.out.println(5 / 0);
    }
}