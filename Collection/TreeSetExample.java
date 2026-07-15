import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");

        System.out.println("Elements in Reverse Order:");
        Iterator<String> reverseIterator = treeSet.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        System.out.println("\nElements using Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String element = "Banana";

        if (treeSet.contains(element)) {
            System.out.println("\n" + element + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + element + " does not exist in the TreeSet.");
        }
    }
}