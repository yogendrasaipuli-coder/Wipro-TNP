package practice;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Change this number to test different values (e.g., 121, 123)
        int number = 121; 
        
        int originalNumber = number; // Save the original number to compare later
        int reversed = 0;
        
        // Loop to reverse the number
        while (number > 0) {
            int digit = number % 10;          // Extract the last digit
            reversed = reversed * 10 + digit;   // Append the digit to the reversed number
            number = number / 10;             // Remove the last digit from the number
        }
        
        // Check if the reversed number is equal to the original number
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}