public class BannerApp {

    String collegeName;
    String eventName;

    public BannerApp(String collegeName, String eventName) {
        this.collegeName = collegeName;
        this.eventName = eventName;
    }

    public void displayBanner() {
        System.out.println("********************************");
        System.out.println("Welcome to " + collegeName);
        System.out.println("Event: " + eventName);
        System.out.println("********************************");
    }

    public static void main(String[] args) {
        BannerApp banner = new BannerApp("srm College", "Fest 2026");
        banner.displayBanner();
    }
}
