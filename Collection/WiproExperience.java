import java.time.LocalDate;
import java.time.Period;

public class WiproExperience {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2024, 1, 15);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Wipro Experience:");

        System.out.println("Years  : " + experience.getYears());
        System.out.println("Months : " + experience.getMonths());
        System.out.println("Days   : " + experience.getDays());
    }
}