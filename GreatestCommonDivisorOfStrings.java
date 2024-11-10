public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {

        // Check if str1 + str2 == str2 + str1 to see if they have a commond divisor otherwise return empty string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GDC of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 from index 0 (inclusicve) to the GCD length (exclusive)
        return str1.substring(0, gcdLength);
    }

    // Helper method to find the Greatest Common Divisor of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args){
        // Test Case 1:
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));

        // Test Case 2:
        String str3 = "ABABAB";
        String str4 = "ABAB";
        System.out.println(gcdOfStrings(str3, str4));

        // Test Case 3:
        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println(gcdOfStrings(str5, str6));
        
    }
}
