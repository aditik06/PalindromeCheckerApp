import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Use Case 13
 * Performance Comparison of Different Palindrome Algorithms
 * Author: Lakshmi M
 * Version: 1.0
 */

public class UseCase13PerformanceComparison {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama"
                .replaceAll("\\s+", "")
                .toLowerCase();

        System.out.println("Testing word: " + word);
        System.out.println("----------------------------------");

        // Stack Strategy
        long start = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long end = System.nanoTime();
        long stackTime = end - start;

        // Deque Strategy
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        end = System.nanoTime();
        long dequeTime = end - start;

        // Two Pointer Strategy
        start = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(word);
        end = System.nanoTime();
        long twoPointerTime = end - start;

        // Display Results
        System.out.println("Stack Result: " + stackResult +
                " | Time: " + stackTime + " ns");

        System.out.println("Deque Result: " + dequeResult +
                " | Time: " + dequeTime + " ns");

        System.out.println("Two Pointer Result: " + twoPointerResult +
                " | Time: " + twoPointerTime + " ns");
    }

    // Stack Method
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop())
                return false;
        }

        return true;
    }

    // Deque Method
    public static boolean dequePalindrome(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }

        return true;
    }

    // Two Pointer Method
    public static boolean twoPointerPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}