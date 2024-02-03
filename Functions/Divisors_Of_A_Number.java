package Functions;

import java.util.Scanner;

public class Divisors_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Divisors of '" + n + "' are : ");
        printDivisors(n);
    }

    public static void printDivisors(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        i--;
        for (; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print(n / i + " ");
            }
        }
    }
}