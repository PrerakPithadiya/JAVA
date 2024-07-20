package Strings;

class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = reverseWords(input);
        System.out.println(output); // Output: "World Hello"
    }

    public static String reverseWords(String s) {
        // Split the string into words
        String[] words = s.split(" ");

        // Use a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
