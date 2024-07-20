package Functions;

import java.util.Scanner;

public class isEligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();
        String result = "";
        if (isEligible(age)) {
            result = "is";
        } else {
            result = "isn't";
        }
        System.out.println("The Person " + result + " Eligible for Vote!");
    }

    public static boolean isEligible(int age) {
        return age >= 18;
    }
}