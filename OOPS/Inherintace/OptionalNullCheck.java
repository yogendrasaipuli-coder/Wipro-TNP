import java.util.Optional;

public class OptionalNullCheck {

    public static void main(String[] args) {

        String[] names = new String[5];

        Optional<String> optional = Optional.ofNullable(names[0]);

        if (optional.isPresent()) {
            System.out.println(names[0].length());
        } else {
            System.out.println("Value is null");
        }
    }
}