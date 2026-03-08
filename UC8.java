import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - Use Case 8
 * Uses HashMap to store character patterns
 * and renders banner via dedicated function.
 *
 * @author Roshan
 * @version 8.0
 */
public class OOPSBannerApp {

    // Centralized pattern storage
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();   // Load patterns
        renderBanner("OOPS");   // Render word
    }

    // Initialize all character patterns
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ******",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    // Render banner dynamically
    private static void renderBanner(String word) {

        int height = 7;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}