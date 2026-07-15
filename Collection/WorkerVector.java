import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class WorkerVector {

    public static void main(String[] args) {

        // Create Vector to store Worker objects
        Vector<Worker> employees = new Vector<>();

        // Add Worker objects
        employees.add(new Worker(101, "Ravi", 35000));
        employees.add(new Worker(102, "Priya", 42000));
        employees.add(new Worker(103, "Kiran", 50000));

        // Display using Iterator
        System.out.println("Using Iterator:");
        Iterator<Worker> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Worker> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}