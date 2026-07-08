package practice;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        // Initialize two character variables to test (e.g., 's' and 'e')
        char ch1 = 's';
        char ch2 = 'e';

        // Compare their numerical values to see which comes first
        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }
    }
}