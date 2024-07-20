package Functions;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int decNum = convertToDecimal(n);
        System.out.println("Decimal of " + n + " is : " + decNum);
        sc.close();
    }

    public static int convertToDecimal(int binNum) {
        int pow = 0, decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += (lastDigit * (int) Math.pow(2, pow++));
            binNum /= 10;
        }
        return decNum;
    }
}
