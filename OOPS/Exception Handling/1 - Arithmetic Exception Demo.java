package OOPS.Exception_Handling;

class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor; // Attempting to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero!");
        }
    }
}