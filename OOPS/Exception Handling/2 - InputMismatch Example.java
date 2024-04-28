package OOPS.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter an integer: ");
            int number = scanner.nextInt(); // Try to read an integer

            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Please enter a valid integer.");
            // Clear the invalid input from the scanner
            scanner.next();
        } finally {
            scanner.close();
        }
    }
}