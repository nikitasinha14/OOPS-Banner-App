import java.util.HashMap;
import java.util.Map;

public class UC8BannerApp {

    // Function to build pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    // Function to render banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = map.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                String[] pattern = map.get(ch);

                line.append(pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }
}