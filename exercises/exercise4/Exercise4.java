package exercises.exercise4;

import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        // Email format case
        System.out.println("Check for Email pattern");
        System.out.println("umangbarot1995@gmail.com: " + Pattern.matches("^(.+)@(.+)$", "umangbarot1995@gmail.com"));
        System.out.println("umang1995@: " + Pattern.matches("^(.+)@(.+)$", "umang1995@"));

        // Check digits
        System.out.println("\nCheck for digits pattern");
        System.out.println("07: " + Pattern.matches("\\d+", "07"));
        System.out.println("xyz: " + Pattern.matches("\\d+", "xyz"));

        // Character case sensitive
        System.out.println("\nCheck for Character pattern");
        System.out.println("ferran: " + Pattern.matches("^[a-z]+$", "ferran"));
        System.out.println("Ferran: " + Pattern.matches("^[a-z]+$", "Ferran"));

        // Check phone number patter
        System.out.println("\nCheck for phone number pattern");
        System.out.println("902935077: " + Pattern.matches(".?(\\d{3}).*(\\d{3}).*(\\d{4})", "902935077"));
        System.out.println("408667um08: " + Pattern.matches(".?(\\d{3}).*(\\d{3}).*(\\d{4})", "408667um08"));

        // Check Date pattern
        System.out.println("\nCheck for Date pattern");
        System.out.println("14-10-1995: " + Pattern.matches("(\\d{2}).(\\d{2}).(\\d{4})", "14-01-1995"));
        System.out.println("14-01-95: " + Pattern.matches("(\\d{2}).(\\d{2}).(\\d{4})", "14-01-95"));

        // Check URL pattern
        System.out.println("\nCheck for URL pattern");
        System.out.println("https://www.facebook.com/search: " + Pattern.matches("(https?)://(www)?.?(\\w+).(\\w+)/?(\\w+)?", "https://www.facebook.com/search"));
        System.out.println("facebook.com: " + Pattern.matches("(https?)://(www)?.?(\\w+).(\\w+)/?(\\w+)?", "facebook.com"));

    }
}
