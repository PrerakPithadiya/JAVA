package Strings;

import java.util.Scanner;
import java.lang.StringBuilder;

class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
