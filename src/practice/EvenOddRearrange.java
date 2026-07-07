package practice;

public class EvenOddRearrange {
    public static void main(String[] args) {
        int[] numbers = {1, 0, 1, 0, 0, 1, 1}; // Example 1
        int[] result = new int[numbers.length];
        int index = 0;

        // First pass: Copy all even numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[index] = numbers[i];
                index++;
            }
        }

        // Second pass: Copy all odd numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[index] = numbers[i];
                index++;
            }
        }

        // Print the result array
        System.out.print("O/P: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}