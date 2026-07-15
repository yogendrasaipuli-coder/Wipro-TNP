import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<String, Integer>();

        contacts.put("Ravi", 12345);
        contacts.put("Priya", 23456);
        contacts.put("Kiran", 34567);
        contacts.put("Anjali", 45678);

        String key = "Priya";

        if (contacts.containsKey(key)) {
            System.out.println(key + " exists in the Contact List.");
        } else {
            System.out.println(key + " does not exist in the Contact List.");
        }

        int value = 34567;

        if (contacts.containsValue(value)) {
            System.out.println(value + " exists in the Contact List.");
        } else {
            System.out.println(value + " does not exist in the Contact List.");
        }

        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}