/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author Developer
 * @version 6.0
 */

// Extend the User Story 5 to display the OOPS banner using a modular approach.
//
// Key Requirements:
// 1. Define methods getOPattern(), getPPattern(), and getSPattern() 
//    that return String arrays representing the ASCII art for each letter
// 2. In the main method, call these methods to get the patterns and store them
//    in String arrays
// 3. Use a loop to assemble and print each line of the banner

public class OOPSBannerApp6 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "   ***  ",
            "  ** ** ",
            "**    **",
            "**    **",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***   "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ******   ",
            " **   **  ",
            " **    ** ",
            " **   **  ",
            " ******   ",
            " **       ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "    *****  ",
            "  **       ",
            " **        ",
            "  **       ",
            "    ***    ",
            "       **  ",
            "        ** ",
            "       **  ",
            "  *****    "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use the loop to Assemble each line of the banner to create the
        // visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            // Added 3 spaces between each letter array to match the wide spacing in your expected output
            System.out.println(oPattern[i] + "   " + oPattern[i] + "   " + pPattern[i] + "   " + sPattern[i]);
        }
    }
}