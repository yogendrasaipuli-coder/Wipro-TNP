package practice;

public class ConditionalSum {
    public static void main(String[] args) {
        // Test array (matches Example 1)
        int[] numbers = {10, 3, 6, 1, 2, 7, 9}; 
        
        int sum = 0;
        boolean addMode = true; // Tracks whether we should add the current number
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 6) {
                addMode = false; // Turn off adding mode when 6 is found
            }
            
            if (addMode) {
                sum += numbers[i];
            }
            
            // Turn adding mode back on starting *after* the 7
            if (numbers[i] == 7 && !addMode) {
                addMode = true;
            }
        }
        
        System.out.println("O/P: " + sum);
    }
}