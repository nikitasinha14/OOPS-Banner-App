public class UC7BannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create patterns
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        // OOPS → O O P S
        String[] O1 = O.getPattern();
        String[] O2 = O.getPattern();
        String[] P1 = P.getPattern();
        String[] S1 = S.getPattern();

        for (int i = 0; i < O1.length; i++) {
            System.out.println(O1[i] + "   " + O2[i] + "   " + P1[i] + "   " + S1[i]);
        }
    }
}