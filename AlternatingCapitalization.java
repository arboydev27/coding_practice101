import java.util.logging.Logger;

/**
 * AlternatingCapitalization.java
 * 
 * This class contains a method to apply alternating capitalization to a given string.
 * The method returns a string with alternating uppercase and lowercase letters,
 * starting with an uppercase letter. Non-alphanumeric inputs are not allowed.
 * 
 * This implementation includes comprehensive error handling. It throws a custom exception 
 * (`AlternatingCapitalizationException`) when the input is null, empty, or contains non-alphanumeric values.
 * 
 * Additionally, a logging structure has been incorporated. The log messages display the Date, Time, 
 * Class Name, and Method when the program executes. This helps trace any invalid input cases (e.g., non-alphanumeric strings) 
 * and logs the transformation of the string into its alternating capitalization form.
 * 
 * Author: Arboy Magomba
 * Date: October 4, 2024
 * 
 * Methods:
 * - alternatingCapitalization(String inputString): Applies alternating capitalization to the input string.
 * - main(String[] args): A test case that demonstrates the functionality of the alternatingCapitalization method.
 */

// Custom exception class for invalid input cases
class AlternatingCapitalizationException extends Exception {
    public AlternatingCapitalizationException(String message) {
        super(message); // Passes the error message to the superclass (Exception)
    }
}

public class AlternatingCapitalization {

    // Initialize logger
    private static final Logger logger = Logger.getLogger(AlternatingCapitalization.class.getName());

    /**
     * Applies alternating capitalization to the input string, starting with an uppercase letter.
     * Only non-spaced alphanumeric values are allowed.
     * 
     * @param inputString The string to modify.
     * @return The string with alternating capitalization.
     * @throws AlternatingCapitalizationException if the input string is null, empty, or contains non-alphanumeric values.
     */
    public static String alternatingCapitalization(String inputString) throws AlternatingCapitalizationException {
        // Check if the input string is null or empty and throw a custom exception if so
        if (inputString == null || inputString.isEmpty()) {
            logger.severe("Invalid input: Input string is null or empty."); // Log error
            throw new AlternatingCapitalizationException("Input string cannot be null or empty.");
        }

        // Check if the input string contains any non-alphanumeric characters
        if (!inputString.matches("[a-zA-Z0-9]+")) {
            logger.severe("\"" + inputString + "\" Invalid input: Input string contains non-alphanumeric characters or spaces."); // Log error
            throw new AlternatingCapitalizationException("Input string must contain only non-spaced alphanumeric characters (letters and numbers).");
        }

        // StringBuilder to store the resulting string with alternating capitalization
        StringBuilder result = new StringBuilder();
        boolean capitalize = true; // Flag to determine whether to capitalize the current letter

        // Loop through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Apply alternating capitalization
            if (capitalize) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(Character.toLowerCase(currentChar));
            }
            // Toggle the capitalization flag
            capitalize = !capitalize;
        }

        // Log the result
        logger.info("\"" + inputString + "\" becomes: \"" + result.toString() + "\"");

        return result.toString(); // Return the result string
    }

    public static void main(String[] args) {
        // Test cases to apply alternating capitalization
        String testString1 = "hello";
        String testString2 = "world";
        String testString3 = "123ABC";
        String testString4 = "hello world!"; // Invalid input with spaces and punctuation
        String testString5 = ""; // Invalid input (empty string)

        for (String testString : new String[] { testString1, testString2, testString3, testString4, testString5 }) {
            try {
                // Apply alternating capitalization to the testString
                alternatingCapitalization(testString);
            } catch (AlternatingCapitalizationException e) {
                // Handle and log custom exceptions
                logger.warning("Caught AlternatingCapitalizationException: " + e.getMessage());
            }
        }
    }
}
