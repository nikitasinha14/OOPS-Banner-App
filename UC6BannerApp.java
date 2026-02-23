public class UC6BannerApp {

    // Build Letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Build Letter P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // Build Letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O1 = buildO();
        String[] O2 = buildO();   // Second O
        String[] P  = buildP();
        String[] S  = buildS();

        for (int i = 0; i < O1.length; i++) {
            System.out.println(O1[i] + "   " + O2[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}