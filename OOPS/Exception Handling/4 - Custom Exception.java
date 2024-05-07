package OOPS.Exception_Handling;

// Custom exception class to handle specific exceptions
class CustomException extends Exception {
    // Default constructor
    public CustomException() {
    }

    // Constructor with a message parameter
    public CustomException(String message) {
        super(message);
    }
}

class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Throw the custom exception with a message
            throw new CustomException("There is a custom exception!");
        } catch (CustomException exception) {
            // Catch the custom exception and print its message
            System.out.println("Caught custom exception: " + exception.getMessage());
        }
    }
}
