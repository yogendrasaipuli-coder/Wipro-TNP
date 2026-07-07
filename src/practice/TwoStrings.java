package practice;

public class TwoStrings{
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two command line arguments.");
            return;
        }
        
        // Extract arguments and print the required format
        String company = args[0];
        String location = args[1];
        
        System.out.println(company + " Technologies " + location);
    }
}