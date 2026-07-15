import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("101", "Ravi");
        map.put("102", "Sai");
        map.put("103", "Kiran");
        map.put("104", "Yogi");

        String key = "102";
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists.");
        } else {
            System.out.println("Key " + key + " does not exist.");
        }

        String value = "Kiran";
        if (map.containsValue(value)) {
            System.out.println("Value " + value + " exists.");
        } else {
            System.out.println("Value " + value + " does not exist.");
        }

        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}