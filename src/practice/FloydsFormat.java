package practice;

public class FloydsFormat {
    public static void main(String[] args) {
        // Check if an argument was passed
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }
        
        try {
            int rows = Integer.parseInt(args[0]);
            
            // Outer loop for rows
            for (int i = 1; i <= rows; i++) {
                // Inner loop for columns in the current row
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Move to the next row line
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number");
        }
    }
}