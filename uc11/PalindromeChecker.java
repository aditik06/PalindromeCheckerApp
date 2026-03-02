package uc11;

/**
 * PalindromeChecker Service Class
 * Author: Lakshmi M
 * Version: 1.0
 */

public class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}