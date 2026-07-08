package practice;

public class PrimesInRange {
    public static void main(String[] args) {
        // Loop from 10 to 99
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;
            
            // Check if 'i' has any factors other than 1 and itself
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Not a prime, skip to the next number
                }
            }
            
            // If it is prime, print it followed by a space
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line at the end
    }
}