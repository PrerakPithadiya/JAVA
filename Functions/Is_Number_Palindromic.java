package Functions;

import java.util.Scanner;

public class Is_Number_Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        String result;
        if (isPalindromic(n)) {
            result = "is";
        } else {
            result = "isn't";
        }
        System.out.println("The given Number " + result + " Palindromic!");
    }

    public static boolean isPalindromic(int n) {
        String str = Integer.toString(n);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}