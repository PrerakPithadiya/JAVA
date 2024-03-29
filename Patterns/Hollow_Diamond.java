package Patterns;

public class Hollow_Diamond {
    public static void main(String[] args) {
        int n = 7;
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                if (j == 1 || j == nst) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if (i < n) {
                nsp--;
                nst++;
            } else {
                nsp++;
                nst--;
            }
            System.out.println();
        }
    }
}
