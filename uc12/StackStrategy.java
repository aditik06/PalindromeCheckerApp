package uc12;

import java.util.Stack;

/**
 * Stack-based palindrome checking strategy
 */

public class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }
}