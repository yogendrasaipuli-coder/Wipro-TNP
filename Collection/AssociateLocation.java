import java.util.ArrayList;
import java.util.function.Function;

public class AssociateLocation {

    public static void main(String[] args) {

        ArrayList<Associate> associates = new ArrayList<>();

        associates.add(new Associate(101, "Ravi", "Pune", 50000));
        associates.add(new Associate(102, "Priya", "Hyderabad", 60000));
        associates.add(new Associate(103, "Kiran", "Chennai", 55000));
        associates.add(new Associate(104, "Anjali", "Pune", 65000));
        associates.add(new Associate(105, "Rahul", "Bangalore", 70000));

        Function<Associate, String> getLocation = a -> a.location;

        ArrayList<String> locationList = new ArrayList<>();

        for (Associate a : associates) {
            locationList.add(getLocation.apply(a));
        }

        System.out.println("Employee Locations:");

        locationList.forEach(System.out::println);
    }
}