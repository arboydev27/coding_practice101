public class StringHasUniqueCharactersV1 {
    // Method to check if all characters in the string are unique
    public static boolean isUniqueChar(String str){

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++){
            // Check each subsequent character for duplicates
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){ // If a duplicate is found
                    return false; // Return false immediately
                }
            }
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
