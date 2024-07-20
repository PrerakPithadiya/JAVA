package Functions;

import java.util.Scanner;

public class Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int sum = calculateSumOfTwo(a, b);
        System.out.println("Result is : " + a + " + " + b + " = " + sum);
    }

    public static int calculateSumOfTwo(int a, int b) {
        return a + b;
    }
}
