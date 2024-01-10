package bites.examples;

public class Announcement {

// INSTANCE methods
    public String celebration() {
        return "Let's celebrate!";
    }

    public String changeOfPlan() {
        return "Can't make it today, let's do Tomorrow";
    }

    public String apology() {
        return "I'm so sorry";
    }

// STATIC methods
    public static String politeNotice() {
        return "A polite notice to not litter";
    }

    public static String helpNeeded() {
        return "I need help";
    }
    public static void main(String[] args) {
        // Instance methods
        Announcement myAnnouncement = new Announcement();
        System.out.println(myAnnouncement.celebration());
        System.out.println(myAnnouncement.changeOfPlan());
        System.out.println(myAnnouncement.apology());
        // Static methods
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }
}
