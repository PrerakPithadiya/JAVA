package Functions;

import java.util.Scanner;

public class Octal_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Octal Number : ");
        int n = sc.nextInt();
        int decNum = toDecimal(n);
        System.out.println("Decimal Number is : " + decNum);
    }

    public static int toDecimal(int octNum) {
        int pow = 0, decNum = 0;
        while (octNum != 0) {
            int r = octNum % 10;
            decNum += (int) (r * Math.pow(8, pow++));
            octNum /= 10;
        }
        return decNum;
    }
}
