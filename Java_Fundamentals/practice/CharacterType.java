package practice;

public class CharacterType {
    public static void main(String[] args) {
        // Change this character to test (e.g., 'a', '5', or '*')
        char ch = '8'; 

        // Check if it's an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } 
        // Check if it's a digit
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        // Otherwise, it's a special character
        else {
            System.out.println("Special Character");
        }
    }
}