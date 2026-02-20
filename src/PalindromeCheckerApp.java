/**
 * =====================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("=====================================================");
        System.out.println("   Palindrome Checker - UC2: Hardcoded Validation   ");
        System.out.println("=====================================================");
        System.out.println("Input Word : " + word);
        System.out.println("Reversed   : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Result     : \"" + word + "\" IS a Palindrome!");
        } else {
            System.out.println("Result     : \"" + word + "\" is NOT a Palindrome.");
        }
    }
}