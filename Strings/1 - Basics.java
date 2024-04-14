package Strings;

import java.util.Scanner;

class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        int length = str.length();
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        System.out.print("enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.println("\n\nLength of string is : " + length);
        System.out.println("Upper case string is : " + upper);
        System.out.println("Lower case string is : " + lower);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("index of " + ch + " is : " + i);
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Frequency of " + ch + " is : " + count);
    }
}
