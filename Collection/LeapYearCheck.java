import java.time.Year;

public class LeapYearCheck {

    public static void main(String[] args) {

        int currentYear = Year.now().getValue();

        if (Year.isLeap(currentYear)) {
            System.out.println(currentYear + " is a leap year");
        } else {
            System.out.println(currentYear + " is not a leap year");
        }
    }
}