
/**
 * OOPSBannerApp - Use Case 7
 * Implements CharacterPatternMap class to encapsulate
 * character and its banner pattern.
 *
 * @author Roshan
 * @version 7.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ******",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Word to display
        CharacterPatternMap[] word = {
                oPattern,
                oPattern,
                pPattern,
                sPattern
        };

        // Render banner row by row
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append("   ");
            }
            System.out.println(line);
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}