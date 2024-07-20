package Loops;

import java.util.Scanner;

public class Find_Sum_Till_Entered_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char ch;
        do {
            System.out.print("Enter the Number : ");
            int n = sc.nextInt();
            sum = sum + n;
            System.out.print("Enter the Character : ");
            ch = sc.next().trim().charAt(0);
        } while (ch != 'x');
        System.out.println("\nSum of All Numbers is = " + sum);

        sc.close();
    }
}