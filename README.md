# **Coding Practice Collection**
This repository contains solutions to various coding problems that are often encountered in technical interviews. Each solution includes a detailed implementation with error handling, logging, and exception management. Here’s an overview of the problems currently included in this repository.

## Problems Overview

### 1. Alternating Capitalization
Description:\
The AlternatingCapitalization class modifies a string to alternate between uppercase and lowercase characters, starting with uppercase. It handles only non-spaced alphanumeric inputs. Invalid inputs (e.g., null, empty strings, or non-alphanumeric characters) raise a custom AlternatingCapitalizationException.

Example:\
Input: "hello"\
Output: `HeLlO`

Implementation Notes:
1. Logs transformations and invalid inputs.
2. Throws exceptions for invalid input cases.

### 2. Palindrome Checker
Description:\
The PalindromeChecker class determines if a string is a palindrome, ignoring case, spaces, and punctuation. It raises a PalindromeException for null or empty strings, ensuring that input errors are handled effectively.

Example:\
Input: "A man, a plan, a canal, Panama"\
Output: `True`

Implementation Notes:
1. Uses regular expressions to remove non-alphanumeric characters.
2. Logs whether the input is a palindrome and flags invalid inputs.

### 3. Text Reversal
Description:\
The TextReversal class reverses a given string and returns the reversed version. Invalid inputs (null or empty strings) are handled by a custom TextReversalException.

Example:\
Input: "hello"\
Output: `olleh`

Implementation Notes:
1. Reverses the string manually by iterating from the end to the beginning.
2. Logs the original and reversed string, with error logging for invalid inputs.

### 4. Swap Max and Min Elements
Description:\
The SwapMaxMin program takes an array of integers from the user, identifies the smallest and largest elements, and swaps their positions in the array. This is useful for array manipulation tasks where specific values need to be reorganized for sorting, normalization, or other data processing purposes.

Example:\
Input: Array `1 2 3 4 5`\
Output: `The new swapped array is [5, 2, 3, 4, 1]`

Implementation Notes:
1. The program prompts the user to enter 5 integers to populate the array.
2. It finds the indices of the smallest and largest values in the array and swaps them.
3. The program displays the modified array with the minimum and maximum values swapped.

### 5. Merge Strings Alternatively
Description:\
The MergeStringsAlternatively class merges two strings character by character, alternating between them. If one string is longer, the remaining characters of the longer string are appended at the end. This function is useful for combining two words or phrases in an interleaved manner, which has applications in data visualization, cryptography, and stylized text formatting.

Example:\
Input: "abc" and "pqr"\
Output: `apbqcr`

Input: "ab" and "pqrs"\
Output: `apbqrs`

Input: "abcd" and "pq"\
Output: `apbqcd`

Implementation Notes:
1. Uses a StringBuilder to build a new String of the merged characters.
2. Iterates up to the length of the longer string, adding characters alternately from each string.

### 6. Greatest Common Divisor of Strings
Description:\
The GreatestCommonDivisorOfStrings class finds the largest common divisor string that can be repeatedly concatenated to form two input strings. If no such string exists, it returns an empty string. This problem is an application of the Greatest Common Divisor (GCD) concept, applied to string patterns rather than numbers.

Example:\
Input: "ABCABC" and "ABC"\
Output: `ABC`

Input: "ABABAB" and "ABAB"\
Output: `AB`

Input: "LEET" and "CODE"\
Output: ` ` (No common divisor string)

Implementation Notes:
1. First checks if concatenating str1 + str2 equals str2 + str1 to verify if they share a common divisor string.
2. Uses a helper function gcd(int a, int b) to find the GCD of the string lengths, then returns the substring from str1 of this length.

### 7. String Has Unique Characters v1.0
Description:\
The StringHasUniqueCharactersV1 class checks whether all characters in a given string are unique. It iterates through the string, comparing each character with every other character to identify duplicates. This function is helpful for problems involving uniqueness constraints, such as password validation or ensuring non-repeating elements in a dataset.

Example:\
Input: "word"\
Output: `The string 'word' has unique characters`

Input: "week"\
Output: `The string 'week' has duplicate characters`

Implementation Notes:
1. Uses nested loops to compare each character with every other character.
2. Returns false immediately upon finding any duplicate characters; otherwise, returns true.

### 8. String Has Unique Characters v2.0 (Optimized Version)
Description:\
The StringHasUniqueCharactersV2 class checks for unique characters in a given string using an optimized approach with a boolean array to track ASCII characters. This approach allows for quick lookups and reduces the time complexity to O(n), making it highly efficient for strings of moderate length.

Example:\
Input: "word"\
Output: `The string 'word' has unique characters`

Input: "week"\
Output: `The string 'week' has duplicate characters`

Implementation Notes:
1. Utilizes a boolean array of size 128, representing ASCII characters.
2. If a string is longer than 128 characters, it immediately returns false, as duplicate characters are guaranteed.
3. Each character’s ASCII value serves as an index, marking it as “found” to detect duplicates in constant time.

### 9. Check Permutations
Description:\
The CheckPermutation class determines if two strings are permutations of each other, meaning they contain the same characters in the same quantity, but possibly in a different order. This function is helpful in scenarios where you need to verify if one string can be rearranged to form another.

Example:\
Input: "word" and "drow"\
Output: `The strings 'word' and 'drow' are permutations of each other`

Input: "week" and "weekk"\
Output: `The strings 'week' and 'weekk' are not permutations of each other`

Implementation Notes:
1. Uses a helper method sort(String str) to sort characters in each string, making it easy to compare them.
2. If the two sorted strings are equal, they are permutations; otherwise, they are not.
3. Returns false immediately if the strings have different lengths, as they cannot be permutations in that case.

### 10. Replace String Spaces
Description:\
The ReplaceStringSpaces class replaces all spaces in a string with "%20", similar to URL encoding. Given the "true" length of the string (i.e., excluding any trailing spaces), it performs this operation in place using a character array, modifying it to replace spaces without using additional space for a new string.

Example:\
Input: "Mr John Smith  " (with true length 13)\
Output: `Mr%20John%20Smith`

Implementation Notes:
1. First, counts the spaces within the "true" length to determine the expanded length of the array.
2. Modifies the array from the end to the beginning, replacing spaces with "%20" in reverse to prevent overwriting characters.
3. Ends the array with a null character (\0) to mark the end of the modified string.

### 11. Kids With the Greatest Number of Candies
Description:\
The `KidsCandies` class determines if each child in a group can have the greatest number of candies by adding a given number of extraCandies to their current count.\
Basically, There are `n` kids with candies. You are given an integer array `candies`, where each `candies[i]` represents the number of candies the `ith` kid has, and an integer `extraCandies`, denoting the number of extra candies that you have.\
Return a boolean array `result` of length `n`, where `result[i]` is `true` if, after giving the `ith` kid all the `extraCandies`, they will have the greatest number of candies among all the kids, or `false` otherwise.\
Note that multiple kids can have the greatest number of candies.

Example:\
Input: candies = `[2,3,5,1,3]`, extraCandies = `3`\
Output: `[true, true, true, false, true]`

Input: candies = `[4,2,1,1,2]`, extraCandies = `1`\
Output: `[true, false, false, false, false]`

Input: candies = `[12,1,12]`, extraCandies = `10`\
Output: `[true, false, true]`

Implementation Notes:
1. Finds the maximum number of candies currently held by any child.
2. Adds extraCandies to each child’s current candy count and checks if it meets or exceeds the maximum count.
3. Returns a list of booleans representing whether each child can have the most candies.

### 12. Can Plant Flowers
Description:\
The CanPlantFlowers class checks if a given number of flowers (n) can be planted in a flowerbed without violating the rule that no two flowers can be adjacent. The flowerbed is represented as an array, where 1 indicates a flower is already planted, and 0 indicates an empty plot.

Example:\
Input: `flowerbed = [1, 0, 0, 0, 1], n = 1`\
Output: `true`\
Explanation: A flower can be planted at the middle plot without violating the rule.

Input: flowerbed = `[1, 0, 0, 0, 1], n = 2`\
Output: `false`\
Explanation: Only one flower can be planted without violating the rule.

Input: flowerbed = `[0, 0, 1, 0, 0], n = 2`\
Output: `true`

Implementation Notes:
1. Iterates through the flowerbed array, checking for empty plots (0).
2. Ensures that the previous (prev) and next (next) plots are also empty before planting a flower.
3. Counts the number of flowers successfully planted and returns true if the count is at least n, otherwise false.


### **How to Use**
To explore these functions, each class file includes a main method with sample test cases. Clone this repository, compile the Java files, and run the tests or modify the inputs for additional practice.
