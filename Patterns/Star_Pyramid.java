package Patterns;

public class Star_Pyramid {
    public static void main(String[] args) {
        int numberOfRows = 7; // Number of rows (can be adjusted)

        // Loop through each row
        for (int i = 1; i <= numberOfRows; i++) {
            // Print leading spaces
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
