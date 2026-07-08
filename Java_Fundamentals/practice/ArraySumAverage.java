package practice;

public class ArraySumAverage {
    public static void main(String[] args) {
        // Initialize an integer array with values
        int[] numbers = {10, 20, 30, 40, 50};
        
        int sum = 0;
        
        // Loop through the array to calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // Calculate average (cast to double to get decimal precision if needed)
        double average = (double) sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}