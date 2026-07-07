package practice;

public class ToAcceptString {
    public static void main(String[] args) {
        // Check if at least one argument is provided
        if (args.length < 1) {
            System.out.println("Please provide a name.");
            return;
        }
        
        // Extract the name and print the welcome message
        String name = args[0];
        System.out.println("Welcome " + name);
    }
}