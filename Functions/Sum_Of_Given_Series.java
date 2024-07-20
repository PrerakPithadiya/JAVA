package Functions;

import java.util.Scanner;

public class Sum_Of_Given_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Terms : ");
        int n = sc.nextInt();
        int sum = calculateSumOfSeries(n);
        System.out.println("The Sum of Series is : " + sum);
    }

    public static int calculateSumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (factorial(i) / i);
        }
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}