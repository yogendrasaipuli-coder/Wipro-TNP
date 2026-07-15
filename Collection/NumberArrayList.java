import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        // ArrayList that stores only Number objects
        ArrayList<Number> numbers = new ArrayList<>();

        // Adding different numeric data types
        numbers.add(10);       // int
        numbers.add(25.5f);    // float
        numbers.add(99.99);    // double
        numbers.add(100L);     // long
        numbers.add((short)5); // short
        numbers.add((byte)2);  // byte

        // Display the elements
        System.out.println("Numbers in the ArrayList:");
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}