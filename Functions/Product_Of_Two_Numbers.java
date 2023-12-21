package Functions;

import java.util.Scanner;

public class Product_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int product = calculateProductOfTwo(a, b);
        System.out.println("The Product of Two Numbers is : " + product);
    }

    public static int calculateProductOfTwo(int a, int b) {
        return a * b;
    }
}