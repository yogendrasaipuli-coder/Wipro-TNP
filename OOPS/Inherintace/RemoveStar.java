import java.util.Scanner;

public class RemoveStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        int index = str.indexOf('*');
        
        // Check if the star character exists
        if (index != -1) {
            // Check boundaries so you don't go out of bounds at the start or end
            int startIndex = Math.max(0, index - 1);
            int endIndex = Math.min(str.length(), index + 2);
            
            String result = str.substring(0, startIndex) + str.substring(endIndex);
            System.out.println("Result: " + result);
        } else {
            // If there's no star, just print the original string
            System.out.println("Result: " + str);
        }
        
        sc.close();
    }
}