package practice;

public class ReverseNumber {
    public static void main(String[] args) {
        // Change this number to test different values (e.g., 1234)
        int number = 1234; 
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;        // Get last digit
            reversed = reversed * 10 + digit; // Shift positions left and add digit
            number = number / 10;           // Remove last digit
        }
        
        System.out.println(reversed);
    }
}