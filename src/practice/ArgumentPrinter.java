package practice;

public class ArgumentPrinter {
    public static void main(String[] args) {
        // Check if the array length is 0 (meaning no arguments were passed)
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Loop through arguments and print them separated by commas
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                
                // Print a comma after the word, but NOT after the very last word
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println(); // Move to a new line at the end
        }
    }
}