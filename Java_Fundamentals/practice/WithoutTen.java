package practice;

public class WithoutTen {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 10, 2}; // Change to test other examples
        
        // Create a new array of the same size (automatically filled with 0s)
        int[] result = new int[numbers.length];
        int targetIndex = 0;
        
        // Copy elements that are not equal to 10
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 10) {
                result[targetIndex] = numbers[i];
                targetIndex++;
            }
        }
        
        // Print the final result array format
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