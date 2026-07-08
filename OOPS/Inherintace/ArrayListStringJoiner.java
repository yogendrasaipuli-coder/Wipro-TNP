import java.util.ArrayList;
import java.util.StringJoiner;

public class ArrayListStringJoiner {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Ravi");
        names.add("Priya");
        names.add("Anjali");

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        names.forEach(name -> sj.add(name));

        System.out.println(sj);
    }
}