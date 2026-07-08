import java.util.Optional;

class LocalEmployee {

    int id;
    String name;

    LocalEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {

    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class EmployeeOptional {

    public static void main(String[] args) {

        LocalEmployee emp = null;

        try {
            Optional<LocalEmployee> optional = Optional.ofNullable(emp);

            if (optional.isPresent()) {
                System.out.println("Employee Found");
            } else {
                throw new InvalidEmployeeException("Invalid Employee");
            }

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}