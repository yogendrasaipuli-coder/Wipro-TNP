package practice;

public class TwoIntegers {
	 public static void main(String[] args) {
	        // Check if exactly two arguments are provided
	        if (args.length < 2) {
	            System.out.println("Please provide two integers.");
	            return;
	        }
	        
	        try {
	            // Convert String arguments to integers
	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[1]);
	            int sum = num1 + num2;
	            
	            // Print the formatted output
	            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	        } catch (NumberFormatException e) {
	            System.out.println("Please ensure both arguments are valid integers.");
	        }
	    }
}
