package Patterns;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int n = 5;
        int val = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    val = 1;
                } else {
                    val = val * (i - j + 1) / (j - 1);
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}