package practice;

public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // Create a new array holding the index 1 element of both arrays
        int[] result = { a[1], b[1] };

        // Print the formatted output
        System.out.println("O/P: [" + result[0] + ", " + result[1] + "]");
    }
}