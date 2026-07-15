import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextMonthSecondSunday {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate secondSunday = today
                .plusMonths(1)
                .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        System.out.println("Next Month Second Sunday: " + secondSunday);
    }
}