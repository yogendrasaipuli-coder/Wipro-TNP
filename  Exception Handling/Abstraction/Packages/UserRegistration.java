class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {

    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        try {

            // Example 1
            user.registerUser("Mickey", "US");

            // Example 2
            // user.registerUser("Mini", "India");

        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

    }
}