package Strings;

import java.util.Scanner;
import java.lang.StringBuilder;

class Remove_Whitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
