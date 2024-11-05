import java.util.logging.Logger;

/**
 * TextReversal.java
 * 
 * This class contains a method to reverse a given string.
 * The method reverses the string and returns the reversed version.
 * 
 * In addition to the string reversal logic, this implementation features error handling similar to the PalindromeChecker. 
 * A custom exception (`TextReversalException`) is thrown when the input is null or empty, ensuring invalid input is handled properly.
 * 
 * Furthermore, a logging structure has been incorporated. 
 * The log messages display the Date, Time, Class Name, and Method itself, providing detailed information about program execution. 
 * This helps track any invalid input cases and logs the reversed string when the program executes.
 * 
 * Author: Arboy Magomba
 * Date: October 4, 2024
 * 
 * Methods:
 * - reverseText(String inputString): Reverses the input string.
 * - main(String[] args): A test case that demonstrates the functionality of the reverseText method.
 */

// Custom exception class for invalid input cases
class TextReversalException extends Exception {
    public TextReversalException(String message) {
        super(message); // Passes the error message to the superclass (Exception)
    }
}

public class TextReversal {

    // Initialize logger
    private static final Logger logger = Logger.getLogger(TextReversal.class.getName());

    /**
     * This method reverses the input string.
     * It throws an exception if the input is null or empty and logs the reversed string.
     * The reversal logic is similar to the one used in the PalindromeChecker class, but returns the reversed string instead.
     * 
     * @param inputString The string to reverse.
     * @return The reversed string.
     * @throws TextReversalException if the input string is null or empty.
     */
    public static String reverseText(String inputString) throws TextReversalException {
        // Check if the input string is null or empty and throw a custom exception if so
        if (inputString == null || inputString.isEmpty()) {
            logger.severe("Invalid input: Input string is null or empty."); // Log error
            throw new TextReversalException("Input string cannot be null or empty");
        }

        // An empty string to store the reversed version of the input string
        String reversedString = "";

        // Loop through the input string in reverse order to build the reversed string
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i); // Append each character from end to start
        }

        // Log the result
        logger.info("\"" + inputString + "\" reversed is: \"" + reversedString + "\"");

        return reversedString; // Return the reversed string
    }

    public static void main(String[] args) {
        // Test cases to reverse the input string
        String testString1 = "hello";
        String testString2 = "world";
        String testString3 = "Palindrome";
        String testString4 = "Student Programmer";
        String testString5 = ""; // Invalid input (empty string)

        for (String testString : new String[] { testString1, testString2, testString3, testString4, testString5 }) {
            try {
                // Reverse the testString
                reverseText(testString);
            } catch (TextReversalException e) {
                // Handle and log custom exceptions
                logger.warning("Caught TextReversalException: " + e.getMessage());
            }
        }
    }
}
