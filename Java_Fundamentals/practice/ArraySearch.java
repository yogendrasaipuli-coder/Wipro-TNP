package practice;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 34, 56, 7};
        int searchElement = 56; // Change this value to test different scenarios
        
        int foundIndex = -1; // Default to -1 if not found
        
        // Loop through array to find a match
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                foundIndex = i; // Store the index location
                break;          // Match found, exit loop early
            }
        }
        
        // Print the result
        System.out.println(foundIndex);
    }
}