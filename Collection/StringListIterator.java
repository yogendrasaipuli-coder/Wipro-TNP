import java.util.ArrayList;
import java.util.Iterator;

public class StringListIterator {

    // Method to print all elements using Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        // Create an ArrayList that stores only Strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");

        // Print all elements
        System.out.println("Elements in the ArrayList:");
        printAll(list);
    }
}