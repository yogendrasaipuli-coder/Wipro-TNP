package practice;

public class InterestCalculator {
    public static void main(String[] args) {
        // Check if both gender and age are provided
        if (args.length < 2) {
            System.out.println("Please provide Gender and Age as arguments.");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        // Logic for Female
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("The percentage of interest is 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The percentage of interest is 9.2%");
            }
        } 
        // Logic for Male
        else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("The percentage of interest is 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("The percentage of interest is 10.5%");
            }
        } else {
            System.out.println("Invalid Gender entered.");
        }
    }
}