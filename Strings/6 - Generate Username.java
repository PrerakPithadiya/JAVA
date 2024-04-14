package Strings;

import java.util.Scanner;

class Generate_Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your FullName: ");
        String fullName = sc.nextLine();
        String userName = generateUsername(fullName);
        System.out.println(userName);
    }

    public static String generateUsername(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                return "The Username is Invalid!";
            }
        }
        return "@" + fullName + fullName.length();
    }
}
