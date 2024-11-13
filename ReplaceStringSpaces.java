public class ReplaceStringSpaces {

    /**
     * A method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the
     * of the string to hold the additional characters, and that you are given the "true" length of the string.
     * Use a character array (not the actual string itself) to perform this operation in place.
     * @param str
     * @param trueLength
     * @return void
     */

    public static void replaceSpace(char[] str, int trueLength){
        int spaceCount = 0;
        int newLength;
        int i;

        for (i = 0; i < trueLength; i++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        newLength = trueLength + spaceCount * 2; 
        str[trueLength] = '\0'; // End array

        for (i = trueLength - 1; i >= 0; i--){
            if (str[i] == ' '){
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength--;
            }
        }
    }

    public static void main (String[] args) {
        // Test case:
        String str1 = "Mr John Smith    ";
        char[] str1Array = str1.toCharArray();
        int trueLength1 = 13;

        // Replace spaces in str1Array
        replaceSpace(str1Array, trueLength1);

        // Convert char array back to string
        StringBuilder newString = new StringBuilder();

        for (char c: str1Array){
            newString.append(c);
        }

        System.out.println("Original string: " + str1);
        System.out.println("New string: " + newString.toString());
    }
}
