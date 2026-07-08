package practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 12, 45, 67, 89};
        
        System.out.print("O/P: {");
        boolean firstPrint = true;
        
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the element already appeared before index 'i'
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If it's not a duplicate, print it
            if (!isDuplicate) {
                if (!firstPrint) {
                    System.out.print(",");
                }
                System.out.print(numbers[i]);
                firstPrint = false;
            }
        }
        System.out.println("}");
    }
}