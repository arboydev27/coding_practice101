# **Coding Practice Collection**
This repository contains solutions to various coding problems that are often encountered in technical interviews. Each solution includes a detailed implementation with error handling, logging, and exception management. Here’s an overview of the problems currently included in this repository.

## Problems Overview

### 1. Alternating Capitalization
Description:
The AlternatingCapitalization class modifies a string to alternate between uppercase and lowercase characters, starting with uppercase. It handles only non-spaced alphanumeric inputs. Invalid inputs (e.g., null, empty strings, or non-alphanumeric characters) raise a custom AlternatingCapitalizationException.

Example:
Input: "hello"
Output: `HeLlO`

Implementation Notes:
1. Logs transformations and invalid inputs.
2. Throws exceptions for invalid input cases.

### 2. Palindrome Checker
Description:
The PalindromeChecker class determines if a string is a palindrome, ignoring case, spaces, and punctuation. It raises a PalindromeException for null or empty strings, ensuring that input errors are handled effectively.

Example:
Input: "A man, a plan, a canal, Panama"
Output: `True`

Implementation Notes:
1. Uses regular expressions to remove non-alphanumeric characters.
2. Logs whether the input is a palindrome and flags invalid inputs.

### 3. Text Reversal
Description:
The TextReversal class reverses a given string and returns the reversed version. Invalid inputs (null or empty strings) are handled by a custom TextReversalException.

Example:
Input: "hello"
Output: `olleh`

Implementation Notes:
1. Reverses the string manually by iterating from the end to the beginning.
2. Logs the original and reversed string, with error logging for invalid inputs.

### **How to Use**
To explore these functions, each class file includes a main method with sample test cases. Clone this repository, compile the Java files, and run the tests or modify the inputs for additional practice.
