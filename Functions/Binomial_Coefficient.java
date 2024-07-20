package Functions;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of 'n' : ");
        int n = sc.nextInt();
        System.out.print("Enter the Value of 'r' : ");
        int r = sc.nextInt();
        int binCoeff = calculateBinomialCoefficient(n, r);
        System.out.print("The Binomial Coefficient is : ");
        System.out.println(binCoeff);
        sc.close();
    }

    public static int calculateBinomialCoefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        return n_fact / (r_fact * n_r_fact);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}