/**
 * Use Case 10
 * Case-Insensitive & Space-Ignored Palindrome
 * Author: Lakshmi M
 * Version: 1.0
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string
        String normalized = input
                .replaceAll("\\s+", "")   // remove spaces using regex
                .toLowerCase();           // convert to lowercase

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("Original Input: " + input);
            System.out.println("Normalized: " + normalized);
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Original Input: " + input);
            System.out.println("Normalized: " + normalized);
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }

    // Reuse two-pointer logic
    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}