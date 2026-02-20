/**
 * =====================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 6: Queue and Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using both a Queue
 * (FIFO) and a Stack (LIFO) data structure together.
 *
 * At this stage, the application:
 * - Inserts characters into both Queue and Stack
 * - Compares characters from Queue (front) and Stack (top)
 * - Determines whether the string is a palindrome
 * - Displays the result
 *
 * This maps both FIFO and LIFO behavior to palindrome logic.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("=====================================================");
        System.out.println(" Palindrome Checker - UC6: Queue & Stack Method     ");
        System.out.println("=====================================================");
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result       : \"" + input + "\" IS a Palindrome!");
        } else {
            System.out.println("Result       : \"" + input + "\" is NOT a Palindrome.");
        }
    }
}