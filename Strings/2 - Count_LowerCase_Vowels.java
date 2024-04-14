package Strings;

import java.util.Scanner;
import java.lang.String;

class Count_LowerCase_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("the lowercase vowels are : \n[ ");
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;
                System.out.print(ch + " ");
            }
        }
        System.out.println("]");
        System.out.println("The Number of LowerCase Vowels are : " + count);
    }

    public static boolean isVowel(char ch) {
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');
    }
}