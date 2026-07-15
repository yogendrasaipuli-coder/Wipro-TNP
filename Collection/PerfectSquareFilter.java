import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(0);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(12);
        numbers.add(16);
        numbers.add(20);
        numbers.add(25);
        numbers.add(36);
        numbers.add(50);

        Predicate<Integer> isPerfectSquare = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        System.out.println("Perfect Square Numbers:");

        numbers.stream()
               .filter(isPerfectSquare)
               .forEach(System.out::println);
    }
}