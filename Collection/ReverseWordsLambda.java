import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add("Orange");
        al.add("Grapes");
        al.add("Pineapple");
        al.add("Papaya");
        al.add("Cherry");
        al.add("Guava");
        al.add("Watermelon");

        Collections.reverse(al);

        System.out.println("Strings in Reverse Order:");

        al.forEach(word -> System.out.println(word));
    }
}