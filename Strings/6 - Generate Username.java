package Strings;

import java.util.Scanner;

class UsernameGenerator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Generate the username or return invalid message
        String result = generateUsername(name);

        // Print the result
        System.out.println(result);

        scanner.close();
    }

    // Method to generate the username in the specified format
    public static String generateUsername(String name) {
        // Check if the name contains any spaces
        if (name.contains(" ")) {
            return "Invalid username";
        }

        // Get the length of the name
        int lengthOfName = name.length();

        // Generate the username in the format "@usernameLength"
        String username = "@" + name + lengthOfName;

        return username;
    }
}