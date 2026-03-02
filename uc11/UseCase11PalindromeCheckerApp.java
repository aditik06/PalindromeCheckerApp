package uc11;

/**
 * Use Case 11
 * Object-Oriented Palindrome Service
 * Author: Lakshmi M
 * Version: 1.0
 */

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Madam";

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}