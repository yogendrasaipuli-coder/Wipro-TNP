package practice;

public class OnlyOneFour {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 1, 4}; // Example 1
        boolean isValid = true;

        for (int i = 0; i < numbers.length; i++) {
            // If an element is NOT 1 AND it is also NOT 4
            if (numbers[i] != 1 && numbers[i] != 4) {
                isValid = false;
                break;
            }
        }

        System.out.println("O/P: " + isValid);
    }
}