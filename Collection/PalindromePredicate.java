import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("apple");
        words.add("malayalam");
        words.add("world");
        words.add("noon");
        words.add("book");

        Predicate<String> isPalindrome = word -> {
            String reverse = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reverse);
        };

        System.out.println("Palindrome Words:");

        words.stream()
             .filter(isPalindrome)
             .forEach(System.out::println);
    }
}