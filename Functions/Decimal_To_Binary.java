package Functions;

import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int decNum = sc.nextInt();
        int binNum = convertToBinary(decNum);
        System.out.println("The Binary of " + decNum + " is : " + binNum);
    }

    public static int convertToBinary(int decNum) {
        int pow = 0, binNum = 0, r;
        while (decNum != 0) {
            r = decNum % 2;
            binNum = binNum + (r * (int) Math.pow(10, pow++));
            decNum /= 2;
        }
        return binNum;
    }
}
