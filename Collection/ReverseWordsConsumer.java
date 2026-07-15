import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        words.add("Apple");
        words.add("Banana");
        words.add("Orange");
        words.add("Mango");
        words.add("Grapes");
        words.add("Cherry");
        words.add("Papaya");
        words.add("Guava");
        words.add("Pineapple");
        words.add("Watermelon");

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        reverseWords.accept(words);

        System.out.println("Reversed Words:");

        words.forEach(System.out::println);
    }
}