package Loops;

import java.util.Scanner;

public class LCM_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int lCM = calculateLCM(a, b);
        System.out.println("The LCM of " + a + " & " + b + " is : " + lCM);
        sc.close();
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / HCF(a, b);
    }

    public static int HCF(int a, int b) {
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