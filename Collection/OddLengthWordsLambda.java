import java.util.ArrayList;

public class OddLengthWordsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        al.add("Orange");
        al.add("Grapes");
        al.add("Papaya");
        al.add("Kiwi");
        al.add("Cherry");
        al.add("Guava");
        al.add("Pear");

        System.out.println("Strings with Odd Length:");

        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}