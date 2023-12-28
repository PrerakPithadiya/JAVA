package Loops;

import java.util.Scanner;

public class HCF_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int hCF = calculateHCF(a, b);
        System.out.println("The HCF of " + a + " & " + b + " is : " + hCF);
    }

    public static int calculateHCF(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }
}