package practice;

public class AsciiToChar {
    public static void main(String[] args) {
        // An array initialized with integer ASCII values
        int[] asciiCodes = {65, 66, 67, 120, 121, 122};
        
        // Loop and print the corresponding character values side by side
        for (int i = 0; i < asciiCodes.length; i++) {
            char character = (char) asciiCodes[i];
            System.out.print(character + " ");
        }
        System.out.println(); // Clear to a new line
    }
}