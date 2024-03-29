#include <stdio.h>

int main() {
    int n = 5;               // Number of rows (adjustable)
    int nsp = 0;             // Number of spaces
    int nst = 2 * n - 1;     // Number of stars
    int a = n;               // Variable for decrementing/incrementing numbers
    int i, j;

    // Loop through each row
    for (i = 1; i <= 2 * n - 1; i++) {
        // Print leading spaces
        for (j = 1; j <= nsp; j++) {
            printf("  ");
        }
        
        // Print stars
        for (j = 1; j <= nst; j++) {
            printf("%d ", a);
        }

        // Update variables based on the current row
        if (i < n) {
            nsp++;
            nst -= 2;
            a--;
        } else {
            nsp--;
            nst += 2;
            a++;
        }
        
        // Move to the next line
        printf("\n");
    }
    return 0;
}
