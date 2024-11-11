import java.util.Arrays;

public class CheckPermutations {

    // Method to sort characters in a string alphabetically
    public static String sort(String str){
        char[] content = str.toCharArray(); // Convert string to character array
        Arrays.sort(content);
        return new String(content); // Convert sorted array back to string
    }
    
    // Method to check if two strings are permutations of each other
    public static boolean isPermutation(String str1, String str2){
        // If strings have different lengths, they can't be permutations
        if (str1.length() != str2.length()){
            return false;
        }
        // Compare sorted versions of both strings
        return sort(str1).equals(sort(str2));
    }

    public static void main(String[] args){
        // Test Case 1:
        String str1 = "word";
        String str2 = "drow";
        boolean result1 = isPermutation(str1, str2);

        // Display result for str1 and str2
        if (result1){
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are permutations of each other");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not permutations of each other");
        }

        // Test Case 2:
        String str3 = "week";
        String str4 = "weekk";
        boolean result2 = isPermutation(str3, str4);

        // Display result for str3 and str4
        if (result2){
            System.out.println("The strings '" + str3 + "' and '" + str4 + "' are permutations of each other");
        } else {
            System.out.println("The strings '" + str3 + "' and '" + str4 + "' are not permutations of each other");
        }
    }
}
