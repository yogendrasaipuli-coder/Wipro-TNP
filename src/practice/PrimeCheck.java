package practice;

public class PrimeCheck {
    public static void main(String[] args) {
        // Change this number to test different values
        int number = 17; 
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 up to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break;           // Exit loop early
                }
            }
        }

        // Print final result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}