package practice;

public class DigitSum {
    public static void main(String[] args) {
        // Change this number to test different values (e.g., 1234)
        int number = 1234; 
        int sum = 0;
        
        // Loop runs until all digits are processed
        while (number > 0) {
            int lastDigit = number % 10; // Extract the last digit (e.g., 4)
            sum = sum + lastDigit;       // Add it to the total sum
            number = number / 10;        // Drop the last digit (e.g., 1234 becomes 123)
        }
        
        System.out.println(sum);
    }
}