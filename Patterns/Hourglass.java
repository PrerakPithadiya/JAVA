package Patterns;

public class Hourglass {
    public static void main(String[] args) {
        int n = 5;
        int nsp = 0;
        int nst = n;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            if (i < n) {
                nsp++;
                nst--;
            } else {
                nsp--;
                nst++;
            }
            System.out.println();
        }
    }
}
