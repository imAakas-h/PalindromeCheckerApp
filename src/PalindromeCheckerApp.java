/**
 * =====================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 7: Deque Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue) data structure.
 *
 * At this stage, the application:
 * - Adds characters to a Deque
 * - Compares characters from both ends simultaneously
 * - Determines whether the string is a palindrome
 * - Displays the result
 *
 * This introduces double-ended access for comparison.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("=====================================================");
        System.out.println("   Palindrome Checker - UC7: Deque Based Method     ");
        System.out.println("=====================================================");
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result       : \"" + input + "\" IS a Palindrome!");
        } else {
            System.out.println("Result       : \"" + input + "\" is NOT a Palindrome.");
        }
    }
}