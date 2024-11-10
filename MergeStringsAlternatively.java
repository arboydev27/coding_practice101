import java.util.ArrayList;

public class MergeStringsAlternatively {

    // Method to merge two strings alternatively character by character
    public static String mergeString(String word1, String word2){

        StringBuilder merged = new StringBuilder(); // String builder to store the new merged stirng
        
        int maxLength = Math.max(word1.length(), word2.length()); // Find the length of the longer string

        // Loop through each index up to the length of the longer string
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) { // Append character from word1 if within bounds
                merged.append(word1.charAt(i));
            }
            if (i < word2.length()) { // Append character from word2 if within bounds
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }

    public static void main(String[] args){

        // Case 1:
        String s1 = "abc";
        String s2 = "pqr";

        // Case 2:
        String s3 = "ab";
        String s4 = "pqrs";

        // Case 3:
        String s5 = "abcd";
        String s6 = "pq";

        // Display merged results for each case
        System.out.println("Merging 'abc' and 'pqr' alternatively produces: " + mergeString(s1, s2));
        System.out.println("Merging 'ab' and 'pqrs' alternatively produces: " + mergeString(s3, s4));
        System.out.println("Merging 'abcd' and 'pq' alternatively produces: " + mergeString(s5, s6));
    }
}

