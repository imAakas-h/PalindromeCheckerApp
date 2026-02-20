/**
 * =====================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        String original = "racecar";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("=====================================================");
        System.out.println("  Palindrome Checker - UC3: Reverse String Method   ");
        System.out.println("=====================================================");
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result          : \"" + original + "\" IS a Palindrome!");
        } else {
            System.out.println("Result          : \"" + original + "\" is NOT a Palindrome.");
        }
    }
}