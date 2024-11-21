public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        // Trim leading spaces and split the split the string by the available spaces
        String[] words = s.trim().split("\\s+");

        // Reverse the array
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        return String.join(" ", words);
    }
    public static void main(String[] args) {
        // Test Case 1:
        String s1 = "the sky is blue";
        System.out.println("Original string: " + s1);
        System.out.println("Reversed string: " + reverseWords(s1));

        System.out.println();

        // Test Case 2:
        String s2 = "  hello world  ";
        System.out.println("Original string: " + s2);
        System.out.println("Reversed string: " + reverseWords(s2));

        System.out.println();

        // Test Case 3:
        String s3 = "a good   example";
        System.out.println("Original string: " + s3);
        System.out.println("Reversed string: " + reverseWords(s3));
    }
}
