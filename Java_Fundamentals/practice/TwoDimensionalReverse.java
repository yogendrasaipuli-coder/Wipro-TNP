package practice;

public class TwoDimensionalReverse {
    public static void main(String[] args) {
        // Validate that exactly 4 numbers are provided
        if (args.length < 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        try {
            // Parse arguments into a 2x2 matrix
            int[][] matrix = new int[2][2];
            matrix[0][0] = Integer.parseInt(args[0]);
            matrix[0][1] = Integer.parseInt(args[1]);
            matrix[1][0] = Integer.parseInt(args[2]);
            matrix[1][1] = Integer.parseInt(args[3]);

            System.out.println("The given array is :");
            System.out.println(matrix[0][0] + " " + matrix[0][1]);
            System.out.println(matrix[1][0] + " " + matrix[1][1]);

            // Print the array reversed completely
            System.out.println("The reverse of the array is :");
            System.out.println(matrix[1][1] + " " + matrix[1][0]);
            System.out.println(matrix[0][1] + " " + matrix[0][0]);

        } catch (NumberFormatException e) {
            System.out.println("Please ensure all 4 inputs are valid integers.");
        }
    }
}