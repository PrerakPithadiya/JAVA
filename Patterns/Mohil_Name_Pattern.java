package Patterns;

public class Mohil_Name_Pattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            // alphabet M
            for (int j = 1; j <= n; j++) {
                if (
                    (j == 1) ||
                    ((j == i || j == n + 1 - i) && i <= n / 2 + 1) ||
                    (j == n)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            // alphabet O
            for (int j = 1; j <= n; j++) {
                if (
                    ((i == 1 || i == n) && j > 1 && j < n) || 
                    ((j == 1 || j == n) && i > 1 && i < n)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            // alphabet H
            for (int j = 1; j <= n; j++) {
                if (
                    (j == 1) ||
                    (j == n) ||
                    (i == n / 2 + 1)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  
                }
            }

            System.out.print("  ");

            // alphabet I
            for (int j = 1; j <= n; j++) {
                if (
                    (i == 1) ||
                    (i == n) ||
                    (j == n / 2 + 1)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            // alphabet L
            for (int j = 1; j <= n; j++) {
                if (
                    (j == 1) || 
                    (i == n)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
