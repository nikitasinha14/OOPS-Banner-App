public class BannerApp {

    public static void main(String[] args) {

        // Step 1: Create String Array
        String[] banner = {
            "************************",
            "*     WELCOME TO       *",
            "*     OOPS BANNER      *",
            "*     APPLICATION      *",
            "************************"
        };

        // Step 2: Use Loop to Print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
