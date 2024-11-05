import java.util.logging.Logger;

/**
 * PalindromeChecker.java
 * 
 * This class contains a method to check whether a given string is a palindrome.
 * A palindrome is a word or phrase that reads the same backward as forward.
 * To also check for full sentences as palindromes and also avoid errors, this implementation ignores
 * spaces, punctuation, and case differences.
 * 
 * In addition to the palindrome logic, this implementation includes robust error handling. 
 * It throws a custom exception (`PalindromeException`) when the input is null or empty, ensuring the program handles invalid inputs gracefully. 
 * 
 * Furthermore, a logging structure has been added using `java.util.logging.Logger`. 
 * The log messages display the Date, Time, Class Name, and Method where the program's actions are recorded. 
 * This provides valuable insights into the execution flow, including logging when invalid inputs are detected and whether the input string is identified as a palindrome.
 * 
 * Author: Arboy Magomba
 * Date: October 4, 2024
 * 
 * Methods:
 * - isPalindrome(String inputString): Checks if a string or sentence is a palindrome.
 * - main(String[] args): A test case that demonstrates the functionality of the isPalindrome method.
 */

// Custom exception class for invalid input cases
class PalindromeException extends Exception {
    public PalindromeException(String message) {
        super(message); // Passes the error message to the superclass (Exception)
    }
}

public class PalindromeChecker {

    // Initialize logger
    private static final Logger logger = Logger.getLogger(PalindromeChecker.class.getName());

    /**
     * Checks if a given string or sentence is a palindrome.
     * 
     * @param inputString The string or sentence to check.
     * @return true if the input string or sentence is a palindrome, false otherwise.
     * @throws PalindromeException if the input string is null or empty.
     */
    public static boolean isPalindrome(String inputString) throws PalindromeException {
        // Check if the input string is null or empty and throw a custom exception if so
        if (inputString == null || inputString.isEmpty()) {
            logger.severe("Invalid input: Input string is null or empty."); // Log error
            throw new PalindromeException("Input string cannot be null or empty");
        }

        // Convert input string to lowercase to ignore case sensitivity
        inputString = inputString.toLowerCase();

        // Remove all non-alphanumeric characters (including spaces and punctuation)
        inputString = inputString.replaceAll("[^a-z0-9]", ""); // Retain only letters and numbers

        // An empty string to store the reversed version of the input string
        String reversedString = "";

        // Loop through the cleaned input string in reverse order to build the reversed string
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i); // Append each character from end to start
        }

        // Compare the reversed string with the cleaned original input string
        boolean result = reversedString.equals(inputString); // Check if they are equal

        // Log the result
        if (result) {
            logger.info("The input string is a palindrome.");
        } else {
            logger.info("The input string is not a palindrome.");
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases to check if the input is a palindrome
        String testString1 = "madam"; // Palindrome word
        String testString2 = "hello"; // Non-palindrome word
        String testString3 = "A man, a plan, a canal, Panama"; // Palindrome sentence
        String testString4 = "Was it a car or a cat I saw?"; // Another palindrome sentence
        String testString5 = ""; // Invalid input (empty string)

        for (String testString : new String[] { testString1, testString2, testString3, testString4, testString5 }) {
            try {
                // Check if the testString is a palindrome
                if (isPalindrome(testString)) {
                    System.out.println("\"" + testString + "\" --> True.");
                } else {
                    System.out.println("\"" + testString + "\" --> False.");
                }
            } catch (PalindromeException e) {
                // Handle and log custom exceptions
                logger.warning("Caught PalindromeException: " + e.getMessage());
            }
        }
    }
}
