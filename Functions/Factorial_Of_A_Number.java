package Functions;

import java.util.Scanner;

public class Factorial_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("The given Number is Invalid!!!");
            return;
        }
        long factorial = calculateFactorial(n);
        System.out.println("The Factorial of " + n + " is : " + factorial);
    }

    public static long calculateFactorial(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
}