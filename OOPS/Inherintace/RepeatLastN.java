import java.util.Scanner;

public class RepeatLastN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = sc.next();
        
        System.out.print("Enter number of repetitions: ");
        int n = sc.nextInt();
        
        // Safety Check: ensure 'n' doesn't exceed string length
        if (n >= 0 && n <= str.length()) {
            String last = str.substring(str.length() - n);
            
            // Loop runs 'n' times to print the substring
            for (int i = 0; i < n; i++) {
                System.out.print(last);
            }
            System.out.println(); // Prints a clean new line at the end
        } else {
            System.out.println("Error: 'n' cannot be greater than the string length.");
        }
        
        sc.close();
    }
}