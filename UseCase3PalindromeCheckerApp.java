/**
 * Use Case 3
 * Palindrome Check Using String Reverse
 * Author: Lakshmi M
 * Version: 1.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        // Reversed String
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare using equals() method
        if (original.equals(reversed)) {
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}