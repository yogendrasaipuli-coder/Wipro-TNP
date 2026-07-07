package practice;

public class CaseConverter {
    public static void main(String[] args) {
        // Change this variable to test different inputs (e.g., 'a' or 'A')
        char ch = 'a'; 

        // Check if the character is lowercase
        if (ch >= 'a' && ch <= 'z') {
            char upperCh = Character.toUpperCase(ch);
            System.out.println(ch + "->" + upperCh);
        } 
        // Check if the character is uppercase
        else if (ch >= 'A' && ch <= 'Z') {
            char lowerCh = Character.toLowerCase(ch);
            System.out.println(ch + "->" + lowerCh);
        }
    }
}