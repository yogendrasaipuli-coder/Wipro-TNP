import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<String>();

        employees.add("Ravi");
        employees.add("Lokesh");
        employees.add("Kiran");
        employees.add("Sai");
        employees.add("Rahul");

        Iterator<String> iterator = employees.iterator();

        System.out.println("Employee Names:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}