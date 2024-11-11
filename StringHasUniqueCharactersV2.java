public class StringHasUniqueCharactersV2 {

    /**
     * I got this really cool more fun and intuitive way to solve this problem
     * It involves using a boolean array to store ASCII characters
     * This way, we can easily check if a character has been found before
     * This solution has a time complexity of O(n) where n is the length of the string and space complexity of O(1)
     */
    public static boolean isUniqueChar(String str){

        if (str.length() > 128) { // If the string is longer than the number of ASCII characters
            return false; // Return false immediately
        }

        boolean[] ascii_char_set = new boolean[128]; // Create a boolean array to store ASCII characters

        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i); // Get the ASCII value of the character and store it in a flag container
            if (ascii_char_set[val]){ // If the character is already found
                return false; // Return false immediately
            }
            ascii_char_set[val] = true; // Set the character as found
        }
        return true; // Return true if no duplicates are found
    }

    public static void main(String[] args){
        // Test Case 1:
        String str1 = "word";
        boolean result1 = isUniqueChar(str1);

        // Display result for str1
        if (result1){
            System.out.println("The string '" + str1 + "' has unique characters");
        } else {
            System.out.println("The string '" + str1 + "' has duplicate characters");
        }

        // Test Case 2:
        String str2 = "week";
        boolean result2 = isUniqueChar(str2);

        // Display result for str2
        if (result2){
            System.out.println("The string '" + str2 + "' has unique characters");
        } else {
            System.out.println("The string '" + str2 + "' doesn't have unique characters");
        }
    }
    
}
