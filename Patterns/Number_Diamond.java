package Patterns;

public class Number_Diamond {
    public static void main(String[] args) {
        int numberOfRows = 5;               // Number of rows (can be adjusted)
        int numberOfSpaces = 0;             // Number of spaces
        int numberOfStars = 2 * numberOfRows - 1;     // Number of stars
        int currentValue = numberOfRows;               // Value to be printed

        // Loop through each row
        for (int i = 1; i <= 2 * numberOfRows - 1; i++) {
            // Print leading spaces
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print("  ");
            }

            // Print the numbers in the current row
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print(currentValue + " ");
            }

            // Update variables based on the current row
            if (i < numberOfRows) {
                numberOfSpaces++;            // Increment spaces for the upper half
                numberOfStars -= 2;         // Decrease stars for the upper half
                currentValue--;              // Decrement the value to be printed
            } else {
                numberOfSpaces--;            // Decrement spaces for the lower half
                numberOfStars += 2;         // Increase stars for the lower half
                currentValue++;              // Increment the value to be printed
            }

            // Move to the next line
            System.out.println();
        }
    }
}
