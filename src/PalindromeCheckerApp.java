/**
 * =====================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        // and compare with popped stack characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("=====================================================");
        System.out.println("   Palindrome Checker - UC5: Stack Based Method     ");
        System.out.println("=====================================================");
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result       : \"" + input + "\" IS a Palindrome!");
        } else {
            System.out.println("Result       : \"" + input + "\" is NOT a Palindrome.");
        }
    }
}