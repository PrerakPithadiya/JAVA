
public class IndianCurrencyNumberConverter {

    // Words for numbers 0-19
    private static final String[] ones = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };

    // Words for multiples of 10 (20, 30, 40, etc.)
    private static final String[] tens = {
        "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter a number (0 - 99,99,999): ");
            int number = scanner.nextInt();
            System.out.println("In words: " + convertIntegerToWord(number));
        }
    }

    private static String convertIntegerToWord(int number) {
        // Check for valid range
        if (number < 0 || number > 9999999) {
            return "Number out of range. Please enter a number between 0 and 99,99,999";
        }

        // Special case for zero
        if (number == 0) {
            return ones[0];
        }

        String result = "";

        // Step 1: Convert lakhs place (Indian number system: 1 lakh = 100,000)
        result += convertTwoDigitNumber(number / 100000, "lakh");
        number = number % 100000;  // Keep remaining number after removing lakhs

        // Step 2: Convert thousands place
        result += convertTwoDigitNumber(number / 1000, "thousand");
        number = number % 1000;  // Keep remaining number after removing thousands

        // Step 3: Convert hundreds place
        int hundreds = number / 100;
        if (hundreds > 0) {
            result += ones[hundreds] + " hundred ";

            // Add "and" if there are digits after hundreds
            if (number % 100 > 0) {
                result += "and ";
            }
        }

        // Step 4: Convert last two digits (ones and tens place)
        number = number % 100;  // Keep only last two digits
        if (number > 0) {
            if (number < 20) {
                // Direct mapping for 1-19
                result += ones[number];
            } else {
                // For 20 and above: combine tens and ones words
                result += tens[number / 10 - 2];  // -2 because tens array starts with "twenty"

                // Add ones digit if not zero
                if (number % 10 > 0) {
                    result += " " + ones[number % 10];
                }
            }
        }

        return result.trim();  // Remove any extra spaces
    }

    // Helper method to convert a two-digit number and add the provided unit
    private static String convertTwoDigitNumber(int number, String unit) {
        if (number == 0) {
            return "";  // No text if the value is zero
        }

        if (number < 20) {
            // Direct mapping for 1-19
            return ones[number] + " " + unit + " ";
        } else {
            // For 20 and above
            String result = tens[number / 10 - 2];  // Get tens word

            // Add ones digit if not zero
            if (number % 10 > 0) {
                result += " " + ones[number % 10];
            }

            result += " " + unit + " ";
            return result;
        }
    }
}
