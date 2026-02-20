/**
 * =====================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 4: Two Pointer Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using the two-pointer technique with a character array.
 *
 * At this stage, the application:
 * - Converts string to a character array
 * - Uses start and end pointers
 * - Compares characters from both ends moving inward
 * - Displays the validation result
 *
 * This introduces pointer-based comparison logic.
 *
 * @author Developer
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("=====================================================");
        System.out.println("  Palindrome Checker - UC4: Two Pointer Technique   ");
        System.out.println("=====================================================");
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result       : \"" + input + "\" IS a Palindrome!");
        } else {
            System.out.println("Result       : \"" + input + "\" is NOT a Palindrome.");
        }
    }
}