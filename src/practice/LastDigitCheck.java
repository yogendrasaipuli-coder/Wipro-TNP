package practice;

public class LastDigitCheck {
    public static void main(String[] args) {
        // Change these values to test (e.g., 7 and 17, 6 and 17)
        int num1 = 27;
        int num2 = 57;

        // Get the last digit of both numbers
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        // Compare the last digits
        if (lastDigit1 == lastDigit2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}