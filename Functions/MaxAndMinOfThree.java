package Functions;

import java.util.Scanner;

public class MaxAndMinOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();
        int max = maxOfThree(a, b, c);
        int min = minOfThree(a, b, c);
        System.out.println("The Maximum of Three Numbers is : " + max);
        System.out.println("The Minimum of Three Numbers is : " + min);
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int minOfThree(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}