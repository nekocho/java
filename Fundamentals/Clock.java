import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
    // ANSI escape code for red text
    public static final String redColorCode = "\u001B[31m";
    // ANSI escape code for resetting text color
    public static final String resetColorCode = "\u001B[0m";

    public static void main(String[] args){

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = datetime.format(formatter);
        System.out.printf("The current " + redColorCode + "time" + resetColorCode + " is %s \n", formattedTime);
    }
}