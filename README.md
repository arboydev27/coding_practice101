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
Description:
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


### **How to Use**
To explore these functions, each class file includes a main method with sample test cases. Clone this repository, compile the Java files, and run the tests or modify the inputs for additional practice.
