/**
 * Use Case 9
 * Recursive Palindrome Checker
 * Author: Lakshmi M
 * Version: 1.0
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "refer";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}