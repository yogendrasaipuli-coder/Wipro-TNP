import java.util.Properties;
import java.util.Iterator;
import java.util.Set;

public class StateCapitalProperties {

    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("Andhra Pradesh", "Amaravati");
        properties.setProperty("Telangana", "Hyderabad");
        properties.setProperty("Karnataka", "Bengaluru");
        properties.setProperty("Tamil Nadu", "Chennai");
        properties.setProperty("Kerala", "Thiruvananthapuram");

        System.out.println("States and their Capitals:");

        Set<Object> keys = properties.keySet();
        Iterator<Object> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            System.out.println(state + " : " + properties.getProperty(state));
        }
    }
}