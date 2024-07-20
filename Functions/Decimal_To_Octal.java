package Functions;

import java.util.Scanner;

public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int n = sc.nextInt();
        int octNum = toOctal(n);
        System.out.println("Octal Number is : " + octNum);
    }

    public static int toOctal(int decNum) {
        int pow = 0, octNum = 0;
        while (decNum != 0) {
            int r = decNum % 8;
            octNum += (int) (r * Math.pow(10, pow++));
            decNum /= 8;
        }
        return octNum;
    }
}
