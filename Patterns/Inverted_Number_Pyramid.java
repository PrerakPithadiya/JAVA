package Patterns;

public class Inverted_Number_Pyramid {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i - 1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
