package Patterns.PrerakPatterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 5; // Total number of rows
        int nsp = n - 1; // Number of spaces initially
        int nst = 1; // Number of stars initially

        // Loop for each row of the diamond
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Printing leading spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Printing stars and spaces
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            // Adjusting number of spaces and stars for the next row
            if (i < n) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }

            // Move to the next line
            System.out.println();
        }
    }
}