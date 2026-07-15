import java.util.ArrayList;
import java.util.stream.Collectors;

public class StaffFilter {

    public static void main(String[] args) {

        ArrayList<StaffMember> staff = new ArrayList<StaffMember>();

        staff.add(new StaffMember(101, "Ravi", 25, "Pune"));
        staff.add(new StaffMember(102, "Priya", 28, "Hyderabad"));
        staff.add(new StaffMember(103, "Kiran", 30, "Pune"));
        staff.add(new StaffMember(104, "Anjali", 26, "Chennai"));
        staff.add(new StaffMember(105, "Rahul", 29, "Pune"));

        ArrayList<StaffMember> puneStaff = staff.stream()
                .filter(s -> s.location.equals("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Staff Members from Pune:");

        puneStaff.forEach(System.out::println);
    }
}