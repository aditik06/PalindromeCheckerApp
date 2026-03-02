package uc12;

/**
 * Use Case 12
 * Strategy Pattern for Palindrome Algorithms
 */

public class UseCase12StrategyApp {

    public static void main(String[] args) {

        String word = "level";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Change this line to test different strategies
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(word);

        if (result) {
            System.out.println("Using " + strategy.getClass().getSimpleName());
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}