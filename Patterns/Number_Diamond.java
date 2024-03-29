package Patterns;

public class Number_Diamond {
    public static void main(String[] args) {
        int n = 5;               // Number of rows (can be adjusted)
        int nsp = 0;             // Number of spaces
        int nst = 2 * n - 1;     // Number of stars
        int a = n;               // Value to be printed

        // Loop through each row
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Print leading spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Print the numbers in the current row
            for (int j = 1; j <= nst; j++) {
                System.out.print(a + " ");
            }

            // Update variables based on the current row
            if (i < n) {
                nsp++;            // Increment spaces for the upper half
                nst -= 2;         // Decrease stars for the upper half
                a--;              // Decrement the value to be printed
            } else {
                nsp--;            // Decrement spaces for the lower half
                nst += 2;         // Increase stars for the lower half
                a++;              // Increment the value to be printed
            }

            // Move to the next line
            System.out.println();
        }
    }
}
