package Patterns;

public class Number_Diamond {
    public static void main(String[] args) {
        int rows = 5;               // Number of rows (can be adjusted)
        int spaces = 0;             // Number of spaces
        int stars = 2 * rows - 1;   // Number of stars
        int currentValue = rows;    // Value to be printed

        // Loop through each row
        for (int i = 1; i <= 2 * rows - 1; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print the numbers in the current row
            for (int j = 1; j <= stars; j++) {
                System.out.print(currentValue + " ");
            }

            // Update variables based on the current row
            if (i < rows) {
                spaces++;            // Increment spaces for the upper half
                stars -= 2;          // Decrease stars for the upper half
                currentValue--;      // Decrement the value to be printed
            } else {
                spaces--;            // Decrement spaces for the lower half
                stars += 2;          // Increase stars for the lower half
                currentValue++;      // Increment the value to be printed
            }

            // Move to the next line
            System.out.println();
        }
    }
}
